package Utils;

import java.util.*;
import java.io.*;

public class Translator {

    // Atributos encapsulados
    private String spanishWord, englishWord, searchWord;
    public static String archive = "./Textos/archivo.txt";
    public static Map <String, String> dict = new HashMap<>();


    // Método para añadir palabras al diccionario
    public void addWord(String spanishWord, String englishWord) {
        if (!dict.containsKey(spanishWord) && !dict.containsValue(englishWord)){
            dict.put(spanishWord, englishWord);
        }
        try {
            FileWriter writer = new FileWriter(archive, true);
            writer.write("\r\n"+ spanishWord+ " = "+ englishWord);
            writer.close();
        }catch (IOException e){
            System.out.println("ERROR");
            e.getMessage();
        }
    }

    //Método para imprimir todo el diccionario usando la expresión Lambda
    public Map<String, String> showDict() {

        dict.forEach((k, v) -> System.out.println(k + " = " + v));
        return dict;
    }

    //Método para buscar palabras dentro del diccionario
    public Map<String, String> searchWord(String searchWord) {
        if (dict.containsKey(searchWord)) {
            System.out.println("Su traducción es: " + dict.get(searchWord));
        } else {
            System.out.println(searchWord + " no se encuentra en el diccionario");
        }
        return dict;
    }

    // Setters y Getters

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

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public static String getArchive() {
        return archive;
    }

    public static void setArchive(String archive) {
        Translator.archive = archive;
    }

    public static Map<String, String> getDict() {
        return dict;
    }

    public static void setDict(Map<String, String> dict) {
        Translator.dict = dict;
    }
}
