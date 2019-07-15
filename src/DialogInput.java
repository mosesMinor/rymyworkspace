import javax.swing.*;
import java.util.Scanner;

public class DialogInput {
    public static void main(String[] args) {
        Scanner dialog = new Scanner(System.in);
        String name = JOptionPane.showInputDialog("What is your name?");
        String location = JOptionPane.showInputDialog("Where do you reside?");

        JOptionPane.showMessageDialog(null, "Hi there "+name+". You live in "+location);
    }
}
