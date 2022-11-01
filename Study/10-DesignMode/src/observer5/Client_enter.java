package observer5;

/**
 * @author : zhousy
 * @date : 2022/10/31 15:00
 * @version : 1.0
 */

/**
 * 观察者模式：
 *     成员作用：
 *      接口subject(气象局/牛奶站) 登记注册、移除注册、通知
 *      接口Observer(第三方网站/客户) update
 *    原理：
 *      对象直接多对一依赖的关系的一种设计方案，被依赖的对象Subject，依赖对象为Observer，
 *      Subject通知Object变化
 *    好处：
 *      观察者模式是以集合的方式来管理Observer(BaiduSite GoogleSite)，包含注册、移除、通知，这样我们增加观察者就不需要去
 *      修改主体类(WeatherData)的代码，遵守了ocp原则。
 *    场景：
 *      气象站和第三方网站  牛奶站和客户
 *
 *    jdk源码分析：java.util.Observable 使用了观察者模式
 *               Observable的作用相当于Subject
 *               Observable是类不是接口，类中实现了注册、移除、通知，帮助管理Observer。
 *               Observer是接口，有update方法
 *               可以通过继承Observable来实现观察者模式
 *
 */
public class Client_enter {
    public static void main(String[] args) {
        //新建观察者
        BaiduSite baiduSite = new BaiduSite();
        GoogleSite googleSite = new GoogleSite();

        //新建主体
        WeatherData weatherData = new WeatherData();

        //设置观察者(发布温湿度)
        weatherData.registerObserver(baiduSite);
        weatherData.registerObserver(googleSite);

        //设置温湿度气压
        weatherData.setData(12, 22, 25);

        System.out.println("----------------------------------------------------");
        //设置观察者(发布温湿度)
        weatherData.remove(googleSite);

        //设置温湿度气压
        weatherData.setData(33, 44, 55);


    }
}
