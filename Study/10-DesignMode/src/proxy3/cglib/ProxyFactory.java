package proxy3.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author : zhousy
 * @date : 2022/10/28 9:54
 * @version : 1.0
 */


public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((InvocationHandler) (proxy, method, args) -> {
            System.out.println("cglib代理开始。。");
            Object invoke = method.invoke(target, args);
            System.out.println("cglib代理结束。。");
            return invoke;
        });
        return enhancer.create();
    }
}
