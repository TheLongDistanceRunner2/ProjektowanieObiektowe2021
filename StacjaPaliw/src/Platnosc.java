public abstract class Platnosc {
    public Klient klient;
    public Kasjer kasjer;
    public double kwotaDoZaplaty;
    public Rachunek rachunek;

    public abstract void zaplac(double kwotaDoZaplaty);
}
