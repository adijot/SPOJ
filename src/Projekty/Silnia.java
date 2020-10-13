package Projekty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silnia {
    public static void main(String[] args) throws IOException {
        BufferedReader daneWejsciowe = new BufferedReader(new InputStreamReader(System.in));
        int iloscProb = Integer.parseInt(daneWejsciowe.readLine());
        int wynikSilni = 1;
        while (iloscProb>0){
            iloscProb--;
            int cyfraSilni = Integer.parseInt(daneWejsciowe.readLine());
            for ( int i = 1; i <= cyfraSilni; i++){
                wynikSilni *= i;
            }
            System.out.println(wynikSilni);

        }
    }
}
