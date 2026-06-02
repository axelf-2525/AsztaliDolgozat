package feladatok;

import java.util.Scanner;

public class ParatlanSzamok {

    public static int paratlanokSzama(int[] tomb) {
        int db = 0;

        for (int szam : tomb) {
            if (szam % 2 != 0) {
                db++;
            }
        }

        return db;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hány darab számot szeretnél megadni? ");
        int darab = scanner.nextInt();

        if (darab < 1) {
            System.out.println("Hiba: legalább 1 számot meg kell adni!");
            return;
        }

        int[] szamok = new int[darab];

        for (int i = 0; i < darab; i++) {
            System.out.print((i + 1) + ". szám: ");
            szamok[i] = scanner.nextInt();
        }

        int eredmeny = paratlanokSzama(szamok);

        System.out.println("Páratlan számok száma: " + eredmeny);
    }
}