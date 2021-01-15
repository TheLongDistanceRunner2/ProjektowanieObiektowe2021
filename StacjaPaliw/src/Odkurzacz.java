public class Odkurzacz {
    private double kwotaDoZaplaty;
    private Klient klient;
    private Platnosc platnosc;

    public Odkurzacz() {
        this.kwotaDoZaplaty = 0.0;
        this.klient = null;
        this.platnosc = null;
    }

    public Odkurzacz(double kwotaDoZaplaty, Klient klient, Platnosc platnosc) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
        this.klient = klient;
        this.platnosc = platnosc;
    }

    public void odkurz(double kwotaDoZaplaty) {
        System.out.println("Odkurzanie za kwotę: " + kwotaDoZaplaty + " zł.");
    }

    public double getKwotaDoZaplaty() {
        return kwotaDoZaplaty;
    }

    public void setKwotaDoZaplaty(double kwotaDoZaplaty) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        this.platnosc = platnosc;
    }
}
