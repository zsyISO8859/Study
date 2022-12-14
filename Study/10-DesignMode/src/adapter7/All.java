package adapter7;

/**
 * @author : zhousy
 * @date : 2022/11/1 11:10
 * @version : 1.0
 */

/**
 * 适配器模式：
 *    Adapter类，通过继承src类，实现dst(目标)接口，完成src->dst的适配。
 *    类适配器模式：
 *        java是单继承机制，所以类适配器需要继承src算是一个缺点，因为这要求dst必须是接口，有一定局限性。
 *        src类的方法在adapter中都会暴露出来，增加了使用成本。
 *        由于继承src类，所以可以根据需求重写src类方法，使得adapter的灵活性增强。
 *
 *    对象适配器：
 *       基本思路和类适配器一样，只是适配器不继承src类而是持有实例
 *       根据 合成复用原则 在系统中尽量把继承关系替代为关联关系
 *       对象适配器是适配器中常见的一种
 *       对象适配器的注意事项：
 *           对象适配器和类适配器的思想是一样的，只是实现方式不同，根据 合成复用原则把继承关系转为组合关系，不需要目标dst必须是接口了
 *           使用成本更低，更灵活。
 *
 *    接口适配器：
 *       也叫缺省适配器，当不需要全部实现接口的方法的时候，可以设计一个抽象类(适配器)实现接口，并给每一个接口方法提供默认实现即空方法。
 *          该抽象类的子类可以有选择的覆盖父类中的某些方法来实现需求。
 *       适用于：一个接口不想使用其所有的方法的情况。
 *
 *    适配器的核心思想：
 *        可以看到处理器(Controller子类)有多种实现方式，如果要直接调用Controller方法，就得在doDispatch方法中用if else
 *        来判断需要调用哪个Controller，这样违背了ocp原则，因为如果增加controller就得修改doDispatch。所以引入适配器，使得每一种
 *        controller有一种适配器实现类，适配器代替controller执行相应得方法，这时候如果要扩展controller就无需该doDispatch方法得代码
 *        只需要增加controller得同时增加一个适配器即可。
 *
 *    说说适配器在项目中的运用？
 *        springmvc的HandlerAdapter就使用了适配器的模式。
 *        它会在getHandlerAdapter方法中遍历适配器并通过适配器的support方法确定使用哪个适配器。
 *        最后再调用适配器的handle方法对handler(Controller)进行处理
 *
 *
 */
public class All {

}
