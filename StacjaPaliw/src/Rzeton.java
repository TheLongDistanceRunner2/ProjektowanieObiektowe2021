public class Rzeton extends Platnosc {

    public Rzeton() {
        super.klient = null;
        super.kasjer = null;
        super.kwotaDoZaplaty = 0.0;
        super.rachunek = null;
    }

    public Rzeton(Klient klient, double kwotaDoZaplaty) {
        super.klient = klient;
        super.kasjer = kasjer;
        super.kwotaDoZaplaty = kwotaDoZaplaty;
        super.rachunek = null;
    }

    @Override
    public void zaplac(double kwotaDoZaplaty) {
        System.out.println("Ilość impulsów: " + kwotaDoZaplaty);
    }
}
