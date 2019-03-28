import ice.spring.bean.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ice
 * @date 18-12-27 下午3:42
 */
public class SpringTest {

    @Test
    public void test() {
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
}
