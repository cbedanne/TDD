public class CaesarCipherEncoder {
    public String encode(String input, int shift) {

//        if(shift==0){
//            return input;
//        }
//        if(input.equals("A")){
//            return input.c
//        }
        char[] value  = input.toCharArray();
        String result="";
        for (int i =0 ; i<value.length; i++){
           String encodeLetter =getEncodedString(input,shift,i);
           result=result+encodeLetter;
        }
        return result;

    }

    private String getEncodedString(String input, int shift, int index) {
        if (input.charAt(index) + shift>"Z".charAt(0)) {
            return (char)(input.charAt(index) - (26-shift))+"";
        }
        if (input.charAt(index) + shift<"A".charAt(0)) {
            return (char)(input.charAt(index) + (26+shift))+"";
        }
        return (char)(input.charAt(index) + shift) + "";
    }
}
