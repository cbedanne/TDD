public class CaesarCipherEncoder {

    public static final int alphabetLetterNumber = 26;
    public static final int A_ASCIICODE = 'A';
    public static final int Z_ASCIICODE = 'Z';
    public static final int a_ASCIICODE = 'a';
    public static final int z_ASCIICODE = 'z';

    public String encode(String stringToEncode, int shift) {

        char[] charsToEncode  = stringToEncode.toCharArray();
        String encodedString="";
        for (int i =0 ; i<charsToEncode.length; i++){
            String encodedLetter;
            if (isALetter(stringToEncode, i)) {
                encodedLetter = getEncodedLetter(stringToEncode, shift, i);
            }else
            {
                encodedLetter=stringToEncode.charAt(i)+"";
            }
           encodedString=encodedString+encodedLetter;
        }
        return encodedString;

    }

    private boolean isALetter(String stringToEncode, int i) {
        return (stringToEncode.charAt(i) >= A_ASCIICODE && stringToEncode.charAt(i) <= Z_ASCIICODE) || (stringToEncode.charAt(i) >= a_ASCIICODE && stringToEncode.charAt(i) <= z_ASCIICODE);
    }

    private String getEncodedLetter(String input, int shift, int index) {
        int encodedCharacter = input.charAt(index) + shift % alphabetLetterNumber;
        String shiftedCharWhenCharGreaterThanLastAlphabetLetter = (char) (input.charAt(index) - (alphabetLetterNumber - shift % alphabetLetterNumber)) + "";
        String shiftedCharWhenCharLowerFirstAlphabetLetter = (char)(input.charAt(index) + (alphabetLetterNumber + shift % alphabetLetterNumber))+"";
        if (input.charAt(index)>=A_ASCIICODE && input.charAt(index)<=Z_ASCIICODE) {
            if (encodedCharacter > Z_ASCIICODE) {
                return shiftedCharWhenCharGreaterThanLastAlphabetLetter;
            }
            if (encodedCharacter < A_ASCIICODE) {
                return shiftedCharWhenCharLowerFirstAlphabetLetter;
            }
        }else if (input.charAt(index)>=a_ASCIICODE && input.charAt(index)<=z_ASCIICODE) {
            if (encodedCharacter > z_ASCIICODE) {
                return shiftedCharWhenCharGreaterThanLastAlphabetLetter;
            }
            if (encodedCharacter < a_ASCIICODE) {
                return shiftedCharWhenCharLowerFirstAlphabetLetter;
            }
        }
        return (char) (encodedCharacter) + "";
    }
}
