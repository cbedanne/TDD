import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HangManTest {
    /*
    When SecretWord A proposed nothing _  Done
    When SecretWord AB proposed nothing __  Done
    When SecretWord A proposed A return A  Done
    When SecretWord A proposed B return -  Done
    When SecretWord AB proposed C return --  Done
    When SecretWord ABC proposed B return -B-  Done
    When SecretWord secret proposed e return -e--e-  Done
    When SecretWord secret proposed g return ------
    When SecretWord secret completed word -e--e- proposed z return -e--e-
    When SecretWord secret completed word -e--e- proposed t return -e--et
     */

    @Test
    public void when_A_Proposed_Nothing_Then_(){
        //Given
        String letter="";
        String secretWord="A";
        //When
        Hangman hangman=new Hangman();
        hangman.setSecretWord(secretWord);
        //Then
        assertThat(hangman.checkLetter(letter)).isEqualTo("-");
    }

    @Test
    public void when_AB_Proposed_Nothing_Then__(){
        //Given
        String letter="";
        String secretWord="AB";
        //When
        Hangman hangman=new Hangman();
        hangman.setSecretWord(secretWord);
        //Then
        assertThat(hangman.checkLetter(letter)).isEqualTo("--");
    }

    @Test
    public void when_A_Proposed_A_Then_A(){
        //Given
        String letter="A";
        String secretWord="A";
        //When
        Hangman hangman=new Hangman();
        hangman.setSecretWord(secretWord);
        //Then
        assertThat(hangman.checkLetter(letter)).isEqualTo("A");
    }

    @Test
    public void when_A_Proposed_B_Then__(){
        //Given
        String letter="B";
        String secretWord="A";
        //When
        Hangman hangman=new Hangman();
        hangman.setSecretWord(secretWord);
        //Then
        assertThat(hangman.checkLetter(letter)).isEqualTo("-");
    }

    @Test
    public void when_AB_Proposed_C_Then__(){
        //Given
        String letter="C";
        String secretWord="AB";
        //When
        Hangman hangman=new Hangman();
        hangman.setSecretWord(secretWord);
        //Then
        assertThat(hangman.checkLetter(letter)).isEqualTo("--");
    }

    @Test
    public void when_ABC_Proposed_B_Then_B_(){
        //Given
        String letter="B";
        String secretWord="ABC";
        //When
        Hangman hangman=new Hangman();
        hangman.setSecretWord(secretWord);
        //Then
        assertThat(hangman.checkLetter(letter)).isEqualTo("-B-");
    }

    @Test
    public void when_secret_Proposed_e_Then_e__e_(){
        //Given
        String letter="e";
        String secretWord="secret";
        //When
        Hangman hangman=new Hangman();
        hangman.setSecretWord(secretWord);
        //Then
        assertThat(hangman.checkLetter(letter)).isEqualTo("-e--e-");
    }




}
