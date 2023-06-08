package Boolean;

public class Boolean {
    public static void main(String[] args) {


        /* (boolean)---> ინახავს ორი მნიშვნელობით, მართალი ან მცდარი */

        int number = 15;

        boolean bol = true; // true or false
        boolean Is = number == number;
        System.out.println(Is); // true


        /* შედარბის ოპერატორები */
        boolean itIs = 21 == 7; // 21 უდრის თუ არა 7 ---> false
        System.out.println(itIs);
        boolean isIt = 21 != 7; // (!=)--->  რომ 21 არ უდრის 7 ---> true
        System.out.println(isIt);
        boolean numbers = 21 > 7; // რომ 21 მეტია 7-ზე ---> true
        System.out.println(numbers);
        boolean numbers_1 = 7 < 21; // რომ 7 ნაკლებია 21-ზე ---> true
        System.out.println(numbers_1);
        boolean numbers_2 = 21 >= 21; // 21 მეტია ან ტოლია 21-ზე ---> true
        System.out.println(numbers_2);
        boolean numbers_3 = 21 <= 21; // 21 ნაკლებია ან ტოლია 21-ზე ---> true
        System.out.println(numbers_3);


    }

}
