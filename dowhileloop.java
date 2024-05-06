public class dowhileloop {
    public static void main(String[] args) {

        var counter = 100;
        do{
            System.out.println("Perulangan Ke-"+counter);
            counter--;
        }
        while ( counter<=10 );
    }
}

//perbedaannya adalah do while melakukan loop sekali meskipun dlam kondisi false