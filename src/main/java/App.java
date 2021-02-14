import JULIUS.JuliusCaeser;

import java.io.Console;
public class App {
    public static void main(String[] args){
        Console terminal = System.console();
        System.out.println("Enter the message you want to encrypt");
        String message = terminal.readLine();

        System.out.println("Enter the shift value");
        String digit = terminal.readLine();

        Integer convDigit = Integer.parseInt(digit);
        int primDigit = convDigit;
        JuliusCaeser conversion = new JuliusCaeser();
        System.out.println("The encrypted text is: "+conversion.JuliusCaeser(message,primDigit));

    }
}