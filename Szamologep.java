package feladatok;

import java.util.Scanner;

public class Szamologep {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Első szám: ");
        double a = scanner.nextDouble();

        System.out.print("Operátor (+, -, *, /): ");
        String muvelet = scanner.next();

        System.out.print("Második szám: ");
        double b = scanner.nextDouble();

        double eredmeny;

        switch (muvelet) {
            case "+":
                eredmeny = a + b;
                break;

            case "-":
                eredmeny = a - b;
                break;

            case "*":
                eredmeny = a * b;
                break;

            case "/":
                if (b == 0) {
                    System.out.println("Nullával nem lehet osztani!");
                    return;
                }
                eredmeny = a / b;
                break;

            default:
                System.out.println("Ismeretlen művelet!");
                return;
        }

        System.out.println("Eredmény: " + eredmeny);
    }
}