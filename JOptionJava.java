import javax.swing.JOptionPane;
public class JOptionJava {
    public static void main(String[] args) {
        String Nama= " ";

        Nama= JOptionPane.showInputDialog("Ketik Nama Anda : ");
        String msg= "Hello " +Nama +"\nLanjutkan Belajarnya agar jadi programmer";

        JOptionPane.showMessageDialog(null, msg);
    }
}
