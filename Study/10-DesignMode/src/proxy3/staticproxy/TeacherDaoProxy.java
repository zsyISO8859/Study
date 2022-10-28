package proxy3.staticproxy;

/**
 * @author : zhousy
 * @date : 2022/10/27 17:33
 * @version : 1.0
 */

//代理工厂类
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }
    @Override
    public void teach() {
        System.out.println("代理开始。。。。。");
        teacherDao.teach();
        System.out.println("代理结束。。。。。");
    }
}
