public class Scope {
    public static void main(String[] args) {
        sayHello("Dzikri Fauzi");
        sayHello("");

    }
    static void sayHello(String name){
        String  hello = "Hello " +name;

        if (!name.isBlank()){
            String hi = "Hi "  +name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}

/** yang disebut scope adalah semua variable dalam blok
 * jika kau ingin melakukan perintah print,
 * maka harus dilakukan dalam blok yang terdapat di blok tersebut
 */
