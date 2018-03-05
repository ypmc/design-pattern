package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Test
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy");
        return method.invoke(obj, args);
    }
}
