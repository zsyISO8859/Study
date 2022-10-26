package singleton;

/**
 * @author : zhousy
 * @date : 2022/10/26 14:14
 * @version : 1.0
 */

/**
 * 懒汉式单例：
 *    优点：线程安全、延迟加载、效率高、开发中推荐使用
 *    缺点：无
 */
public class Test2 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton2 {
    private Singleton2() {
    }

    private static volatile Singleton2 INSTANCE = null;

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
}
