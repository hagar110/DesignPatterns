package Observer;

public interface Subject {
    void notifyObservers();
    void setUpdates(String news);
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    String getNews();
}
