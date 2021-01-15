public class Paragon extends Rachunek {
    private double kwota;

    public Paragon() {
        this.kwota = 0.0;
    }

    public Paragon(double kwota) {
        this.kwota = kwota;
    }

    public void wydrukujParagon(kwota) {
        System.out.println("Drukują paragon na kwotę: " + kwota + " zł.");
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }
}
