package com.atguigu.boot;

/**
 * @author : zhousy
 * @date : 2022/11/3 17:05
 * @version : 1.0
 */

/**
 * springboot注解：
 *       @Import({User.class,DBHelper.class}) :给容器中自动创建出两个类型的组件    [类]
 *       @ConditionOnBean(name="tom") : 如果当前容器中有tom这个组件，就装配当前组件。 [方法、类]
 *       @ImportResource("classpath:beans.xml") :导入xml中的组件(Bean)       [类]
 *       @Configuration(proxyBeanMethods=true) :保证每个@Bean调用多少次返回的组件都是单例的  [类]
 *
 * @RequestBody 作用：
 *      获取请求体，即表单提交的全部内容。  [方法参数]
 * @RequestAttribute("msg") 作用：
 *      获取request域中存储的数据，一般用于请求转发的场景。  [方法参数]
 *
 */
public class All1 {
}
