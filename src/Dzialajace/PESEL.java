/*Input:
2
44051401458
12345678901

        Output:
        D
        N
        */
package Dzialajace;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PESEL {

    public static void sprawdzPESEL(int sumaPESEL) throws Exception {
        if (sumaPESEL % 10 == 0) {
            System.out.println("D");
        } else {
            System.out.println("N");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader daneWejsciiowe = new BufferedReader (new InputStreamReader (System.in));
        int iloscProb = Integer.parseInt(daneWejsciiowe.readLine());

        String[] pesel = new String[11];
        int [] PESEL = new int[pesel.length];
        int[] sprawdzPesel = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};

        // pętla odpowiedzialna za ilość prób
        for (int j = 0; j < iloscProb; j++) {
            int suma = 0;
            String s = daneWejsciiowe.readLine();
            // pętla odpowiedzialna za zamiane String'a i zwrócenie sumy poszczególnych liczb
            for (int i = 0; i < 11; i++){
                pesel[i] = String.valueOf(s.charAt(i));
                PESEL[i] = Integer.parseInt(pesel[i]);
                suma += PESEL[i] * sprawdzPesel[i];
            }
            sprawdzPESEL(suma);
        }

    }
}