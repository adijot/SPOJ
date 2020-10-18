package Dzialajace.PESEL;
import java.util.*;
import java.lang.*;
import java.io.*;

public class PESELver2 {
    public static int pobierzPESEL(String s) throws java.lang.Exception {
        String[] pesel = s.split("");
        int [] PESEL = new int[pesel.length];
        int[] sprawdzPesel = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        int suma = 0;
        for (int i = 0; i < 11; i++){
            PESEL[i] = Integer.parseInt(pesel[i]);
            suma += PESEL[i] * sprawdzPesel[i];
        }
        return suma;
    }
    public static void sprawdzPESEL(int sumaPESEL) throws java.lang.Exception {
        if (sumaPESEL % 10 == 0) {
            System.out.println("D");
        } else {
            System.out.println("N");
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader daneWejsciiowe = new BufferedReader (new InputStreamReader (System.in));
        int iloscProb = Integer.parseInt(daneWejsciiowe.readLine());

        for (int i = 0; i < iloscProb; i++){
            String podajPESEL = daneWejsciiowe.readLine();
            int PESEL = pobierzPESEL(podajPESEL);
            sprawdzPESEL(PESEL);
        }
    }
}