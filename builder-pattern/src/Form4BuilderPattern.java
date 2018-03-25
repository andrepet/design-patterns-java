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

    // getter-methods

    public static class FormBuilder{
        private String name = "";
        private String address = "";
        private String zipcode = "";
        private String city = "";
        private String email = "";

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
