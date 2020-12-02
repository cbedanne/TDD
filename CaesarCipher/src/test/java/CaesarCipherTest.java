import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CaesarCipherTest {

    /*
    Shift is 0 => "Simple" ->  "Simple"
    Shift is 1 => "Simple" -> "Tjnqmf" - Done
    Shift is -1 => "A" ->"Z"
     */

    @Test
    public void when_SimpleAndShift1_Then_Tjnqmf(){
        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift = 1;
        //When
        String result=caesarCipherEncoder.encode("Simple",shift);
        //Then
        assertThat(new String("Tjnqmf")).isEqualTo( result);
    }

    @Test
    public void when_SimpleAndShift0_Then_Simple(){
        //Given
        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();
        int shift=0;
        //When
        String result=caesarCipherEncoder.encode("Simple",shift);

        //Then
        assertThat("Simple").isEqualTo(result);

    }
}
