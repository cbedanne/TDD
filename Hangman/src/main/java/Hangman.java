public class Hangman {

    private String secretWord;

    public Hangman() {
    }

    public String checkLetter(String letter) {


        String foundString = "";
        for (char c : secretWord.toCharArray()) {
            foundString += (letter.equals(c + "") ? c : "-");
        }

        return foundString;
    }

    public void setSecretWord(String secretWord){
        this.secretWord =secretWord;
    }
}
