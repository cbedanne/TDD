public class CaesarCipherEncoder {
    public String encode(String stringToEncode, int shift) {

        char[] charsToEncode  = stringToEncode.toCharArray();
        String encodedString="";
        for (int i =0 ; i<charsToEncode.length; i++){
           String encodedChar = getEncodedLetter(stringToEncode,shift,i);
           encodedString=encodedString+encodedChar;
        }
        return encodedString;

    }

    private String getEncodedLetter(String input, int shift, int index) {
        if (input.charAt(index) + shift>"Z".charAt(0)) {
            return (char)(input.charAt(index) - (26-shift))+"";
        }
        if (input.charAt(index) + shift<"A".charAt(0)) {
            return (char)(input.charAt(index) + (26+shift))+"";
        }
        return (char)(input.charAt(index) + shift) + "";
    }
}
