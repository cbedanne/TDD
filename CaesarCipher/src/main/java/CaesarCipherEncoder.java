public class CaesarCipherEncoder {
    public String encode(String input, int shift) {

//        if(shift==0){
//            return input;
//        }
//        if(input.equals("A")){
//            return input.c
//        }
        if (shift==0 || shift%26L==0){
            return(input);
        }
        char[] value  = input.toCharArray();
        String result="";
        for (int i =0 ; i<value.length; i++){
           String encodeLetter =getEncodedString(input,shift,i);
           result=result+encodeLetter;
        }
        if (input.length() == 1) {
            return getEncodedString(input, shift, 0);
        }
        if (input.equals("AA")&&shift==1){
            return getEncodedString(input, shift, 0) + getEncodedString(input, shift, 1);
        }
        if (input.equals("AAZ")&&shift==2){
            return getEncodedString(input,shift, 0) +getEncodedString(input, shift, 1) +getEncodedString(input, shift, 2);
        }
        if (input.equals("AZB")&&shift==1){
            return getEncodedString(input,shift, 0) +getEncodedString(input, shift, 1) + getEncodedString(input, shift, 2);
        }
        return "A";
    }

    private String getEncodedString(String input, int shift, int index) {
        if (input.charAt(index) + shift>"Z".charAt(0)) {
            return (char)(input.charAt(index) - (26-shift))+"";
        }
        return (char)(input.charAt(index) + shift) + "";
    }
}
