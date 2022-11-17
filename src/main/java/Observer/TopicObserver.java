package Observer;

public class TopicObserver implements Observer{
    Subject subject;
    @Override
    public void setSubject(Subject subject) {
       this.subject=subject;
       this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("getting news from subject "+subject.getNews());
    }
}
