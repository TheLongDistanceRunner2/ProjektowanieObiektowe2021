public class Kasjer {
    private int id;

    public Kasjer() {
        this.id = 0;
    }

    public Kasjer(int id) {
        this.id = id;
    }

    public void przyjmijPlatnosc(double kwota) {
        System.out.println("Przyjmuję płatność na kwotę: " + kwota + " zł.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
