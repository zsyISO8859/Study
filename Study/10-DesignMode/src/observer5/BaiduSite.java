package observer5;

/**
 * @author : zhousy
 * @date : 2022/10/31 14:54
 * @version : 1.0
 */


public class BaiduSite implements Observer {
    private int wendu;
    private int shidu;
    private int qiya;

    @Override
    public void update(int wendu, int shidu, int qiya) {
        this.qiya = qiya;
        this.wendu = wendu;
        this.shidu = shidu;
        show();
    }

    public void show() {
        System.out.println("百度天气 温度=" + wendu + " 湿度=" + shidu + " 气压=" + qiya);
    }
}
