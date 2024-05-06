public class CobaOperasi {
    public static void main(String[] args) {

        int Aa = 10;
        int Bb = 20;
        int Cc = 40;

        int Xx = Aa*Bb*Cc;
        int Yy = Cc+Bb+Aa;
        int Zz = Cc-Bb-Aa;

        System.out.println(Xx);
        System.out.println(Yy);
        System.out.println(Zz);

        //Unary dan Augmented
        //++ untuk tambah satu pada var
        //-- untuk kurangi satu pada var
        //+= untuk Tambah angka pada var
        //-= untuk Kurangi angka pada var


        int Dd = 100;

        Dd++;
        System.out.println(Dd);

        Dd--;
        System.out.println(Dd);

        Dd+=10;
        System.out.println(Dd);

        Dd-=10;
        System.out.println(Dd);
    }
}
