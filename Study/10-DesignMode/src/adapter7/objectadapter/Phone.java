package adapter7.objectadapter;

/**
 * @author : zhousy
 * @date : 2022/11/1 10:17
 * @version : 1.0
 */


public class Phone {
    void charging(Voltage5V voltage5V) {
        int i = voltage5V.output5V();
        if (i < 6) {
            System.out.println("充电成功");
        } else if (i < 14) {
            System.out.println("充电失败");
        }
    }
}
