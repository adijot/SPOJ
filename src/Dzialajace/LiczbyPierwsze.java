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
package Dzialajace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LiczbyPierwsze {


    public static void main(String[] args) throws IOException {
        BufferedReader daneWejsciowe = new BufferedReader(new InputStreamReader(System.in));
        int liczbaTestow = Integer.parseInt(daneWejsciowe.readLine());
        while (liczbaTestow>0){
            liczbaTestow--;
            short iloscDzielnikow = 0;

            int testowanaLiczba = Integer.parseInt(daneWejsciowe.readLine());
            for (int i = 1; i <= testowanaLiczba; i++){
                if (testowanaLiczba%i == 0){
                    iloscDzielnikow++;
                }
            }
            if (iloscDzielnikow == 2){
                System.out.println("TAK");
            }
            if (iloscDzielnikow != 2){
                System.out.println("NIE");
            }
        }

        }
    }
