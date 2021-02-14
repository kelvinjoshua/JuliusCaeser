package JULIUS;

public class juliusCaesarDecrypt {

    private String encryptedMessage = "";
    private int ShiftValue;
    private String input;

    public String juliusCaeserDecrypt(String input, int ShiftValue) {
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

                    char assign = (char) (someLetter + ShiftValue);
                    if (assign > 'Z') {
                        encryptedMessage += (char) (someLetter - (26 - ShiftValue));
                    } else {
                        encryptedMessage += assign;
                    }
                } else if (Character.isLowerCase(someLetter)) {
                    char assign = (char) (someLetter + ShiftValue);
                    if (assign > 'z') {
                        encryptedMessage += (char) (someLetter - (26 - ShiftValue));
                    } else {
                        encryptedMessage += assign;
                    }

                } else {
                    encryptedMessage = encryptedMessage + someLetter;
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