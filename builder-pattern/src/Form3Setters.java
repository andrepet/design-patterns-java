public class Form3Setters {
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String email;

    public Form3Setters() {
        this.name = "Kalle Anka";
        this.address = "Paradisäppelvägen 111";
        this.zipcode = "1111";
        this.city = "Ankeborg";
        this.email = "kalle_anka@kvack.com";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Form3Setters{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
