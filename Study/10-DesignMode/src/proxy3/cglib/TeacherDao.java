package proxy3.cglib;

/**
 * @author : zhousy
 * @date : 2022/10/28 9:53
 * @version : 1.0
 */


public class TeacherDao {
    public String teach(String name) {
        System.out.println(name + "老师教课...");
        return "cglib代理测试";
    }
}
