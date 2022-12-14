/**
 * @author : zhousy
 * @date : 2022/10/26 10:55
 * @version : 1.0
 */

/**
 * 什么是设计模式？
 *    设计模式是一套被反复使用、多人知晓的、经过分类编目的、是代码设计经验的总结。
 *    使用设计模式可以提高代码的复用性、扩展性。
 *
 * 设计模式的分类：
 *    创建型模式：单例模式、工厂方法模式、抽象工厂模式          原型模式、建造者模式
 *    结构型模式：代理模式、适配器模式                    装饰模式、桥接模式、组合模式、外观模式、享元模式
 *    行为型模式：观察者模式、职责链模式、模板方法模式       迭代器模式、命令模式、中介者模式、备忘录模式、解释器模式、状态模式、策略模式、访问者模式。
 *
 * UML类图基础：
 *    -length:double    对应 属性:类型
 *    +getArea():double 对应 方法:返回值
 *    圆圈代表接口
 *    虚线三角形箭头表示实现(箭头的一方代表接口，线的一方代表实现类)
 *    实线三角形箭头表示继承
 *    虚线>箭头表示依赖(表示左边类用到了右边类)
 *    实线实心<>表示聚合 整体和部分的关系，关系较弱，比如人和手机  A对象有属性是对象B，A创建了对象但是B不会随着A创建而创建
 *    实线空心<>表示组合 整体和部分的关系，关系密切，比如人和灵魂  A对象有属性是对象B，A创建了对象B就会创建，A消亡B也会消亡
 *
 * 设计模式6大原则
 *    单一原则： 一个类或者方法只有一项职责。
 *    里氏替换原则：子类可以扩展父类的功能，但不能改变原有父类的功能。
 *    依赖倒置原则： 面向接口编程。(程序要依赖于抽象接口，不要依赖于具体实现。这样就降低了客户与实现模块间的耦合。)
 *    接口隔离原则： 建立单一接口，复杂的接口，根据业务拆分成多个简单接口。
 *    迪米特原则： 最少知道原则，尽量降低类与类之间的耦合。
 *    开闭原则： 用抽象构建架构，用实现扩展。
 *
 *
 *
 */
public class All {
}
