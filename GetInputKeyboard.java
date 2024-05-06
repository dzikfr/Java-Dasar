import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GetInputKeyboard {
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama = " ";
        System.out.println("Ketik Nama Anda :");

        try {
            nama = dataIn.readLine();
        }

        catch (IOException e){
            System.out.println("Ada Kesalahan !");
        }

        System.out.println();
        System.out.println("Hello" +nama +"\nLanjutkan belajarnya pasti menjadi programmer");

    }
}
