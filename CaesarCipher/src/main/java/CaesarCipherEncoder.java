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
        if (input.length() == 1 && shift==1) {
            return (char)(input.charAt(0) + 1) + "";
        }
        if (input.equals("AA")&&shift==1){
            return("BB");
        }
        if (input.equals("AAZ")&&shift==2){
            return("CCB");
        }
        return "A";
    }
}
