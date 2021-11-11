package Classes;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lecture {

    public void leer (String nombreArchivo){

        try{
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buff = new BufferedReader(r);

            String temp = "";

            while (temp != null){
                temp = buff.readLine();
                if (temp == null){
                    break;
                }
                System.out.println(temp);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
