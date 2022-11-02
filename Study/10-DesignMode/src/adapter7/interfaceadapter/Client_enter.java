package adapter7.interfaceadapter;

/**
 * @author : zhousy
 * @date : 2022/11/1 11:34
 * @version : 1.0
 */


public class Client_enter {
    public static void main(String[] args) {
        InterfaceAdapter method = new InterfaceAdapter() {

            @Override
            public void m2() {
                System.out.println("只想覆盖接口的m2方法");
            }

        };
        method.m2();

    }
}
