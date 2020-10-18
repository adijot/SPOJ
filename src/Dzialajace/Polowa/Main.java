package Dzialajace.Polowa;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        short ileRazy = scanner.nextShort();
        for (short i = 0; i < ileRazy; i++){
            Scanner string = new Scanner(System.in);
            String ciag = scanner.next();
            System.out.println(ciag.substring(0, ciag.length()/2));
        }
    }
}
