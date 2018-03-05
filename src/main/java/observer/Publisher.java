package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Test
 */
public class Publisher extends Observable {

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.setChanged();
        super.notifyObservers(arg);
    }

    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}