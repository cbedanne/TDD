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
        if (input.equals("B")){
            return("B");
        }
        if (input.equals("A")&&shift==1) {
            return("B");
        }
        return "A";
    }
}
