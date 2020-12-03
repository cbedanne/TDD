public class Hangman {

    private String setSecretWord;

    public Hangman() {
    }

    public String checkLetter(String letter) {

        if(setSecretWord.length()==2){
            return "--";
        }
        return "-";
    }


    public void setSecretWord(String secretWord){
        this.setSecretWord=secretWord;
    }
}
