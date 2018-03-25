public class Form2TelescopingConstructors {
    final private String name;
    final private String address;
    final private String zipcode;
    final private String city;
    final private String email;

    public Form2TelescopingConstructors(String name) {
        this(name, "");
    }

    public Form2TelescopingConstructors(String name, String address) {
        this(name, address, "");
    }

    public Form2TelescopingConstructors(String name, String address, String zipcode) {
        this(name, address, zipcode, "");
    }

    public Form2TelescopingConstructors(String name, String address, String zipcode, String city) {
        this(name, address, zipcode, city, "");
    }

    public Form2TelescopingConstructors(String name, String address, String zipcode, String city, String email) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.email = email;
    }

    // getter-methods

}
