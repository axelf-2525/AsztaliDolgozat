package feladatok;

import java.util.Scanner;

public class Kozep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az első pozitív egész számot: ");
        int elso = scanner.nextInt();

        System.out.print("Add meg a második pozitív egész számot: ");
        int masodik = scanner.nextInt();

        if (elso <= 0 || masodik <= 0) {
            System.out.println("Hiba: csak pozitív egész számokat lehet megadni!");
            return;
        }

        double szamtaniKozep = (elso + masodik) / 2.0;
        double mertaniKozep = Math.sqrt(elso * masodik);

        System.out.println("Számtani közép: " + szamtaniKozep);
        System.out.println("Mértani közép: " + mertaniKozep);
    }
}
