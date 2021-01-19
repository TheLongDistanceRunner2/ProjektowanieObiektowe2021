public abstract class Platnosc {
    public Klient klient;
    public Kasjer kasjer;
    public double kwotaDoZaplaty;
    public Rachunek rachunek;

    public abstract void zaplac(double kwotaDoZaplaty);

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Kasjer getKasjer() {
        return kasjer;
    }

    public void setKasjer(Kasjer kasjer) {
        this.kasjer = kasjer;
    }

    public double getKwotaDoZaplaty() {
        return kwotaDoZaplaty;
    }

    public void setKwotaDoZaplaty(double kwotaDoZaplaty) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    public Rachunek getRachunek() {
        return rachunek;
    }

    public void setRachunek(Rachunek rachunek) {
        this.rachunek = rachunek;
    }
}
