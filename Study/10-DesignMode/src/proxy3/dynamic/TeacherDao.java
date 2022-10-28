package proxy3.dynamic;

/**
 * @author : zhousy
 * @date : 2022/10/28 9:21
 * @version : 1.0
 */


public class TeacherDao implements ITeacherDao{
    @Override
    public String teach(String name) {
        System.out.println(name+"老师teacher。。。");
        return "keep..";
    }
}
