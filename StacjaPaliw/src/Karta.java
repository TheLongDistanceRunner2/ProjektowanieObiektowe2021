public class Karta extends Platnosc {
    private Autoryzacja autoryzacja;

    public Karta() {
        super.klient = null;
        super.kasjer = null;
        super.kwotaDoZaplaty = 0.0;
        super.rachunek = null;
        this.autoryzacja = null;
    }

    public Karta(Klient klient, Kasjer kasjer, double kwotaDoZaplaty, Rachunek rachunek, Autoryzacja autoryzacja) {
        super.klient = klient;
        super.kasjer = kasjer;
        super.kwotaDoZaplaty = kwotaDoZaplaty;
        super.rachunek = rachunek;
        this.autoryzacja = autoryzacja;
    }

    @Override
    public void zaplac(double kwotaDoZaplaty) {
        System.out.println("Zapłać kwotę: " + kwotaDoZaplaty + " zł.");
    }
}
