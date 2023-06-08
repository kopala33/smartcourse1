package String;

public class String {
    public static void main(String[] args) {
        /* String  ინახავს ტექსტის ტიპის მონაცემებს */
        java.lang.String last_name = "kopala ";
        java.lang.String name = "data";
        java.lang.String nameAndLastname = last_name + name;
        System.out.println(nameAndLastname);



        /* პლიუსის კიდევ სხვა მნიშვნელობა */

        int number_1 = 21;

        java.lang.String last_name_2 = "kopaleishvili";
        java.lang.String name_2 = "david";
        System.out.println(last_name_2 + " " + name_2);

        /* ასევე შეიძლება რიცხის და ტექსტის შეერთება */
        System.out.println(name_2 + " " + number_1);


        int bYear = 1000;
        int bYear_1 = 972;
        int bYear_2 = 1000 + 972;

        int bYear_3 = 25;
        int bYear_4 = 2;
        int bYear_5 = 25 * 2;

        int bYar_6 = 2023;
        int bYear_7 = 1972;
        int bYear_8 = 2023 - 1972;
        System.out.println(bYear_8); //ამ მეთოდით გამოვდივარ 51 წლის რაც false :))))


        java.lang.String txt = "i born in";

        java.lang.String txt_3 = "and i am";

        java.lang.String txt_5 = "years old";

        java.lang.String message = (txt + " " + bYear_2 + " " + txt_3 + " " + bYear_5 + " " + txt_5);
        System.out.println(message);


    }
}
