package adapter.classadapter;

/**
 * @author : zhousy
 * @date : 2022/11/1 10:16
 * @version : 1.0
 */

public class Client_enter {
    public static void main(String[] args) {
        System.out.println("==========类适配器==========");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

    }
}
