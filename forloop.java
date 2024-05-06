public class forloop {
    public static void main(String[] args) {

        //(init statement;kondisi;post statement)
        //kondisi->blok perulangan->post statement
        //jika tidak diisi, maka otomatis akan bernilai true

        for(var counter =5;counter <10;counter+=2){
            System.out.println("Perulangan "+counter);
        }
    }
}
