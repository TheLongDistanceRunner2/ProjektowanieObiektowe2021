public class DystrybutorDiesla extends DystrybutorPaliwa {

    public DystrybutorDiesla() {
        super.iloscPaliwaDoZatankowania = 0.0;
        super.kursPaliwa = 0.0;
        super.kwotaDoZaplaty = 0.0;
        super.platnosc = null;
    }

    public DystrybutorDiesla(double iloscPaliwaDoZatankowania, double kursPaliwa,
                             double kwotaDoZaplaty, Platnosc platnosc) {
        this.iloscPaliwaDoZatankowania = iloscPaliwaDoZatankowania;
        this.kursPaliwa = kursPaliwa;
        this.kwotaDoZaplaty = kwotaDoZaplaty;
        this.platnosc = platnosc;
    }

    @Override
    public void tankuj(double iloscPaliwa) {
        this.iloscPaliwaDoZatankowania = iloscPaliwa;
        this.kwotaDoZaplaty = this.iloscPaliwaDoZatankowania * this.kursPaliwa;
    }

    public double getIloscPaliwaDoZatankowania() {
        return super.iloscPaliwaDoZatankowania;
    }
    public double getKursPaliwa() {
        return super.kursPaliwa;
    }

    public double getKwotaDoZaplaty() {
        return super.kwotaDoZaplaty;
    }

    public Platnosc getPlatnosc() {
        return super.platnosc;
    }

    public void setIloscPaliwaDoZatankowania(double iloscPaliwaDoZatankowania) {
        super.iloscPaliwaDoZatankowania = iloscPaliwaDoZatankowania;
    }

    public void setKursPaliwa(double kursPaliwa) {
        super.kursPaliwa = kursPaliwa;
    }

    public void setKwotaDoZaplaty(double kwotaDoZaplaty) {
        super.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    public void setPlatnosc(Platnosc platnosc) {
        super.platnosc = platnosc;
    }
}
