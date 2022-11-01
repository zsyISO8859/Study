package observer5;

import java.util.ArrayList;

/**
 * @author : zhousy
 * @date : 2022/10/31 14:40
 * @version : 1.0
 */


public class WeatherData implements Subject {
    private int wendu;
    private int shidu;
    private int qiya;
    private ArrayList<Observer> observerArrayList;

    WeatherData(){
        observerArrayList = new ArrayList<>();
    }

    public void setData(int wendu, int shidu, int qiya) {
        this.wendu = wendu;
        this.shidu = shidu;
        this.qiya = qiya;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerArrayList) {
            observer.update(this.wendu,this.shidu,this.qiya);
        }
    }
}
