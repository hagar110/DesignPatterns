package Observer;

public class Simulator {
    public static void main(String[] args) {
        Subject topicSubject=new MyTopicSubject();
        Observer topicObserver1=new TopicObserver();
        Observer topicObserver2=new TopicObserver();
        Observer topicObserver3=new TopicObserver();
        topicObserver1.setSubject(topicSubject);
        topicObserver2.setSubject(topicSubject);
        topicObserver3.setSubject(topicSubject);
        topicSubject.setUpdates("new news !!");
    }
}
