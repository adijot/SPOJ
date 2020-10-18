package Dzialajace.LiczbyPierwsze;
import java.io.*;

public class Main {

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
