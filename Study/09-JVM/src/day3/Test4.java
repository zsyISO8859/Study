package day3;

/**
 * @author : zhousy
 * @date : 2022/10/20 11:11
 * @version : 1.0
 */

/**
 * 类加载与字节码技术
 *
 * 1.类文件结构
 * 2.字节码指令
 * 3.编译期处理
 * 4.类加载阶段
 *   4.1加载
 *      通过类加载器将类的字节码载入方法区中，底层采用C++的数据结构(instanceKlass)描述java类，java无法直接访问它，中间需要进行一个转换，它重要的field有：
 *         _java_mirror即java的类镜像，例如对String来说，就是String.class，作用是把instanceKlass暴露给java使用，
 *              String.class 和instanceKlass互相持有指针，可以通过String.class访问到instanceKlass获取到String.class的方法成员变量。。。。
 *         _super父类 _fields成员变量 _methods方法 _constants常量池 _class_loader类加载器 _vtable虚方法表 _itable接口方法表
 *      如果这个类还有父类没有加载，先加载父类
 *      加载和链接可能交替运行
 *
 *      实例对象和类对象和instanceKlass之间的关系：
 *      instanceKlass被加载到方法区(元空间Metaspace)，同时在堆内存产生java mirror镜像(例Person.class)和元空间的instanceKlass相互持有内存地址，
 *          如果new Person，每个实例都有对象头16字节，其中8字节对应对象的class地址，如果想通过这个对象实例获取class信息，就可以访问对象的对象头的class
 *          地址，通过这个地址找到java mirror(Person.class)再通过java mirror找到元空间的instanceKlass就可以获取类信息）
 *
 *   4.2链接
 *      1. 验证阶段：验证类是否符合JVM规范，安全性检查
 *      2. 准备阶段：为static变量分配空间，设置默认值
 *                 static变量在JDK7之前存储于instanceKlass末尾，从jdk7开始，存储于_java_mirror末尾
 *                 static变量分配空间和赋值是2个步骤，分配空间在准备阶段完成，赋值在初始化阶段完成
 *                 如果static变量是final的基本类型以及字符串常量，那编译阶段值就确定了，赋值在准备阶段完成
 *                 如果static变量是final的引用类型，那么赋值也会在初始化阶段完成
 *      3. 解析阶段：将常量池的符号引用(未经过解析的类，仅仅是个符号，不知道在内存中的位置)解析为直接引用(知道了类的在内存中的地址)
 *                 例子：使用类加载器loadClass加载类，只会导致类的加载，并不会导致类的解析和初始化，new类会让类加载解析初始化，
 *   4.3初始化
 *      初始化即调用<cinit>()V方法，虚拟机会保证这个类的【构造方法】的线程安全
 *      导致初始化的时机：
 *             main方法所在类
 *             首次访问类的静态变量或者方法
 *             子类初始化，如果父类还没初始化
 *             子类访问父类的静态变量只会触发父类初始化
 *             Class.forName
 *             new
 *       不会导致初始化：
 *              访问类的static final静态常量(基本类型和字符串)不会触发初始化
 *              类对象.class
 *              创建类的数组
 *              类加载器的loadClass方法
 *              Class.forName的第二个参数为false
 *
 *       *静态匿名内部类在初始化的时候，它的静态代码块和静态变量赋值的操作是由类加载器保证它的线程安全的。
 * 5.类加载器
 * 6.运行期优化
 * */
public class Test4 {
    static int a;
    static int b = 10;
    static final int c = 20;
    static final Object o = new Object();
    static Integer d = 12;

    public static void main(String[] args) {
        System.out.println(BB.asd);
    }

}

class AA {
    static Integer a;

    static {
        System.out.println("AA");
    }
}

class BB extends AA {
    static final int asd = 12;

    static {
        System.out.println("BB");
    }
}
