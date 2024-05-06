public class MethodVariableArgument {
    public static void main(String[] args) {

        sayCongrats("Dzikri", 80,75,75,90,100);
        sayCongrats("Fauzi", 60,80,75,50,70);
        sayCongrats("Ramdhani", 70,80,75,100,70);

    }

    static void sayCongrats(String name, int...values){

        var Total = 0;
        for (var value : values){
            Total += value;
        }
        var finalValue = Total/ values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " +name +", Anda Lulus");
        }else {
            System.out.println("Maaf "+ name +", Anda Belum Lulus");
        }
    }
}