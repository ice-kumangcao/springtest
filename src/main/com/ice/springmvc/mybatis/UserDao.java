package ice.springmvc.mybatis;

import org.apache.ibatis.annotations.Flush;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ice
 * @date 19-1-21 上午11:21
 */
@Mapper
public interface UserDao {

    /**
     * 根据id获取user
     * @param id id
     * @return user
     */
    User findById(int id);

    /**
     * 执行SqlSession的flush方法
     */
    @Flush
    void flush();

    /**
     * 测试Java8的default方法
     */
    default void testDefault() {
        System.out.println("UserDao.testDefault()");
    }
}
