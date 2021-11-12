package Utils;

import Model.Dictionary;

import java.io.*;
import java.util.Map;

public class ReadArchive {
    private String translation = "";
    private Dictionary dictionary;

    public void readDict() throws FileNotFoundException {
        FileReader readArchive = new FileReader(Translator.archive);
        BufferedReader buff = new BufferedReader(readArchive);

        // Método para leer el diccionario
        while (translation != null) {
            try {
                translation = buff.readLine();
                if (translation == null) {
                    break;
                } else {
                    if (!translation.isBlank()) {
                        String[] dictWords = translation.split("=");
                        dictionary = new Dictionary(dictWords[0].trim(), dictWords[1].trim()); // Se crea el objeto// dictionary para almacenar las palabras en el HashMap
                        Translator.dict.put(dictWords[0], dictWords[1]);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
