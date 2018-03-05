package prototype;

/**
 * @author Test
 */
public class Main {
    /**
     * shallow copy;
     * 浅拷贝是按位拷贝对象，它会创建一个新对象，这个对象有着原始对象属性值的一份精确拷贝。
     * 如果属性是基本类型，拷贝的就是基本类型的值；
     * 如果属性是内存地址（引用类型），拷贝的就是内存地址 ，因此如果其中一个对象改变了这个地址，就会影响到另一个对象。
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("100000", "BJ");
        Person p1 = new Person("test", "001", address);
        Person p2 = (Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        /**
         * x.clone()!=x
         */
        System.out.println(p1.equals(p2));
        /**
         * x.clone().getClass() == x.getClass()
         */
        System.out.println(p1.getClass() == p2.getClass());

        /**
         * primitive data type
         */
        p1.setId("002");
        System.out.println(p1);
        System.out.println(p2);

        /**
         * Object data type
         */
        address.zipcode = "200000";
        p1.setAddress(address);
        System.out.println(p1);
        System.out.println(p2);
    }
}
