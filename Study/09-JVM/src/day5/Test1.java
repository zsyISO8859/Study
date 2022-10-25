package day5;

/**
 * @author : zhousy
 * @date : 2022/10/24 16:25
 * @version : 1.0
 */

import org.junit.Test;

/**
 * 内存模型(JMM)：
 *    JMM定义了一套在多线程读写共享数据时（成员变量、数组），对数据的可见性、有序性和原子性的规则和保障
 *
 *    volatile关键字：
 *      它可以用来修饰成员变量和静态成员变量，可以避免直接从工作高速缓存中查找变量的值，必须到主内存获取它的值
 *      volatile关键字保证可见性但是不保证原子性
 *      适用于一个线程写多个线程读的场景
 *      synchronized既可以保证可见性也可以保证原子性，但是性能低
 *      volatile关键字也可以保证有序性(多线程情况下JIT在编译时候会进行一些优化即指令重排[调整指令的先后顺序]造成指令无序)
 *
 *    举例指令重排情况：
 *      单例懒汉式的双重检查锁的第二重检查中 INSTANCE = new Singleton，而这行代码在多线程的情况下就可能导致指令重排，
 *      new Singleton的字节码指令为：1new 2dup 3invokespecial 4putstatic ，3和4就可能发生指令重排，比如第一个线程在将
 *      引用地址赋值给静态变量INSTANCE后另一个线程抢占资源了，这时候还没有执行3的init构造方法，此时如果init中有许多业务
 *      逻辑，这时候第二个线程拿到的对象可能就会有问题。所以INSTANCE使用volatile修饰就可以保证有序性。
 *
 *
 */
public class Test1 {
    static boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        //此例子演示多线程情况下共享数据可见性问题
        //   t线程刚开始从主内存读取run的值
        //   因为t线程频繁读取run值，所以JIT编译器会将run的值缓存到t线程自己工作内存中的高速缓存中，减少对主内存中run的访问
        //   由于1秒后虽然main线程需改run值同步到主内存，但是t是从自己的高速缓存中读取这个变量值，所以结果还是旧值。
        Thread t = new Thread(() -> {
            while (run) {
                //如果当前的循环中包含synchronized关键字也会强制当前线程直接从主内存中读取变量，从而避免JIT的优化
                //System.out.println(1);
            }
        });
        t.start();
        Thread.sleep(1000);
        run = false;
    }
}
