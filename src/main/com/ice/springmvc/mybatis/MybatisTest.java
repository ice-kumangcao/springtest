package ice.springmvc.mybatis;

import org.apache.ibatis.binding.MapperProxy;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * debug mybatis
 * @author ice
 * @date 18-12-28 上午10:41
 */
public class MybatisTest {

    public static void main(String[] args) {
        InputStream mybatisConfig = MybatisTest.class
                .getClassLoader()
                .getResourceAsStream("ice/springmvc/mybatis/mybatis.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =
                new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(mybatisConfig);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        System.out.println(userDao.getClass());
        User user = userDao.findById(1);
        System.out.println("查询：" + user.getName());

        //userDao.flush();
        // debug测试缓存 测试一级缓存
        User user1 = userDao.findById(1);
        System.out.println("一级缓存：" + user1.getName());

        // entity 不实现 序列化 会报错
        sqlSession.close();

        // 二级缓存
        SqlSession secondSession = sqlSessionFactory.openSession();
        UserDao userDao1 = secondSession.getMapper(UserDao.class);

        // Java8中default方法
        userDao1.testDefault();

        User user2 = userDao1.findById(1);
        System.out.println("二级缓存" + user2.getName());
        secondSession.close();




    }
}
