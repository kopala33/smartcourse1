package Assignment_Operators;

public class Assignment_Operators {
    public static void main(String[] args) {


        /**
         * ინეჯერები დავამატე  იმიტომ რომ ცვლადის სახელებს მაქედან იღებს
         */

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

        /* Assignment operators მინიჭების ოპერატორები */
        // (number_1) <--- არსებული ცვლადი შეგვიძლია int-ს გარეშე გამოვიყენოთ
        number_1 += 9; // (+=) ---->  თავის თავს უმატებს იმ ციფრს რასაც მიუთითებ
        number_1 = number_1 + 9;
        System.out.println(number_1);
        number_1 -= 9; // (-=) ---> თავის თავს აკლებს იმ ციფრს რასაც მიუთითებ
        System.out.println(number_1);
        number_1 *= 9; //(*=) ---> თავის თავზე ამრავლებს იმ ციფრზე რასაც მიუთითებ
        System.out.println(number_1);
        number_1 /= 2; //(/=) ---> თავის თავზე ყოფს იმ ციფრზე რასაც მიუთითებ
        System.out.println(number_1);
        number_1 /= 7; //(%=) ---> გამოყავს დარჩენილი ნაშთი
        System.out.println(number_1);






    }
}
