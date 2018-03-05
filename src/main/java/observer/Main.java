package observer;

/**
 * @author Test
 */
public class Main {
    public static void main(String[] args) {
        Subscriber s0 = new Subscriber("s0");
        Subscriber s1 = new Subscriber("s1");

        Publisher observer = new Publisher("北京气象台");
        observer.addObserver(s0);
        observer.addObserver(s1);
        observer.notifyObservers("明日大雨");

    }
}