import ice.spring.bean.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.io.ClassPathResource;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * @author ice
 * @date 18-12-27 下午3:42
 */
public class SpringTest {

    @Test
    public void test() {
        BeanFactory beanFactory;
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) ctx.getBean("person");


        System.out.println(person);
        person.walk();

        Person person1 = (Person) ctx.getBeanFactory().getSingleton("person");

        if (person == person1) {
            System.out.println("sington");
        }
        ctx.close();

        FactoryBean factoryBean;
    }

    /**
     * jdk1.8
     * idea 编译级别 > 8
     * Java Compiler添加 -parameters 才能出现参数名称
     * asm 不需要配置
     *
     * @throws Exception
     */
    @Test
    public void testAsm() throws Exception {
        LocalVariableTableParameterNameDiscoverer discoverer =
                new LocalVariableTableParameterNameDiscoverer();
        Class<?> personClass = Class.forName(Person.class.getName());
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            String argNameAsm = "";
            String argNameJdk = "";
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                argNameJdk += (parameter.getName() + ",");
            }
            String[] parameterNames = discoverer.getParameterNames(constructor);
            for (String parameterName : parameterNames) {
                argNameAsm += (parameterName + ",");
            }
            System.out.println("asm:" + constructor.getName() + " : " + argNameAsm);
            System.out.println("jdk:" + constructor.getName() + " : " + argNameJdk);
        }
    }

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanReader = new XmlBeanDefinitionReader(beanFactory);
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");

        xmlBeanReader.loadBeanDefinitions(resource);
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person.getName());
    }
}
