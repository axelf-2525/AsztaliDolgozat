package futtat;

import java.util.Scanner;
import zsuga.Pakli;

public class Futtathato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pakli mérete: ");
        int pakliMeret = scanner.nextInt();

        System.out.print("Hány lapot nézzünk meg? ");
        int megnezendoLapok = scanner.nextInt();

        Pakli pakli;

        if (pakliMeret > 0) {
            pakli = new Pakli(pakliMeret, "fekete");
        } else {
            pakli = new Pakli();
        }

        System.out.println("\n" + pakli);
        System.out.println("\nA pakli lapjai:");

        pakli.osszesLap();

        int eredmeny = pakli.blackJackLight(megnezendoLapok);

        System.out.println("\nBlackJackLight eredmény: " + eredmeny);
    }
}