public class Karta extends Platnosc {
    private Autoryzacja autoryzacja;

    public Karta() {
        super.klient = null;
        super.kasjer = null;
        super.kwotaDoZaplaty = 0.0;
        super.rachunek = null;
        this.autoryzacja = null;
    }

    public Karta(Klient klient, Kasjer kasjer, double kwotaDoZaplaty) {
        super.klient = klient;
        super.kasjer = kasjer;
        super.kwotaDoZaplaty = kwotaDoZaplaty;
        super.rachunek = null;
        this.autoryzacja = null;
    }

    @Override
    public void zaplac(double kwotaDoZaplaty) {
        System.out.println("Zapłać kwotę: " + kwotaDoZaplaty + " zł.");
    }
}
