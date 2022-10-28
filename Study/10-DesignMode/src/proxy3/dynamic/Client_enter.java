package proxy3.dynamic;

/**
 * @author : zhousy
 * @date : 2022/10/28 9:33
 * @version : 1.0
 */

/**
 * 动态代理：jdk代理、接口代理
 *    代理对象不需要实现接口，但是目标对象需要实现接口。
 *    代理对象的生成是利用JDK的API，动态在内存种构建对象。
 * 实现步骤：
 *    JDK代理类需要使用Proxy.newProxyInstance(类加载器，类接口，InvocationHandler处理调用)
 *
 */
public class Client_enter {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao o = (ITeacherDao) proxyFactory.GetProxyInstance();
        String word = o.teach("郑泳棚");
        System.out.println(word);

    }
}
