package singleton;

/**
 * @author : zhousy
 * @date : 2022/10/26 14:25
 * @version : 1.0
 */

/**
 * 静态内部类单例：
 *    优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高。推荐使用
 *    缺点：无
 */
public class Test3 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton3 {

    private Singleton3() {
    }

    static class InitSingleton3 {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return InitSingleton3.INSTANCE;
    }

}