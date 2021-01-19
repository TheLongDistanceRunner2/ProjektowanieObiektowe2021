public class Faktura extends Rachunek {

    public Faktura() {
        super.kwota = 0.0;
    }

    public Faktura(double kwota) {
        super.kwota = kwota;
    }

    public void wydrukujFakture(double kwota) {
        System.out.println("\nDrukuję fakturę na kwotę: " + kwota + " zł.");
    }

    public double getKwota() {
        return super.kwota;
    }

    public void setKwota(double kwota) {
        super.kwota = kwota;
    }
}
