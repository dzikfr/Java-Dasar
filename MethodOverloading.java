public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Dzikri");
        sayHello("Dzikri", "Fauzi");

    }

    static void sayHello(){

        System.out.println("Hello");
    }

    static void sayHello(String Name){
        System.out.println("Hello " +Name);

    }

    static void sayHello(String FirstName, String LastName){
        System.out.println("Hello " + FirstName + " " + LastName);

    }

}
