package Dzialajace.NowaDzialka;
import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int zestawDanych = scanner.nextInt();
        for (int i = 0; i < zestawDanych; i++){
            int liczbaKrokow = scanner.nextInt();
            System.out.println(liczbaKrokow*liczbaKrokow);
        }
    }
}
