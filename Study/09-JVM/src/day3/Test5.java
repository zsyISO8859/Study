package day3;

/**
 * @author : zhousy
 * @date : 2022/10/20 17:09
 * @version : 1.0
 */

/**
 * 类加载与字节码技术
 *
 * 1.类文件结构
 * 2.字节码指令
 * 3.编译期处理
 * 4.类加载阶段
 * 5.类加载器
 *   名称                                                  加载哪的类                   说明
 *   Bootstrap ClassLoader      启动类加载器                JAVA_HOME/jre/lib          无法直接访问
 *   Extension ClassLoader      扩展类加载器                JAVA_HOME/jre/lib/ext      上级为Bootstrap ，显示为null
 *   Application ClassLoader    应用类加载器                classpath                  上级为Extension
 *   自定义类加载器                                         自定义                      上级为Application
 *
 *   双亲委派类加载模式：其实就是一种类加载规则，下级委派上级优先做类的加载，上级没有再由本级的类加载器加载。源码分析：
 *                   1.检查该类是否已经加载，如果未加载并且有上级类加载器，委派上级加载类查找并加载此类
 *                   2.如果没有上级类加载器，就委派BootstrapClassLoader查找且加载类
 *                   3.如果BootstrapClassLoader也找不到该类就本类加载器加载(如果是扩展类加载器就去ext目录下找类
 *                     如果是应用类加载器就去classpath目录下找类)
 *
 *      *优先级：Bootstrap>Extension>Application (假如一个类同时放在扩展类加载器加载的路径下和Application加载器加载的
 *          路径下 最后加载的是Extension路径下的类)
 *      *打jar包： jar -cvf my.jar Test5
 *      *classpath指的是WEB—INF/classes,lib  lib和classes同属于classpath 优先级lib>classes   WEB-INF/是资源目录
 *
 *      线程上下文类加载器：通过线程来获取的类加载器Thread.currentThread().getContextClassLoader()
 *                      默认是应用类加载器
 *                      每个线程启动的时候，jvm默认把应用类加载器赋值给当前线程
 *
 *      SPI(Service Provider Interface)： 为API接口寻找服务实现
 *          例：定义human接口和2个实现类man、woman ；在resources目录下新建META-INF/services目录；
 *             在这个目录下新建一个与上述human接口的全限定名一致的文件，并在这个文件中写入接口的实现类(man、woman)的全限定名；
 *             通过serviceLoader加载实现类并调用：
 *             ServiceLoader<human> test = ServiceLoader.load(human.class);
 *             for (human u : test) {
 *                  u.eat();
 *             }
 *
 *      自定义类加载器：
 *          什么时候需要自定义类加载器：
 *              1. 想要加载非classpath随意路径中的类文件
 *              2. 都是通过接口来使用实现，希望解耦的时候，常用于框架设计
 *              3. 不同应用的同名类都可以加载，不冲突，常用于tomcat容器
 *          如何实现：
 *              1. 继承ClassLoader父类
 *              2. 重写findClass方法(因为重写findClass方法才会委托上级优先加载类，遵循双亲委派机制)
 *                    注意不是重写loadClass，否则不会走双亲委派机制
 *              3. 读取类文件的字节码
 *              4. 调用父类的defineClass方法来加载类
 *              5.使用者调用该类加载器的loadClass方法
 *
 *
 * 6.运行期优化
 * */
public class Test5 {
    public static void main(String[] args) {
        Class<Test5> test5Class = Test5.class;
        System.out.println(test5Class.getClassLoader().getParent());

    }
}

interface human{
    void save();
}

class man implements human {
    @Override
    public void save() {
        System.out.println("man save...");
    }
}

class woman implements human{
    @Override
    public void save() {
        System.out.println("woman save...");
    }
}
