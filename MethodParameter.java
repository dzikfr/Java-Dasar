public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Dzikri", "Fauzi");
        sayHello("Fauzi", "Ramdhani");
        sayHello("Dzikri", "Ramdhani");
    }
    static void sayHello(String FirstName, String LastName){
        System.out.println("Selamat Datang "+FirstName+" "+LastName);
    }
}
