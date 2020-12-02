import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CaesarCipherTest {

    /*
    Shift is 1 => "Simple" -> "Tjnqmf" - On hold
    Shift is 0 => "Simple" ->  "Simple" - On hold
    Sift is -1 => "A" -> "Z" - On hold
    Shift is 0 => "A" -> "A"
    Shift is 0 => "B" -> "B"
    Shift is 1 => "A" -> "B"
    Shift is 1 => "B" -> "C"
    Shift is 0 => "AA" -> "AA"
    Shift is 1 => "AA" -> "BB"
    Shift is 2 => "AAZ" -> "CCB"
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
