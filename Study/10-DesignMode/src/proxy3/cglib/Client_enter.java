package proxy3.cglib;

/**
 * @author : zhousy
 * @date : 2022/10/28 10:09
 * @version : 1.0
 */

/**
 * 动态代理：cglib
 *    静态代理和jdk代理都要求目标对象实现一个接口。cglib代理无需目标对象实现接口。
 *    cglib代理也叫做子类代理，它是在内存中构建一个子类对象从而实现对目标对象功能的扩展。
 *    cglib代理被许多AOP框架使用比如Spring AOP实现方法拦截。
 *    注意代理类不能是final的否则会报错IllegalArgumentException
 *    目标方法如果是final/static，那么方法就不会被拦截,即不会执行目标对象[额外]的业务方法
 */
public class Client_enter {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
        String zyp = proxyInstance.teach("zyp");
        System.out.println(zyp);

    }
}
