package book.bean.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ice
 * @date 19-8-7
 */
public class TestLookUpMethod {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("book/bean/lookupmethod/lookupTest.xml");
        GetBeanTest getBeanTest = GetBeanTest.class.cast(applicationContext.getBean("getBeanTest"));
        getBeanTest.showMe();
    }
}
