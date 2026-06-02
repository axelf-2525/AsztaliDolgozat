package zsuga;

import java.util.Random;

public class Pakli {
    private Kartya[] kartyak;
    private final String jokerSzin;

    public Pakli(int maximalisLapszam, String jokerSzin) {
        this.kartyak = new Kartya[maximalisLapszam];
        this.jokerSzin = jokerSzin;

        feltoltVeletlenKartyakkal();
    }

    public Pakli() {
        this.kartyak = new Kartya[52];
        this.jokerSzin = "fekete";

        feltoltVeletlenKartyakkal();
    }

    private void feltoltVeletlenKartyakkal() {
        Random random = new Random();

        for (int i = 0; i < kartyak.length; i++) {
            int ertek = random.nextInt(13) + 2;
            String szin;

            if (random.nextBoolean()) {
                szin = "piros";
            } else {
                szin = "fekete";
            }

            kartyak[i] = new Kartya(ertek, szin);
        }
    }

    public Kartya getKartya(int index) {
        if (index >= 0 && index < kartyak.length) {
            return kartyak[index];
        }

        return new Kartya();
    }

    public int getMaximalisLapszam() {
        return kartyak.length;
    }

    public void osszesLap() {
        for (Kartya kartya : kartyak) {
            System.out.println(kartya);
        }
    }

    @Override
    public String toString() {
        return kartyak.length + " lapos kartyapakli " + jokerSzin + " joker szinnel";
    }

    public int blackJackLight(int hanyKartyatNezzunk) {
        int osszeg = 0;
        int darab = Math.min(hanyKartyatNezzunk, kartyak.length);

        for (int i = 0; i < darab; i++) {
            osszeg += kartyaPontErtek(kartyak[i]);
        }

        return osszeg;
    }

    public int blackJackLight(Kartya keresettKartya) {
        int osszeg = 0;

        for (Kartya kartya : kartyak) {
            osszeg += kartyaPontErtek(kartya);

            if (kartya.getErtek() == keresettKartya.getErtek()
                    && kartya.getSzin().equals(keresettKartya.getSzin())) {
                break;
            }
        }

        return osszeg;
    }

    private int kartyaPontErtek(Kartya kartya) {
        if (kartya.getSzin().equals(jokerSzin)) {
            return kartya.getErtek();
        }

        return (int) Math.ceil(kartya.getErtek() / 2.0);
    }

    public void egyszinuPakli() {
        for (Kartya kartya : kartyak) {
            kartya.setSzin(jokerSzin);
        }
    }
}
