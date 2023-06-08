package Logical_Operators;

public class LogicalOperators {
    public static void main(String[] args) {



        /* ლოგიკური ოპარატორები */
        boolean numbers_5 = 10 > 5 && 2 < 7; // (&&)---> 10 მეტია 5-ზე და 2 ნაკლებია 7-ზე მარცხენა და მარჯვენა შეფარდება უნდა იყოს --->true
        System.out.println(numbers_5);
        boolean numbers_6 = 10 > 5 || 22 < 7; // (||)---> ამ შემთხვევაში თუ ერთი მხარე მაინც არის მართალი იქნება --->true
        System.out.println(numbers_6);
        boolean numbers_7 = !(10 > 5 || 22 < 7); // !(||)---> ამ შემთხვევაში თუ წინ ძახილის ნიშანი აქვს მაშინ იქნება --->false იმიტომ რომ 22<7 წაიკითხავს პირველად ანუ არასწორს

    }
}
