package Dzialajace.Suma;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
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
