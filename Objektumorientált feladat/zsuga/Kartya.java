package zsuga;

public class Kartya {
    private int ertek;
    private String szin;

    public Kartya(int ertek, String szin) {
        if (ertek >= 2 && ertek <= 14) {
            this.ertek = ertek;
        } else {
            this.ertek = 2;
        }

        this.szin = szin;
    }

    public Kartya() {
        this.ertek = 0;
        this.szin = "piros";
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        if (ertek >= 2 && ertek <= 14) {
            this.ertek = ertek;
        }
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return szin + " " + ertek;
    }
}
