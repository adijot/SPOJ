/*Input:
2
44051401458
12345678901

        Output:
        D
        N
        */
package Projekty;
import java.util.*;
import java.lang.*;
import java.io.*;

public class PESEL {
    public static int pobierzPESEL() throws java.lang.Exception {
        BufferedReader daneWejsciiowe = new BufferedReader (new InputStreamReader (System.in));
        String s = daneWejsciiowe.readLine();
        String[] pesel = new String[11];
        int [] PESEL = new int[pesel.length];
        int[] sprawdzPesel = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        int suma = 0;

        for (int i = 0; i < 11; i++){
            pesel[i] = String.valueOf(s.charAt(i));
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

        for (int i = 0; i <iloscProb; i++){
            int suma = pobierzPESEL();
            sprawdzPESEL(suma);

        }
    }
}