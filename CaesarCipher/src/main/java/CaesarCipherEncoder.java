public class CaesarCipherEncoder {

    public static final int alphabetLetterNumber = 26;

    public String encode(String stringToEncode, int shift) {

        char[] charsToEncode  = stringToEncode.toCharArray();
        String encodedString="";
        for (int i =0 ; i<charsToEncode.length; i++){
            String encodedLetter;
            if ((stringToEncode.charAt(i)>64 && stringToEncode.charAt(i)<91)||(stringToEncode.charAt(i)>96 && stringToEncode.charAt(i)<123)) {
                encodedLetter = getEncodedLetter(stringToEncode, shift, i);
            }else
            {
                encodedLetter=stringToEncode.charAt(i)+"";
            }
           encodedString=encodedString+encodedLetter;
        }
        return encodedString;

    }


    private String getEncodedLetter(String input, int shift, int index) {
        int encodedCharacter = input.charAt(index) + shift % alphabetLetterNumber;
        if (input.charAt(index)>64 && input.charAt(index)<91) {
            if (encodedCharacter > "Z".charAt(0)) {
                return (char) (input.charAt(index) - (alphabetLetterNumber - shift % alphabetLetterNumber)) + "";
            }
            if (encodedCharacter < "A".charAt(0)) {
                return (char) (input.charAt(index) + (alphabetLetterNumber + shift % alphabetLetterNumber)) + "";
            }
        }else if (input.charAt(index)>96 && input.charAt(index)<123) {
            if (encodedCharacter > "z".charAt(0)) {
                return (char) (input.charAt(index) - (alphabetLetterNumber - shift % alphabetLetterNumber)) + "";
            }
            if (encodedCharacter < "a".charAt(0)) {
                return (char) (input.charAt(index) + (alphabetLetterNumber + shift % alphabetLetterNumber)) + "";
            }
        }
        return (char) (encodedCharacter) + "";
    }
}
