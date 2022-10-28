package proxy3.staticproxy;

/**
 * @author : zhousy
 * @date : 2022/10/27 17:35
 * @version : 1.0
 */

/**
 * 静态代理：
 *    代理对象和被代理对象一起实现相同的接口或者是继承相同的父类，然后通过调用相同的方法来调用目标对象的方法。
 *    优点：可以在不修改目标对象的前提下对目标对象的功能进行扩展。
 *    缺点：代理对象需要和目标对象实现一样的接口，所以会有很多代理类
 *         一旦接口增加方法，目标对象与代理对象都需要维护。
 */
public class Client_enter {
    public static void main(String[] args) {
        //接口实现类
        TeacherDao teacherDao = new TeacherDao();
        //代理类
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理类调用接口实现类
        teacherDaoProxy.teach();
    }
}
