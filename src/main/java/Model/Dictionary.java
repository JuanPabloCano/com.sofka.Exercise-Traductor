package Model;

public class Dictionary {

    // Atributos
    private String spanishWord, englishWord;

    // Constructor
    public Dictionary (String spanishWord, String englishWord){
        this.spanishWord = spanishWord;
        this.englishWord = englishWord;
    }

    // Getters y Setters

    public String getSpanishWord() {
        return spanishWord;
    }

    public void setSpanishWord(String spanishWord) {
        this.spanishWord = spanishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
}
