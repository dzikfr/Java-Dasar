public class LatihanMandiri {
    public static void main(String[] args) {

        byte AngkaByte = 10;
        short AngkaShort = 1000;
        int AngkaInt = 1_000_000;
        long AngkaLong = 1_000_000_000;


        String Awal = "A";
        String Beda = "B";

        var Value1 = 100;
        var Value2 = 150;

        //mencoba operasi
        long Pertambahan = Value1+AngkaByte;
        long Perkalian = Value2*AngkaByte;

        System.out.println("Maka Hasil Pertambahan " + Pertambahan);
        System.out.println("Maka Hasil Perkalian " + Perkalian);

        //mencoba if else
        if(Value1>=AngkaInt||Value2<=AngkaShort){
            System.out.println("Kode Berhasil");
        }else{
            System.out.println("Kode Tidak Berhasil");
        }

        //mencoba switch case
        switch(Awal) {
            case "A" -> System.out.println("A Lulus");
            case "B" -> System.out.println("B Lulus");
            default -> System.out.println("Yasudahlah");
        }

        //mencoba Array
        String[] Name = {
                "Dzikri", "Fauzi", "Ramdhani"
        };

        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);

        //mencoba array dalam array
        String[][] Name2 = {
                {"Dzikri", "Mau"},
                {"Fauzi", "Sate"},
                {"Makan", "Ramdhani"},
        };
        System.out.println(Name2[0][0]);
        System.out.println(Name2[1][0]);
        System.out.println(Name2[2][1]);
        System.out.println(Name2[0][1]);
        System.out.println(Name2[2][0]);
        System.out.println(Name2[1][1]);

        //mencoba perulangan
        for(byte Nomor=10;Nomor<=100;Nomor+=10){
            System.out.println("Perulangan 10 = " + Nomor);
        }

        for (var ganjil = 1;ganjil<=100;ganjil++){
            if (ganjil %2 == 0){
                continue;
            }
            System.out.println(ganjil);
        }
        tesSaja();
    }

    static void tesSaja(){
        tesSaja2();
    }

    static void tesSaja2(){
        System.out.println("Love U");
    }


    static void latihanMethod(){
        latihanNgen("04TPLE004");
    }

    static void latihanNgen(String kelas){

        System.out.println("kelas saya adalah : " +kelas);
    }
}
