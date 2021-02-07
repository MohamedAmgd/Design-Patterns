import java.util.ArrayList;

/**
 * Subject
 */
public class Subject {
    private ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}