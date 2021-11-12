package Classes;

import java.util.*;

public class Traductor {

    // Atributos encapsulados
    private String spanishWord, englishWord, searchWord;
    private Map <String, String> dict = new HashMap<>();


    // Método para añadir palabras al diccionario
    public void addWord (String spanishWord, String englishWord){
        this.spanishWord = spanishWord;
        this.englishWord = englishWord;
        this.dict.put(spanishWord, englishWord);
    }

    //Método para imprimir todo el diccionario usando la expresión Lambda
    public Map <String, String> showDict(){

        dict.forEach((k,v) -> System.out.println(k +" = "+ v));
        return dict;
    }

    //Método para buscar palabras dentro del diccionario
    public Map<String, String> searchWord(String searchWord){
        if (dict.containsKey(searchWord)){
            System.out.println("Su traducción es: "+ dict.get(searchWord));
        }else {
            System.out.println(searchWord + " no se encuentra en el diccionario");
        }
        return dict;
    }


    //
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

    public String getSearchWord(){
        return searchWord;
    }

    public void setSearchWord(String searchWord){
        this.searchWord = searchWord;
    }

    public Map<String, String> getDict() {
        return dict;
    }

    public void setDict(Map<String, String> dict) {
        this.dict = dict;
    }
}
