public class Form2TelescopingConstructors {
    final private String name ;
    final private String address;
    final private String zipcode;
    final private String city;
    final private String email;

    public Form2TelescopingConstructors() {
        this("Kalle Anka");
    }

    public Form2TelescopingConstructors(String name) {
        this(name, "Paradisäppelvägen 111");
    }

    public Form2TelescopingConstructors(String name, String address) {

        this(name, address, "1111");
    }

    public Form2TelescopingConstructors(String name, String address, String zipcode) {
        this(name, address, zipcode, "Ankeborg");
    }

    public Form2TelescopingConstructors(String name, String address, String zipcode, String city) {
        this(name, address, zipcode, city, "kalle_anka@kvack.com");
    }

    public Form2TelescopingConstructors(String name, String address, String zipcode, String city, String email) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Form2TelescopingConstructors{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
