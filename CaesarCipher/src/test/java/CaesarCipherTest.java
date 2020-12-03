import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;


public class CaesarCipherTest {

    /*
    Shift is 1 => "Simple" -> "Tjnqmf" - On hold
    Shift is 0 => "Simple" ->  "Simple" - On hold
    Sift is -1 => "A" -> "Z" - On hold
    Shift is 0 => "A" -> "A" - Done
    Shift is 0 => "B" -> "B"  - Done
    Shift is 1 => "A" -> "B" - Done
    Shift is 1 => "B" -> "C" - Done
    Shift is 2 => "D" -> "F" - Done
    Shift is 0 => "AA" -> "AA" - Done
    Shift is 1 => "AA" -> "BB" - Done
    Shift is 2 => "AAZ" -> "CCB" - Done
    Shift is 26 => "AZA" -> "AZA" - Done
    Shift is 1 => "AZB" -> "BAC" - Done
    Shift is -1 => "AZB" -> "ZYA" - Done
    Shift is 53=> "AZB" -> "BAC" - -Done
    Shift is -79=> "AZB" -> "ZYA" - Done
    Shift is 1 => "AZb" -> "BAc" LowerCase!
     */

    @Test
    public void when_A_Offset0_A(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 0;
        //When
        String result = caesarCipherEncoder.encode("A", shift);

        //Then
        assertThat(result).

        isEqualTo("A");
    }

    @Test
    public void when_B_Offset0_B(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 0;
        //When
        String result = caesarCipherEncoder.encode("B", shift);

        //Then
        assertThat(result).isEqualTo("B");
    }

    @Test
    public void when_A_Offset1_B(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 1;
        //When
        String result = caesarCipherEncoder.encode("A", shift);

        //Then
        assertThat(result).isEqualTo("B");
    }

    @Test
    public void when_B_Offset1_C(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 1;
        //When
        String result = caesarCipherEncoder.encode("B", shift);

        //Then
        assertThat(result).isEqualTo("C");
    }

    @Test
    public void when_D_Offset2_F(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 2;
        //When
        String result = caesarCipherEncoder.encode("D", shift);

        //Then
        assertThat(result).isEqualTo("F");
    }

    @Test
    public void when_AA_Offset0_AA(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 0;
        //When
        String result = caesarCipherEncoder.encode("AA", shift);

        //Then
        assertThat(result).

                isEqualTo("AA");
    }

    @Test
    public void when_AA_Offset1_BB(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 1;
        //When
        String result = caesarCipherEncoder.encode("AA", shift);

        //Then
        assertThat(result).isEqualTo("BB");
    }

    @Test
    public void when_AAZ_Offset2_CCB(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 2;
        //When
        String result = caesarCipherEncoder.encode("AAZ", shift);

        //Then
        assertThat(result).isEqualTo("CCB");
    }

    @Test
    public void when_AZA_Offset26_AZA(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 26;
        //When
        String result = caesarCipherEncoder.encode("AZA", shift);

        //Then
        assertThat(result).isEqualTo("AZA");
    }

    @Test
    public void when_AZB_Offset1_BAC(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 1;
        //When
        String result = caesarCipherEncoder.encode("AZB", shift);

        //Then
        assertThat(result).isEqualTo("BAC");
    }

    @Test
    public void when_AZB_Offset53_BAC(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 53;
        //When
        String result = caesarCipherEncoder.encode("AZB", shift);

        //Then
        assertThat(result).isEqualTo("BAC");
    }

    @Test
    public void when_AZB_OffsetMinus1_ZYA(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = -1;
        //When
        String result = caesarCipherEncoder.encode("AZB", shift);

        //Then
        assertThat(result).isEqualTo("ZYA");
    }

    @Test
    public void when_AZB_OffsetMinus79_ZYA(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = -79;
        //When
        String result = caesarCipherEncoder.encode("AZB", shift);

        //Then
        assertThat(result).isEqualTo("ZYA");
    }

    @Test
    public void when_AZb_Offset1_BAc(){

        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 1;
        //When
        String result = caesarCipherEncoder.encode("AZb", shift);

        //Then
        assertThat(result).isEqualTo("BAc");
    }


//    @Test
//    public void when_SimpleAndShift1_Then_Tjnqmf(){
//        //Given
//        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
//        int shift = 1;
//        //When
//        String result=caesarCipherEncoder.encode("Simple",shift);
//        //Then
//        assertThat(result).isEqualTo("Tjnqmf");
//    }
//
//    @Test
//    public void when_SimpleAndShift0_Then_Simple(){
//        //Given
//        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
//        int shift=0;
//        //When
//        String result=caesarCipherEncoder.encode("Simple",shift);
//
//        //Then
//        assertThat(result).isEqualTo("Simple");
//    }

//    @Test
//    public void when_A_AndShift_minus1_Then_Z(){
//        //Given
//        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
//        int shift=-1;
//        //When
//        String result=caesarCipherEncoder.encode("Simple",shift);
//
//        //Then
//        assertThat(result).isEqualTo("Z");
//    }




}
