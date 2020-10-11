package Projekty;
// Wprowadzanie danych przez stdin dla SPOJ przy użyciu metody BufferedReader.
// Zastosowanie Scanner kończy się błędem.

import java.io.*;

public class WprowadzanieDanych {
    public static void main(String[] args) throws IOException{
        BufferedReader daneWejsciowe = new BufferedReader(new InputStreamReader(System.in));
        String imie;
            imie = daneWejsciowe.readLine();
            System.out.println(imie);
    }
}
