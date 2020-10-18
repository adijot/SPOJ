package Dzialajace.Samolot;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner wejscie = new Scanner(System.in);
        int n1 = wejscie.nextInt();
        int k1 = wejscie.nextInt();
        int n2 = wejscie.nextInt();
        int k2 = wejscie.nextInt();
        System.out.println((n1*k1)+(n2*k2));
    }
}
