public class Hangman {

    private String secretWord;

    public Hangman() {
    }

    public String checkLetter(String letter) {

        if (letter.equals(secretWord)) {
            return secretWord;
        }
        if(secretWord.length()==2){
            return "--";
        }
        return "-";
    }

    public void setSecretWord(String secretWord){
        this.secretWord =secretWord;
    }
}
