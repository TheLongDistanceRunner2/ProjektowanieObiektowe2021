public class Bank {
    private String nazwa;

    public Bank() {
        this.nazwa = null;
    }

    public Bank(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean potwierdzPlatnosc() {
        System.out.println("Potwierdzam płatność...");
        return true;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
