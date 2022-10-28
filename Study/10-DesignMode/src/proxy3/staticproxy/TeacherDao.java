package proxy3.staticproxy;

/**
 * @author : zhousy
 * @date : 2022/10/27 17:32
 * @version : 1.0
 */

//代理接口实现类
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师在教课。。。。");
    }
}
