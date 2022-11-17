package Observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopicSubject implements Subject{
    List<Observer> observers;
    private String news="no news right now";
    public MyTopicSubject(){
        observers=new ArrayList<>();
    }
    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

    @Override
    public void setUpdates(String newNews) {
         news=newNews;
         notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
          observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String getNews() {
        return news;
    }
}
