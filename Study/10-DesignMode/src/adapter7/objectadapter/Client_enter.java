package adapter7.objectadapter;

/**
 * @author : zhousy
 * @date : 2022/11/1 10:16
 * @version : 1.0
 */

/**
 * 适配器模式：
 *    Adapter类，通过继承src类，实现dst(目标)接口，完成src->dst的适配。
 *    类适配器模式：
 *        java是单继承机制，所以类适配器需要继承src算是一个缺点，因为这要求dst必须是接口，有一定局限性。
 *        src类的方法在adapter中都会暴露出来，增加了使用成本。
 *        由于继承src类，所以可以根据需求重写src类方法，使得adapter的灵活性增强。
 */
public class Client_enter {
    public static void main(String[] args) {
        System.out.println("==========对象适配器==========");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
