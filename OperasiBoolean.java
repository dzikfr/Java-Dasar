public class OperasiBoolean {
    public static void main(String[] args) {

        var Absen = 70;
        var Nilai = 75;

        var lulusAbsen = Absen >=70;
        var lulusNilai = Nilai >= 75;

        var lulus = lulusAbsen&&lulusNilai;
        System.out.println(lulus);

    }
}