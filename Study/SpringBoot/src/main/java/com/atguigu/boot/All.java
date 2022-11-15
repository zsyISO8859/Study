package com.atguigu.boot;

/**
 * @author : zhousy
 * @date : 2022/11/3 17:05
 * @version : 1.0
 */

/**
 * springboot有什么优点？
 *      1、springboot能够快速的创建独立运行的spring项目；
 *      2、应用可以直接打成jar包，使用java -jar运行；
 *      3、自动配置，简化开发，也支持修改；
 *      4、使用JavaConfig有助于避免使用XML；
 *      5、依赖管理，避免大量的Maven导入和各种版本冲突。
 *      6、方便测试，自动集成了junit5，以前还需要写一堆的注解比如@runwith加载springapplication现在很方便 【具体看测试目录】
 *      7、每一个微服务在云上部署以后，需要对其监控、追踪、审计、控制，springboot抽取了actuator(IQ揣特)场景，引用就可以获得生产级别的监控审计等功能。
 *             - 最常用的Endpoint端点  ● Health：监控状况  ● Metrics：运行时指标  ●Loggers：日志记录
 *             - 如何定制endpoint、Metrics、info、Health？
 *
 * springboot2有什么新功能？
 *      1.@Configuration的Full和Lite模式
 *             Full：@Configuration(proxyBeanMethods=true)保证每个@Bean调用多少次返回的组件都是单例的
 *             Lite：@Configuration(proxyBeanMethods=false)保证每个@Bean调用多少次返回的组件都是新创建的
 *          实战：配置类之间无依赖关系用Lite模式加速容器启动过程，减少判断(不会检查这个组件在容器中有没有，所以boot运行起来就快)。
 *               配置类组件之间有依赖关系，方法被调用得到之前单例组件，用Full模式。
 *
 * 如何轻松做到将配置文件(application.properties)里的配置信息读到javaBean中？
 *      场景：在配置文件配置好数据库连接信息，然后javaBean读取这些信息创建数据库连接。
 *      方法一：在bean中加入2个注解@Component、@ConfigurationProperties(prefix = "mycar")，然后在javaBean中使用@Autowired注入
 *      方法二：在bean中加入1个注解@ConfigurationProperties(prefix = "mycar")再在javaConfig配置文件中
 *                加入@EnableConfigurationProperties(Car.class)注解，最后在javaBean中使用@Autowired注入
 *      *方法2适用于Bean用的是第三方的Bean，因为第三方Bean类可能没有@Component注解，我们无法修改源码，所以只能用第二种方法。
 *
 * springboot如何进行环境切换？
 *   激活指定prod环境有2种方法：
 *      配置文件激活：在默认配置文件application.yaml中配置 spring.profiles.active=prod
 *      命令行激活： java -jar xxx.jar --spring.profiles.active=prod
 *
 *   *修改配置文件的任意值，命令行优先。
 *   *指定环境配置文件 application-{env}.yaml
 *   *同名配置项，profile配置优先，即{env}优先
 */
public class All {
}
