import java.io.IOException;

public class DystrybutorDiesla extends DystrybutorPaliwa {

    public DystrybutorDiesla() {
        super.iloscPaliwaDoZatankowania = 0.0;
        super.kursPaliwa = 0.0;
        super.kwotaDoZaplaty = 0.0;
        super.platnosc = null;
    }

    public DystrybutorDiesla(double iloscPaliwaDoZatankowania, double kursPaliwa,
                             double kwotaDoZaplaty, Platnosc platnosc) {
        super.iloscPaliwaDoZatankowania = iloscPaliwaDoZatankowania;
        super.kursPaliwa = kursPaliwa;
        super.kwotaDoZaplaty = kwotaDoZaplaty;
        super.platnosc = platnosc;
    }

    @Override
    public void tankuj(double iloscPaliwa) throws IOException, InterruptedException {
        super.progressBar(100);

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
