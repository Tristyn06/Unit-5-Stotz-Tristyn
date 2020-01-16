public class Slogan {
    private String phrase;

    private static int phraseNumber;

    public Slogan (String inputPhrase){
        phrase = inputPhrase;
        phraseNumber++;
    }

    public String toString(){
        return phrase;
    }
    public static int getPhraseNumber(){

        return phraseNumber++;
    }
}
