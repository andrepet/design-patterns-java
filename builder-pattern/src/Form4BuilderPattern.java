public class Form4BuilderPattern {
    final private String name;
    final private String address;
    final private String zipcode;
    final private String city;
    final private String email;

    private Form4BuilderPattern(FormBuilder form){
        this.name = form.name;
        this.address = form.address;
        this.zipcode = form.zipcode;
        this.city = form.city;
        this.email = form.email;
    }

    @Override
    public String toString() {
        return "Form4BuilderPattern{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class FormBuilder{
        private String name = "Kalle Anka";
        private String address = "Paradisäppelvägen 111";
        private String zipcode = "1111";
        private String city = "Ankeborg";
        private String email = "kalle_anka@kvack.com";

        public Form4BuilderPattern build(){
            return new Form4BuilderPattern(this);
        }

        public FormBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FormBuilder address(String address) {
            this.address = address;
            return this;
        }

        public FormBuilder zipcode(String zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public FormBuilder city(String city) {
            this.city = city;
            return this;
        }

        public FormBuilder email(String email) {
            this.email = email;
            return this;
        }
    }
}
