import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HangManTest {
    /*
    When SecretWord A proposed nothing _
    When SecretWord AB proposed nothing __
    When SecretWord A proposed A return A
    When SecretWord A proposed B return _
    When SecretWord secret proposed e return -e--e-
    When SecretWord secret proposed g return ------
    When SecretWord secret completed word -e--e- proposed z return -e--e-
    When SecretWord secret completed word -e--e- proposed t return -e--et
     */

    @Test
    public void when_A_Proposed_Nothing_Then_(){
        //Given
        String letter="";
        //When

        //Then
        assertThat(new Hangman().checkLetter(letter)).isEqualTo("-");

        assertThat(Boolean.TRUE);
    }






}
