package singleton;

/**
 * @author : zhousy
 * @date : 2022/10/26 15:02
 * @version : 1.0
 */

/**
 * 枚举方式实现单例：
 *    优点：使用枚举实现单例模式，能避免多线程问题，还可以防止反序列化重写创建对象。强烈推荐使用
 *    缺点：无
 */
public class Test4 {
    public static void main(String[] args) {
        User user = Singleton4.INSTANCE.getUser();
        User user1 = Singleton4.INSTANCE.getUser();
        System.out.println(user == user1);
    }
}

enum Singleton4 {
    INSTANCE;
    private User user = null;

    Singleton4() {
        user = new User();
    }

    public User getUser(){
        return user;
    }
}

class User {
    private String name;
}
