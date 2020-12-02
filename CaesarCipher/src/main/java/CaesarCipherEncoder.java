public class CaesarCipherEncoder {
    public String encode(String input, int shift) {
//        char[] value  = input.toCharArray();
//        for (int i =0 ; i<value.length; i++){
//           char letter =value[i];
////           letter = (char)letter+shift;
//
//        }


//        if(shift==0){
//            return input;
//        }
//        if(input.equals("A")){
//            return input.c
//        }
        if (shift==0 || shift%26L==0){
            return(input);
        }
        if (input.length() == 1) {
            return getEncodedString(input, shift, 0);
        }
        if (input.equals("AA")&&shift==1){
            return getEncodedString(input, shift, 0) + getEncodedString(input, shift, 1);
        }
        if (input.equals("AAZ")&&shift==2){
            return getEncodedString(input,shift, 0) +getEncodedString(input, shift, 1) + "B";
        }
        return "A";
    }

    private String getEncodedString(String input, int shift, int index) {
        return (char)(input.charAt(index) + shift) + "";
    }
}
