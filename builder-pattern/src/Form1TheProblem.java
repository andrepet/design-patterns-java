public class Form1TheProblem {
    final private String name;
    final private String address;
    final private String zipcode;
    final private String city;
    final private String email;

    public Form1TheProblem(String name, String address, String zipcode, String city, String email) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Form1TheProblem{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
