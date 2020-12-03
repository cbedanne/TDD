public class Hangman {

    private String secretWord;

    public Hangman() {
    }

    public String checkLetter(String letter) {

        int secretWordlength=secretWord.length();
        String foundString="";
        if (secretWord.contains(letter)&&letter!="") {
            foundString= buildFoundString(letter);

        }
        else
        {
            for (int i=1;i<=secretWordlength;i++){
                foundString=foundString+"-";
            }
        }
        return foundString;
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
