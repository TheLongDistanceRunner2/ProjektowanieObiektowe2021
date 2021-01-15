public class Paragon extends Rachunek {

    public Paragon() {
        super.kwota = 0.0;
    }

    public Paragon(double kwota) {
        super.kwota = kwota;
    }

    public void wydrukujParagon(double kwota) {
        System.out.println("Drukują paragon na kwotę: " + kwota + " zł.");
    }

    public double getKwota() {
        return super.kwota;
    }

    public void setKwota(double kwota) {
        super.kwota = kwota;
    }
}
