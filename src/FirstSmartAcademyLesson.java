
public class FirstSmartAcademyLesson {
    public static void main(String[] args) {

        /* String  ინახავს ტექსტის ტიპის მონაცემებს და აუცილებლად უნდა იყოს ორმაგ ბრჭყალებში */
        String last_name = "kopala ";
        String name = "data";
        String nameAndLastname = last_name + name;
        System.out.println(nameAndLastname);

        /* (integer)---> ინახავს მთელ რიცხვებს, ათწილადების გარეშე */
        int number = 15;
        System.out.println(number);


        /* (float)---> ინახავს ათწილადებიან რიცხვებს მაგ.. 12.3 --- ბოლოში აუცილებლად f-ით */
        float fl = 15.23f;
        System.out.println(fl);

        /* (double)---> იგივეა როგორც float მაგრამ უფრო მეტი მოცულობით და f-ის გარეშე  */
        double sh = 15.212;
        System.out.println(sh);

        /* (Char)---> ინახავს ერთ ასოს ან სიმბოლოს ერთმაგი ბრჭყალებით */
        char ch = 'q';
        System.out.println(ch);

        /* (boolean)---> ინახავს ორი მნიშვნელობით, მართალი ან მცდარი */
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

        /* ლოგიკური ოპარატორები */
        boolean numbers_5 = 10 > 5 && 2 < 7; // (&&)---> 10 მეტია 5-ზე და 2 ნაკლებია 7-ზე მარცხენა და მარჯვენა შეფარდება უნდა იყოს --->true
        System.out.println(numbers_5);
        boolean numbers_6 = 10 > 5 || 22 < 7; // (||)---> ამ შემთხვევაში თუ ერთი მხარე მაინც არის მართალი იქნება --->true
        System.out.println(numbers_6);
        boolean numbers_7 = !(10 > 5 || 22 < 7); // !(||)---> ამ შემთხვევაში თუ წინ ძახილის ნიშანი აქვს მაშინ იქნება --->false იმიტომ რომ 22<7 წაიკითხავს პირველად ანუ არასწორს

        // (//) (/**/) ამას ვიყენებთ მხოლოდ კომენტარებისთვის რომელიც არ ეხება კოდს

        // (package) პაკეტების სახელები იწერება მხოლოდ პატარა ასოები
        // მეთოდის სახელები პატარა ასოთი
        // (Class name) კლასის სახელები უნდა იწყებოდეს დიდი ასოთი მაგ--> FirstName
        //(variable name) ცვლადის სახელი უნდა იწყებოდეს პატარა ასოთი და შემდეგი დიდთ მაგ--> firstName

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


        String txt = "i born in";

        String txt_3 = "and i am";

        String txt_5 = "years old";

        String message = (txt + " " + bYear_2 + " " + txt_3 + " " + bYear_5 + " " + txt_5);
        System.out.println(message);


    }
}
