public class Gotowka extends Platnosc {

    public Gotowka() {
        super.klient = null;
        super.kasjer = null;
        super.kwotaDoZaplaty = 0.0;
        super.rachunek = null;
    }

    public Gotowka(Klient klient, Kasjer kasjer, double kwotaDoZaplaty, Rachunek rachunek) {
        super.klient = klient;
        super.kasjer = kasjer;
        super.kwotaDoZaplaty = kwotaDoZaplaty;
        super.rachunek = rachunek;
    }

    @Override
    public void zaplac(double kwotaDoZaplaty) {
        System.out.println("Zapłać kwotę: " + kwotaDoZaplaty + " zł.");
    }
}
