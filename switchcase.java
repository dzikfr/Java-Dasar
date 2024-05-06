public class switchcase {
    public static void main(String[] args) {

        var Nilai = "B";

        switch (Nilai){
            case "A":
                System.out.println("Anda Lulus");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup");
                break;
            case "D":
            case "E":
                System.out.println("Anda Gagal");
                break;
            default:
                System.out.println("Pindah Jurusan Aja");
        }

        //switch dengan lamda
        switch (Nilai){
            case "A"-> System.out.println("Anda Lulus, Hebat");
            case "B", "C"-> System.out.println("Nilai Anda Cukup");
            case "D", "E"-> System.out.println("Anda Gagal");
            default -> System.out.println("Pindah Jurusan Aja");
        }

        //switch tanpa menggunakan yield
        //menyimpan data string
        String ucapan;
        switch (Nilai){
            case "A"-> ucapan = "Anda Lulus, Hebat";
            case "B", "C"-> ucapan = "Nilai Anda Cukup";
            case "D", "E"-> ucapan = "Anda Gagal";
            default -> ucapan = "Pindah Jurusan Aja";
        }
        System.out.println(ucapan);

        //switch menggunakan yield
        //tidak perlu menulis ulang "ucapan"
        ucapan = switch(Nilai){
            case "A": yield "Anda Lulus, Hebat";
            case "B", "C": yield "Nilai Anda Cukup";
            case "D", "E": yield "Anda Gagal";
            default: yield "Pindah Jurusan Aja";
        };
        System.out.println(ucapan);
    }
}