package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Test
 */
public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        System.out.println(String.format("%s received message %s from %s", name, arg, o.toString()));
    }
}
