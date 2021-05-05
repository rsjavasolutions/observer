import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String title;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
       observers.forEach(Observer::update);
    }

    public void upload(String title){
        this.title = title;
        notifyObservers();
    }

    public String getTitle() {
        return title;
    }
}
