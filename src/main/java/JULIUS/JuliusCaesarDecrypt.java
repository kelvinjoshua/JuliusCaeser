package JULIUS;

public class JuliusCaesarDecrypt {

    private String decryptedMessage = "";
    private int ShiftValue;
    private String input;

    public String JuliusCaeserDecrypt(String input, int ShiftValue) {
        this.input = input;
        this.ShiftValue = ShiftValue;

        if (ShiftValue > 26) {
            ShiftValue = ShiftValue % 26;
        } else if (ShiftValue < 0) {
            ShiftValue = (ShiftValue % 26) + 26;
        }
        for (int i = 0; i < input.length(); i++) {
            char someLetter = input.charAt(i);

            if (Character.isLetter(someLetter)) {

                if (Character.isUpperCase(someLetter)) {

                    char assign = (char)(someLetter - ShiftValue);
                    if (assign < 'A') {
                        decryptedMessage += (char) (someLetter + (26 - ShiftValue));
                    } else {
                        decryptedMessage += assign;
                    }
                } else if (Character.isLowerCase(someLetter)) {
                    char assign = (char) (someLetter + ShiftValue);
                    if (assign <'a') {
                        decryptedMessage += (char) (someLetter +(26 - ShiftValue));
                    } else {
                        decryptedMessage += assign;
                    }

                }
                else {
                    decryptedMessage  += someLetter;
                }
            }
        }

        return decryptedMessage;
    }

    public int getShiftValue(){
        return this.ShiftValue;
    }

    public String getInput(){
        return this.input;
    }
}
