package adaptor;

/**
 * @author Test
 */
public class ChargingAdaptor extends Computer implements TypeC {

    public int output() {
        int voltage = usb();
        System.out.println("I'm adaptor, ready to transform voltage from computer for phone with TypeC interface");
        return voltage;
    }
}
