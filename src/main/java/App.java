import JULIUS.JuliusCaeser;
import JULIUS.JuliusCaesarDecrypt;

import java.io.Console;
public class App {
    public static void main(String[] args){
        Console terminal = System.console();
        System.out.println("Enter the message you want to encrypt");
        String message = terminal.readLine();

        System.out.println("Enter the shift value");
        String digit = terminal.readLine();

        Integer convDigit = Integer.parseInt(digit);
        /* save as primitive to pass as argument*/
        int primDigit = convDigit;
        JuliusCaeser conversion = new JuliusCaeser();
        String storedReturn = conversion.JuliusCaeser(message,primDigit);
        System.out.println("The encrypted text is: "+ storedReturn);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-");


        /*store the key in this variable for subsequent method*/
        int key =conversion.getShiftValue();
       JuliusCaesarDecrypt reversion = new JuliusCaesarDecrypt();
       String revertReturn = reversion.JuliusCaeserDecrypt(storedReturn,key);
       System.out.println(" The decrypted message is: " + revertReturn);
        //System.out.println(storedReturn);
       // System.out.println(key);
        // System.out.println(conversion.getInput());



    }
}