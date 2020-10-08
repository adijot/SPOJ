/*Input:
2
44051401458
12345678901

        Output:
        D
        N
        */
package Projekty;

import java.util.Scanner;

public class PESEL {
    public static int pobierzPESEL(Scanner daneWejsciowe) throws java.lang.Exception {

        if (daneWejsciowe.hasNext()) {
            int suma = 0;
            String pesel = daneWejsciowe.nextLine();
            String[] PESEL = pesel.split("");
            int[] intPESEL = new int[PESEL.length];
            int[] sprawdzPesel = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
            for (int i = 0; i < PESEL.length; i++) {
                intPESEL[i] = Integer.parseInt(PESEL[i]);
                suma += intPESEL[i] * sprawdzPesel[i];
            }
            return suma;
        }
        return 1;
    }

    public static String sprawdzPESEL(int sumaPESEL) throws java.lang.Exception {
        if (sumaPESEL % 10 == 0) {
            return "D";
        } else {
            return "N";
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner ileProb = new Scanner(System.in);
        int ileRazy = 0;
        if (ileProb.hasNextInt()) {
            ileRazy = ileProb.nextInt();
            int PESEL;
            String[] wynikTablica = new String[ileRazy];

            for (int i = 0; i < ileRazy; i++) {
                Scanner podajPesel = new Scanner(System.in);
                PESEL = pobierzPESEL(podajPesel);
                wynikTablica[i] = sprawdzPESEL(PESEL);
            }
            for (String elementy : wynikTablica) {
                System.out.println(elementy);
            }


        }
    }
}