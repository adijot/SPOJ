/*
 * ZROBIONE
        SUMA - Suma
        Napisz program, który oblicza sumę pojawiających się na wejściu liczb.

        Wejście
        Na wejście programu podana zostanie pewna nieokreślona, ale niewielka ilość małych liczb całkowitych (z zakresu -100..100).
        Poszczególne liczby zostaną rozdzielone znakiem nowej linii.

        Wyjście
        Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja jest równa sumie i pierwszych wczytanych z wejścia liczb.
        Poszczególne liczby należy rozdzielić znakami nowej linii.

        Przykład
        Wejście:
        6
        8
        -3

        Wyjście:
        6
        14
        11
*/

package Dzialajace;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        short suma =0;
        short wejscie;
        while (scaner.hasNextShort()){
            wejscie = scaner.nextShort();
            suma += wejscie;
            System.out.println(suma);
        }

    }
}
