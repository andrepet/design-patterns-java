public class Main {
    public static void main(String[] args) {
        Form1TheProblem form1 = new Form1TheProblem("","","","","");
        Form2TelescopingConstructors form2 = new Form2TelescopingConstructors("");

        Form3Setters form3 = new Form3Setters();
        form3.setName("name");

        Form4BuilderPattern form4 = new Form4BuilderPattern
                .FormBuilder()
                .address("Paradisäppelvägen 111")
                .city("Ankeborg")
                .email("kalle_anka@kvack.com")
                .name("Kalle Anka")
                .build();
    }
}
