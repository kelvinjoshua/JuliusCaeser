package JULIUS;

public class JuliusCaeser {
    /*leave as primitives*/
    private String encryptedMessage = "";
    private int ShiftValue;
    private String input;
    /*constructor*/
    public String JuliusCaeser(String input, int ShiftValue){
        this.input= input;
        this.ShiftValue= ShiftValue;
    /* value range fixed between 0 and 23*/
    if(ShiftValue >26){
        ShiftValue= ShiftValue%26;
    }
    else if(ShiftValue<0) {
        ShiftValue= (ShiftValue%26) +26;
    }
    for(int i=0;i<input.length();i++){
        char someLetter = input.charAt(i);
        /*isLetter method of character class*/
        if(Character.isLetter(someLetter)){
            /*check whether character is in uppercase or lowercase*/
            if(Character.isUpperCase(someLetter)){
                /*co-erce to store value in a char variable*/
                char assign = (char)(someLetter+ShiftValue);
                if(assign>'Z'){
                    encryptedMessage += (char)(someLetter-(26-ShiftValue));
                }
                else{
                    encryptedMessage += assign;
                }
            }

            else if(Character.isLowerCase(someLetter)){
                char assign = (char)(someLetter+ShiftValue);
                if(assign>'z'){
                    encryptedMessage +=(char)(someLetter-(26-ShiftValue));
                }
                else{
                    encryptedMessage += assign;
                }

            }
            else{
                encryptedMessage += someLetter;
            }
        }
    }


       return encryptedMessage;
    }

public int getShiftValue(){
        return this.ShiftValue;
}

public String getInput(){
        return this.input;
}
}
