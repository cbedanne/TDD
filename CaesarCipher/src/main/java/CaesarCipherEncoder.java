public class CaesarCipherEncoder {

    public static final int alphabetLetterNumber = 26;

    public String encode(String stringToEncode, int shift) {

        char[] charsToEncode  = stringToEncode.toCharArray();
        String encodedString="";
        for (int i =0 ; i<charsToEncode.length; i++){
           String encodedLetter = getEncodedLetter(stringToEncode,shift,i);
           encodedString=encodedString+encodedLetter;
        }
        return encodedString;

    }


    private String getEncodedLetter(String input, int shift, int index) {
        int encodedCharacter = input.charAt(index) + shift % alphabetLetterNumber;
        if (encodedCharacter >"Z".charAt(0)) {
            return (char)(input.charAt(index) - (alphabetLetterNumber -shift% alphabetLetterNumber))+"";
        }
        if (encodedCharacter <"A".charAt(0)) {
            return (char)(input.charAt(index) + (alphabetLetterNumber +shift% alphabetLetterNumber))+"";
        }
        return (char) (encodedCharacter) + "";
    }
}
