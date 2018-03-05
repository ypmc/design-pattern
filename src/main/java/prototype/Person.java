package prototype;

/**
 * @author Test
 */
class Address {
    String zipcode;
    String location;

    public Address(String zipcode, String location) {
        this.zipcode = zipcode;
        this.location = location;
    }

    public String toString() {
        return String.format("zipcode is %s, location is %s", zipcode, location);
    }
}

public class Person implements Cloneable {
    private String name;
    private String id;
    private Address address;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String toString() {
        return String.format("name is %s, id is %s, address is %s", name, id, address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
