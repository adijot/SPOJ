package Projekty;

import java.io.*;

public class WprowadzanieDanych {
    public static void main(String[] args) throws IOException{
        BufferedReader daneWejsciowe = new BufferedReader(new InputStreamReader(System.in));
        String imie;
        do {
            imie = daneWejsciowe.readLine();
            System.out.println(imie);
        }
        while (!imie.isEmpty());

    }
}
