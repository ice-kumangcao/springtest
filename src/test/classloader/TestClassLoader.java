package classloader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ice
 * @date 19-5-21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mvc.xml"})
public class TestClassLoader {

    @Test
    public void test() {
        this.getClass().getClassLoader().getResource("");
        System.out.println(System.getProperty("java.ext.dirs"));
    }

    @Test
    public void test2() {
        System.out.println(System.getProperty("java.class.path"));
    }
}
