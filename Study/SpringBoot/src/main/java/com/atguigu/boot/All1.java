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
 *
 * junit5的使用：
 *     简单断言 【详情看test类】
 *     断言Assertions(不满足于某个断言会使得测试失败。)
 *     前置条件assumptions
 *     嵌套测试@Nested(内层可以驱动外层测试  反之不可以)
 *     *参数化测试@ParameterizedTest(可以使用用不同的参数多次运行测试)
 *          @ValueSource 支持八大基础类以及String类型, Class类型
 *          @NullSource 表示为参数化测试提供一个null的入参
 *          @MethodSource 指定方法的返回值作为参数化测试入参(注意方法返回需要是一个流)
 *
 */
public class All1 {
}
