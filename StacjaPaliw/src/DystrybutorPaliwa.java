public abstract class DystrybutorPaliwa {
    public double kursPaliwa;
    public double kwotaDoZaplaty;
    public double iloscPaliwaDoZatankowania;
    public Klient klient;
    public Platnosc platnosc;

    public abstract void tankuj(double iloscPaliwa);
}
