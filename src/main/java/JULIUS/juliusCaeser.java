package JULIUS;

public class juliusCaeser {
    /*leave as primitives*/
    private String encryptedMessage = "";
    private int ShiftValue;
    private String input;
    /*constructor*/
    public String juliusCaeser(String input, int ShiftValue){
        this.input= input;
        this.ShiftValue= ShiftValue;
    /* value range fixed between 0 and 23*/
    if(ShiftValue >26){
        ShiftValue= ShiftValue%26;
    }
    else if(ShiftValue <0){
        ShiftValue= (ShiftValue%26) +26;
    }











       return encryptedMessage;
    }


}
