package JULIUS;
import java.io.Console;
public class App {
    public static void main(String[] args){
        Console terminal = System.console();
        System.out.println("Enter the message you want to encrypt");
        String message = terminal.readLine();

        System.out.println("Enter the shift value");
        String digit = terminal.readLine();


    }
}
