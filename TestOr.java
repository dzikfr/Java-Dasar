public class TestOr {
    public static void main(String[] args) {
        int i =10;
        int j =50;
        boolean test= true;

        test= (i<=10)||(j>=40);

        System.out.println(i);
        System.out.println(j);
        System.out.println(test);


        test= (i<=5)||(j>=100);

        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
