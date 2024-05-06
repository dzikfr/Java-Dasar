public class foreach {
    public static void main(String[] args) {

        //loop ini hanya digunakan untuk mengambil data pada array
        String[] Data = {
                "Dzikri", "Fauzi", "Ramdhani",
                "Advan", "Work", "Plus"
        };

        for(var name: Data) {
            System.out.println(name);
        }
    }
}
