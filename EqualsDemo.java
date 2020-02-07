/**
 * Equals mechanism demo
 */

public class EqualsDemo {
    public static void main(String[] args) {
        Address addr1 = new Address("Russia", "Moscow",
                "Petrovka", "38", "666");
        Address addr2 = new Address("Russia", "Moscow",
                "Petrovka", "38", "666");
        System.out.println("Addresses " + addr1 + " and " +
                addr2 + " are equal? " + addr1.equals(addr2)); // true
    }
}
