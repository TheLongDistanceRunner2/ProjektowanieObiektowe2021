public class Klient {
    private boolean czyMaKarteStalegoKlienta;
    private int idKarty;
    private double kwotaDoZaplaty;

    public Klient() {
        this.czyMaKarteStalegoKlienta = false;
        this.idKarty = 0;
        this.kwotaDoZaplaty = 0.0;
    };

    public Klient(boolean czyMaKarteStalegoKlienta, int idKarty, double kwotaDoZaplaty) {
        this.czyMaKarteStalegoKlienta = czyMaKarteStalegoKlienta;
        this.idKarty = idKarty;
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    public double getKwotaDoZaplaty() {
        return kwotaDoZaplaty;
    }

    public boolean isCzyMaKarteStalegoKlienta() {
        return czyMaKarteStalegoKlienta;
    }

    public void setCzyMaKarteStalegoKlienta(boolean czyMaKarteStalegoKlienta) {
        this.czyMaKarteStalegoKlienta = czyMaKarteStalegoKlienta;
    }

    public int getIdKarty() {
        return idKarty;
    }

    public void setIdKarty(int idKarty) {
        this.idKarty = idKarty;
    }

    public void setKwotaDoZaplaty(double kwotaDoZaplaty) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }
}
