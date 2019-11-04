package ice.spring.core;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ice
 * @date 19-6-27
 */
public class PersonInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before execute");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after execute");
        return result;
    }
}
