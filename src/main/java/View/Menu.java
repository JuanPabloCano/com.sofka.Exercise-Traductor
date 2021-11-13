package View;

import Utils.ReadArchive;
import Utils.Translator;

import java.io.*;
import java.util.*;

public class Menu {

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);

        //Instancia de clase
        Translator tr = new Translator();

        // Se verifica si existe la palabra en el diccionario
        ReadArchive read = new ReadArchive();
        try {
            read.readDict();
        } catch (FileNotFoundException e) {
            System.out.println("Error al cargar el diccionario");
        }

        //Variables globales
        boolean exit = true;
        int selection;
        String esp;
        String ingl;
        String searchWord;

        try {
            do {
                System.out.println("Bienvenido al traductor Español-Inglés");
                System.out.println("1. Añadir palabras\n" + "2. Buscar palabras\n" + "3. Leer todo el diccionario\n" + "4. " + "Salir\n");

                selection = sc.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("Añada una palabra en español y su traducción");
                        esp = bf.readLine();
                        ingl = bf.readLine();
                        tr.addWord(esp.toLowerCase(), ingl.toLowerCase());
                        break;
                    case 2:
                        System.out.println("Ingrese una palabra para su búsqueda");
                        searchWord = bf.readLine();
                        tr.searchWord(searchWord.toLowerCase());
                        break;
                    case 3:
                        tr.showDict();
                        break;
                    case 4:
                        exit = false;
                        break;
                    case 5:
                        System.out.println("Número equivocado");
                        break;
                }
            } while (exit);

        } catch (IOException e) {
            System.out.println("FATAL");
            e.getMessage();
        }
    }
}


