import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int Num;
        String input;

        JOptionPane.showMessageDialog(null,"This program will validate user input");

        input = JOptionPane.showInputDialog(null, "Enter a number ranging from 1 to 10");
        Num = Integer.parseInt(input);

        while (Num <1 || Num > 10) {
            input = JOptionPane.showInputDialog("invalid input " + " enter a number ranging from 1 to 10");
            Num = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "You made the right input");

    }
}