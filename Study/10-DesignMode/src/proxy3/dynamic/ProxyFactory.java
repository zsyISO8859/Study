package proxy3.dynamic;


import java.lang.reflect.Proxy;

/**
 * @author : zhousy
 * @date : 2022/10/28 9:22
 * @version : 1.0
 */


public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object obj) {
        this.target = obj;
    }

    public Object GetProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("jdk代理开始。。");
                    Object invoke = method.invoke(target, args);
                    System.out.println("jdk代理结束。。");
                    return invoke;
                });
    }
}
