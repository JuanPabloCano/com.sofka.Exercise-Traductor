package Classes;

import java.util.HashMap;

public class Traductor {

    private String spanishWord;
    private String englishWord;
    private HashMap <String, String> dict = new HashMap<>();


    public void addWord (String spanishWord, String englishWord){
        this.spanishWord = spanishWord;
        this.englishWord = englishWord;
        this.dict.put(spanishWord, englishWord);
    }

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

    public HashMap<String, String> getDict() {
        return dict;
    }

    public void setDict(HashMap<String, String> dict) {
        this.dict = dict;
    }
}
