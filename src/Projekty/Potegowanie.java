/* PA05_POT

Dla danych dwóch liczb naturalnych a i b, wyznaczyć ostatnią cyfrę liczby ab.

        Zadanie
        Napisz program, który:
        wczyta ze standardowego wejścia: podstawę a oraz wykładnik b,
        wyznaczy ostatnią cyfrę liczby ab,
        wypisze wynik na standardowe wyjście.
        Wejście
        W pierwszej linii wejścia znajduje się jedna liczba całkowia D (1≤D≤10), oznaczjąca liczbę przypadków do rozważenia. Opis każdego przypadku podany jest w jednym wierszu, zawierającym dwie liczby naturalne a i b oddzielone pojedynczym odstępem (spacją), takie, że (1 ≤ a,b ≤ 1 000 000 000).

        Wyjście
        Dla każdego przypadku z wejścia Twój program powinien wypisać (w osobnej linii dla każdego przypadku z wejścia) cyfrę jedności liczby ab zapisanej dziesiętnie.

        Przykład
        Dla danych wejściowych:
        2
        2 3
        3 3
        poprawną odpowiedzią jest:
        8
        7*/

package Projekty;

import java.util.Scanner;

public class Potegowanie {
    public static void main(String[] args) throws java.lang.Exception {
        int ileRazy;
        Scanner IleRazy = new Scanner(System.in);
        double podstawaA, wykladnikB, wynik;
        int wynikInt;
        if (IleRazy.hasNextInt()){
            ileRazy = IleRazy.nextInt();

            for (int i = 0; i < ileRazy; i++){
                Scanner DaneWejsciowe = new Scanner(System.in);
                if (DaneWejsciowe.hasNextLine()){
                    String daneWejsciowe;
                    daneWejsciowe = DaneWejsciowe.nextLine();
                    String[] lista = daneWejsciowe.split(" ");
                    podstawaA = Double.parseDouble(lista[0]);
                    wykladnikB = Double.parseDouble(lista[1]);
                    wynik = Math.pow(podstawaA, wykladnikB);
                    wynikInt = ((int) wynik) % 10;
                    System.out.println(wynikInt);

                }
            }

        }
        }


        }
