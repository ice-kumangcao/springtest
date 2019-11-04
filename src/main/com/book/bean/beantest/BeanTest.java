package book.bean.beantest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * @author ice
 * @date 19-8-6
 */
public class BeanTest {

    @Test
    public void testSimpleLoad() throws Exception{
        System.setProperty("spring.profiles.active", "dev");
        String config = "book/bean/beantest/beanFactoryTest.xml";
        Resource resource = new ClassPathResource(config);
        InputStream inputStream = resource.getInputStream();
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
        System.out.println("testStr".equals(myTestBean.getTestStr()));
    }
}
