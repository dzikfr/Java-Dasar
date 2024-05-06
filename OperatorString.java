public class OperatorString {
    public static void main(String[] args) {

        String S1 = "Saya Belajar";
        String S2 = "Bahasa Pemrograman";
        String S3 = "Java Dasar";
        String S4 = "java dasar";

        System.out.println(S1+" "+S2+" "+S3);
        System.out.println(S2.substring(0,15));
        System.out.println(S2.equals(S3));
        System.out.println(S2.equalsIgnoreCase(S3));
        System.out.println(S3.equals(S4));
        System.out.println(S3.equalsIgnoreCase(S4));
    }
}
