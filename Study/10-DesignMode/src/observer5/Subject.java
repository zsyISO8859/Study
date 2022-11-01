package observer5;

/**
 * @author : zhousy
 * @date : 2022/10/31 14:41
 * @version : 1.0
 */


public interface Subject {
    void registerObserver(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
