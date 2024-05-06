public class ternary {
    public static void main(String[] args) {

        //menggunakan if else
        var nilai =70;
        String ucapan;

        if(nilai ==75){
            ucapan = "Selamat Anda Lulus";
        }
        else {
            ucapan = "Coba Lagi";
        }
        System.out.println(ucapan);


        //menggunakan ternary operator
        var nilai2 = 75;
        String ucapan2 = nilai2>= 75? "Selamat Anda lulus" : "Coba Lagi";

        System.out.println(ucapan2);

        //ternary operator lebih sederhana jika ingin menggunakan if else yang sederhana

    }
}
