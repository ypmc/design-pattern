package template_method;

/**
 * @author Test
 */
public class Noodle extends FoodTemplate {
    public void prepare() {
        System.out.println("prepare noodle");
    }

    public void make() {
        System.out.println("making noodle");
    }

    public void dish() {
        System.out.println("dishing noodle");
    }
}
