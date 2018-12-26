public class Main {
    public static void main(String[] args) {

        // method 1: create a standard form
        Form1TheProblem form1 = new Form1TheProblem("Kalle Anka"
                ,"Paradisäppelvägen 111"
                ,"1111"
                , "Ankeborg"
                , "kalle_anka@kvack.com");

        System.out.println(form1);
        System.out.println();


































        ///////////////////////////////////////////////////////////////////


        // method 2: create a standard form where the name is changed
        // using this method, can we change name and e-mail in an easy way?
        // what about the order we set the attributes?
//        Form2TelescopingConstructors form2 = new Form2TelescopingConstructors("Musse Pigg");
//        System.out.println(form2);
//        System.out.println();


        ///////////////////////////////////////////////////////////////////


        // method 3: create a standard form where the name and e-mail are changed
        // using this method, can the attributes be constants?
        // what happens if something happens between the setter-methods?
//        Form3Setters form3 = new Form3Setters();
//        form3.setName("Musse Pigg");
//        form3.setEmail("musse_pigg@pip.com");
//        System.out.println(form3);
//        System.out.println();


        ///////////////////////////////////////////////////////////////////


        // method 4: builder-pattern!
        // create a standard form where the name, e-mail & address are changed (in any order")
        Form4BuilderPattern form4 = new Form4BuilderPattern
                .FormBuilder()
                .address("Stenvägen 10")
                .name("Musse Pigg")
                .email("musse_pigg@pip.com")
                .build();

        System.out.println(form4);
        System.out.println();
    }
}
