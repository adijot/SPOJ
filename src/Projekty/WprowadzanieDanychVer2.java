package Projekty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WprowadzanieDanychVer2 {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
        String s;
        while (!(s=r.readLine()).isBlank())
            System.out.println(s);
    }
}
