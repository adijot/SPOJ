/*PRIME_T - Liczby Pierwsze
        Sprawdź, które spośród danych liczb są liczbami pierwszymi

        Input
        n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]

        Output
        Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.

        Example
        Input:
        3
        11
        1
        4

        Output:
        TAK
        NIE
        NIE*/
package Projekty;

import java.util.Scanner;

public class LiczbyPierwsze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczbaTestow = scanner.nextInt();

        for (int i = 0; i < liczbaTestow; i++) {
            short liczbaPierwsza = 0;
            float wejscie = scanner.nextFloat();
            for (int j = 1; j <= wejscie; j++) {

                if (wejscie % j == 0) {
                    liczbaPierwsza++;
                }
            }
        if (liczbaPierwsza == 2) {
            System.out.println("TAK");
        }
        else {
            System.out.println("NIE");
        }
        }
    }
}