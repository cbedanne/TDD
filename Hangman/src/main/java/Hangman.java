public class Hangman {

    private String secretWord;

    String letter1 = "";
    String letter2 = "";
    private String letter3="";

    public Hangman() {
    }

    public String checkLetter(String letter) {

        if (letter1.equals("")) {
            letter1 = letter;
        } else if (letter2.equals("")){
            letter2 = letter;
        }else {
            letter3 = letter;
        }


        String foundString = "";
        for (char c : secretWord.toCharArray()) {
            foundString += (letter1.equals(c + "") || letter2.equals(c +"")|| letter3.equals(c +"") ? c : "-");
        }


        return foundString;
    }

    public void setSecretWord(String secretWord){
        this.secretWord =secretWord;
    }
}
