package adapter.objectadapter;

/**
 * @author : zhousy
 * @date : 2022/11/1 10:18
 * @version : 1.0
 */


public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        if (voltage220V != null) {
            int i = voltage220V.output220V();
            int num = i / 44;
            System.out.println("对象适配器转换220v为" + num + "V");
            return num;
        }

        return 0;
    }
}
