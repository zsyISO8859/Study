package template4;

/**
 * @author : zhousy
 * @date : 2022/10/28 14:40
 * @version : 1.0
 */

/**
 *  模板方法：
 *     AbstractClass抽象父类，类中定义了final的模板方法template，定义了算法的骨架，具体子类实现其中的抽象方法。
 *
 *  模板方法的钩子方法：
 *     模板方法的父类中，可以定义一个方法默认不做任何事，子类可以视情况要不要覆盖它，该方法称为钩子。
 *
 *  模板方法注意事项和细节：
 *     基本思想：算法只存在父类中，容易修改，实现代码的最大复用。既统一了算法(父类固定算法)，又提供了很大的灵活性(由子类提供实现)。
 *     不足之处：每个不同实现都需要一个子类，导致类的数量增加
 *     注意：   一般模板方法都加上final 防止子类重写。
 *     使用场景：当需要完成某个过程需要进行一系列的步骤，但是步骤基本相同，但其个别步骤实现可能不同。通常考虑模板方法处理
 */
public class Client_enter {
    public static void main(String[] args) {
        System.out.println("[ 制作红色豆浆 ]");
        SoyaMilk soyaMilk = new RedSoyaMilk();
        soyaMilk.template();
        System.out.println("-------------------------------------");
        System.out.println("[ 制作黄色豆浆 ]");
        SoyaMilk soyaMilk1 = new YellowSoyaMilk();
        soyaMilk1.template();
    }
}
