import java.util.Objects;

/**
 * Class with equals overridden
 */

public class Address {
    private String country;
    private String city;
    private String street;
    private String house;
    private String flat;

    public Address(String country, String city, String street, String house, String flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public boolean equals(Object o) {
        // reflexive: true on the same object
        if (this == o) return true;
        // false to null and another class
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        // All meaning fields count
        return Objects.equals(country, address.country) &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(house, address.house) &&
                Objects.equals(flat, address.flat);
    }

    @Override // MUST BE overridden if equals is overridden
    public int hashCode() {
        // Hash consists of all meaning fields hashes
        return Objects.hash(country, city, street, house, flat);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
