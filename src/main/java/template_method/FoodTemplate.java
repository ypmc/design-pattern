package template_method;

/**
 * @author Test
 */
public abstract class FoodTemplate {

    protected void makeFood() {
        this.prepare();
        this.make();
        this.dish();
    }

    public abstract void prepare();

    public abstract void make();

    public abstract void dish();
}
