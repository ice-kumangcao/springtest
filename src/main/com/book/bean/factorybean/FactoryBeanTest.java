package book.bean.factorybean;

import book.bean.beantest.MyTestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * @author ice
 * @date 19-8-13
 */
public class FactoryBeanTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("book/bean/factorybean/factorybean.xml");

        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Car car = (Car) beanFactory.getBean("cars");
        System.out.println(car.getBrand());
    }
}
