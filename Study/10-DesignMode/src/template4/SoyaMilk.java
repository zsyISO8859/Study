package template4;

/**
 * @author : zhousy
 * @date : 2022/10/28 14:42
 * @version : 1.0
 */


public abstract class SoyaMilk {
    public final void template() {
        select();
        if (isSelect()) add();
        soak();
        breakAll();
    }

    private void select() {
        System.out.println("加入黄豆粉。。。");
    }

    //添加配料抽象方法由子类实现。
    public abstract void add();

    private void soak() {
        System.out.println("浸泡中。。。");
    }

    private void breakAll() {
        System.out.println("搅拌。。。");
    }

    //钩子方法
    public boolean isSelect() {
        return true;
    }
}
