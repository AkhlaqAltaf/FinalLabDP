package examsystem;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private final List<Notify> observers = new ArrayList<>();

    public void attach(Notify observer) {
        observers.add(observer);
    }

    public void detach(Notify observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Notify observer : observers) {
            observer.update(message);
        }
    }
}
