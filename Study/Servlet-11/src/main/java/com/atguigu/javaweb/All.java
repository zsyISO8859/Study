package com.atguigu.javaweb;

/**
 * @author : zhousy
 * @date : 2022/11/2 9:38
 * @version : 1.0
 */

/**
 *
 * 简述servlet的生命周期？
 *        第一第二步是在第一次访问得时候创建Servlet程序会调用。
 *               1.执行Servlet构造方法
 *               2.执行init初始化方法
 *        第三步每次访问都会调用。
 *               3.执行service方法
 *        第四步，在web工程停止得时候调用
 *               4.执行destroy方法
 *
 *
 * ServletConfig类得三大作用？
 *        1.可以获取Servlet程序得别名servlet-name得值  (即xml中配置的 <servlet-name></servlet-name>)
 *        2.获取初始化参数init-param  (即xml中配置的 <init-param></init-param>)
 *        3.获取ServletContext对象
 *
 *
 * ServletContext是什么？
 *        1.是一个接口，它表示servlet上下文对象
 *        2.一个web工程只会有一个ServletContext对象实例。
 *        3.ServletContext对象是一个域对象(类似于map 这里得域指的是存储数据得范围是整个项目)
 *              方法：getAttribute setAttribute removeAttribute
 *        4.ServletContext类得四个作用：
 *              1.获取web.xml中配置的上下文参数context-param
 *              2.获取当前工程路径，格式：/工程路径
 *                             示例：/11_Servlet
 *                             调用方法： servletContext.getContextPath()
 *              3.获取工程部署后在服务器硬盘上的绝对路径
 *                             示例：C:\IDEAPro\Study\Servlet-11\target\Servlet-11-1.0-SNAPSHOT\
 *                             调用方法： servletContext.getRealPath("/")
 *                             项目部署后文件的存放规则：webapp改名字为当前项目名称，
 *                                 WEB-INF下生成classes文件夹存放java下的类文件编译文件和resource资源文件
 *              4.像Map一样存取数据。(全局可用)
 *                     调用方法：getAttribute setAttribute removeAttribute
 *
 *
 * 常见的响应码有哪些？
 *      200：请求成功
 *      302：表示请求重定向
 *      404：服务器已经收到请求，但是你要的资源不存在。
 *      500：服务器已经收到请求，但是服务器内部出错了(代码错误)。
 *
 *
 *  如何解决get请求中文乱码问题？
 *        第一种方法：  request.setCharacterEncoding("utf-8");
 *        第二种方法：  String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
 *  如何解决post请求中文乱码问题？
 *        在doPost方法中，使用req.setCharacterEncoding("UTF-8");设置请求体的字符集为UTF-8 (且在获取请求参数之前设置才生效)
 *  如何解决响应客户端中文乱码问题？
 *     第一种方法：(服务器端默认字符集为ISO-8859-1)
 *        resp.setCharacterEncoding("UTF-8") 设置服务器字符集为UTF-8
 *        resp.setHeader("Context-Type","text/html; charset=UTF-8")  通过响应头，设置浏览器也使用UTF-8字符集
 *     第二种方法：
 *        resp.setContextType("text/html; charset=UTF-8") 它会同时设置服务器和客户端都使用UTF-8编码，还设置了响应头
 *        注意：此方法必须得在获取流之前使用  使用流示例：resp.getWriter()
 *
 *
 *  请求转发特点：
 *     浏览器地址栏没变化，是一次请求，共享request域中的数据，可以转发到WEB-INF目录下(因为是服务器访问)，但是不可以访问工程以外的资源
 *  重定向特点：
 *     浏览器地址栏发生变化，是两次请求，不能共享request域中的数据，不能访问WEB—INF下的资源(因为是客户端访问)，可以访问工程以外的资源
 *     如何使用重定向？
 *        第一种：
 *             resp.setStatus(302)  设置响应状态码302
 *             resp.setHeader("Location","http:localhost:8080/项目名称")  设置新的资源地址在哪
 *        第二种：
 *             resp.setRedirect("http:localhost:8080")
 *
 *
 *  web中/斜杠的不同意义
 *     web中/斜杠 是一种绝对路径
 *     /斜杠 如果浏览器解析，得到的地址是：http://ip:port/
 *           <a href='/'>斜杠</a>
 *     /斜杠 如果被服务器解析，得到的地址是： http://ip:port/工程路径
 *           1. <url-pattern>/servlet1</url-pattern>
 *           2. servletContext.getRealPath('/')
 *           3. request.getRequestDispatcher('/')
 *     /斜杠 特殊情况：response.sendRedirect('/') 吧斜杠发送给浏览器解析得到http://ip:port/
 *
 *
 *  GET请求信息：详情看图片 GET.png
 *  POST请求信息：详情看图片 POST.png
 *  响应信息： 详情看图片 响应信息.png
 *
 *
 */
public class All {
    public static void main(String[] args) {
//        new String("sadas".getBytes(),)
    }
}
