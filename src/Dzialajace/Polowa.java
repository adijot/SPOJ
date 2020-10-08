/*
ZROBIONE

        POL - Połowa
        Dla podanego ciągu długości 2*k, wypisz na standardowe wyjście dokładnie pierwszą połowę ciągu.

        Wejście
        W pierwszej linijce wejścia znajduje się jedna liczba całkowita t (1<=t<=100). Każdy wiersz o numerze od 2 do t+1, zawiera ciąg długości 2*k (1<=k<=1000).

        Wyjście
        Dla każdego przypadku testowego na wyjściu powinien pojawić się ciąg będący pierwszą połową wczytanego ciągu.

        Example
        Wejście:
        3
        pierwszy
        lubiec
        ktotozrobi

        Output:
        pier
        lub
        ktoto*/
package Dzialajace;

import java.util.Scanner;

public class Polowa {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        short ileRazy = scanner.nextShort();
        for (short i = 0; i < ileRazy; i++){
            Scanner string = new Scanner(System.in);
            String ciag = scanner.next();
            System.out.println(ciag.substring(0, ciag.length()/2));
        }
    }
}
