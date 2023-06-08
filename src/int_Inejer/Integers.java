package int_Inejer;

public class Integers {
    public static void main(String[] args) {


        /* (integer)---> ინახავს მთელ რიცხვებს, ათწილადების გარეშე */
        int number = 15;
        System.out.println(number);

        // არითმეტიკული ოპერატორები
        int number_1 = 21;
        int number_2 = 7;
        int number_3 = number_1 + number_2;
        System.out.println(number_3);
        /* ან ესე */
        int number_4 = 21 + 7;
        System.out.println(number_4);
        int number_8 = 10;
        int number_9 = 2;
        int number_10 = number_8 / number_9;
        System.out.println(number_10);
        int number_11 = 2;
        int number_12 = 2;
        int number_13 = 2 * 2;
        System.out.println(number_13);


        /* პლიუსის კიდევ სხვა მნიშვნელობა */
        String last_name_2 = "kopaleishvili";
        String name_2 = "david";
        System.out.println(last_name_2 + " " + name_2);


        /* ასევე შეიძლება რიცხის და ტექსტის შეერთება */
        System.out.println(name_2 + " " + number_1);

        /* (%)---> ნიშანი გვანახებს დარჩენილ ნაშთს */
        int number_5 = 10 % 3;
        System.out.println(number_5);

        /* (++)---> უმატეეებს ერთს */
        int number_6 = 6;
        System.out.println(++number_6);

        /* (--) აკლეებს ერთს */
        int number_7 = 6;
        System.out.println(--number_7);



    }
}
