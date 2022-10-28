package singleton1;

/**
 * @author : zhousy
 * @date : 2022/10/26 11:41
 * @version : 1.0
 */

import java.text.ParseException;

/**
 * 单例模式是什么？
 *    采取一定的方法保证整个软件系统中，对某个类只能存在一个对象实例。
 *
 * 单例应用场景：
 *    网站计数器、多线程的线程池、数据库连接池、任务管理器、回收站
 *
 * 饿汉式单例:
 *    优点：写法简单，类装载的时候就完成实例化，避免多线程问题。
 *    缺点：每次类加载的时候就完成实例化，没有达到懒加载效果，如果一直未使用过该实例，就会造成内存浪费。
 *
 *    java.lang.RunTime就是使用饿汉式单例实现
 */
public class Test1 {
    public static void main(String[] args) throws ParseException {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);

    }
}

class Singleton1 {
    private static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
