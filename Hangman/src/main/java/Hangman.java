public class Hangman {

    private String secretWord;

    public Hangman() {
    }

    public String checkLetter(String letter) {

        if (secretWord.contains(letter)&&letter!="") {
            String foundString= buildFoundString(letter);
            return foundString;
        }

        if (letter.equals(secretWord)) {
            return secretWord;
        }
        if(secretWord.length()==2){
            return "--";
        }
        return "-";
    }

    private String buildFoundString(String letter) {
        String foundString = "";
        for (char c : secretWord.toCharArray()) {
            String foundCharacter;
            if (c == letter.charAt(0)) {
                foundCharacter = c + "";
            } else {
                foundCharacter = "-";
            }
            foundString = foundString + foundCharacter;
        }
        return foundString;
    }

    public void setSecretWord(String secretWord){

        this.secretWord =secretWord;
    }
}
