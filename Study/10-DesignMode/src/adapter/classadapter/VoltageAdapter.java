package adapter.classadapter;

/**
 * @author : zhousy
 * @date : 2022/11/1 10:18
 * @version : 1.0
 */


public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int i = output220V();
        int num = i / 44;
        System.out.println("类适配器转换220v为" + num + "V");
        return num;
    }
}
