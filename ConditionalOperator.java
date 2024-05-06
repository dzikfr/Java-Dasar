public class ConditionalOperator {
    public static void main(String[] args) {

        //contoh pertama
        String status = "";
        int grade = 70;

        status = (grade>=60)?"Passed":"Fail";

        System.out.println(status);

        //contoh lain
        int score = 0;
        char answer = 'a';
        score = (answer=='a')? 10 : 0;
        System.out.println("Score = " +score);

    }
}
