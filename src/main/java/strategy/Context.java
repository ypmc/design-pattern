package strategy;

/**
 * @author Test
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void performStrategy() {
        strategy.perform();
    }
}
