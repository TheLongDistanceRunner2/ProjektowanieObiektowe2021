import java.util.ArrayList;
import java.util.List;

public class Myjnia {
    private double kwotaDoZaplaty;
    private List<String> programy;
    private Klient klient;
    private Platnosc platnosc;

    public Myjnia() {
        this.kwotaDoZaplaty = 0.0;
        this.programy = new ArrayList<>();
        this.programy.add("Mycie zasadnicze");
        this.programy.add("Spłukiwanie");
        this.programy.add("Woskowanie");
        this.programy.add("Nabłyszczanie");
        this.klient = null;
        this.platnosc = null;
    }

    public Myjnia(double kwotaDoZaplaty, Klient klient, Platnosc platnosc) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
        this.programy = new ArrayList<>();
        this.programy.add("Mycie zasadnicze");
        this.programy.add("Spłukiwanie");
        this.programy.add("Woskowanie");
        this.programy.add("Nabłyszczanie");
        this.klient = klient;
        this.platnosc = platnosc;
    }

    public void umyj(int program) {
        System.out.println("Wybrano program: " + program + ". Start programu!");
    }

    public double getKwotaDoZaplaty() {
        return kwotaDoZaplaty;
    }

    public void setKwotaDoZaplaty(double kwotaDoZaplaty) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    public List<String> getProgramy() {
        return programy;
    }

    public void setProgramy(List<String> programy) {
        this.programy = programy;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        this.platnosc = platnosc;
    }
}
