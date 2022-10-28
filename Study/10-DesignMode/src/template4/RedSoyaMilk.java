package template4;

/**
 * @author : zhousy
 * @date : 2022/10/28 14:47
 * @version : 1.0
 */


public class RedSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        System.out.println("加入红色素。。。");
    }

    @Override
    public boolean isSelect() {
        return false;
    }
}
