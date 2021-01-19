public class Autoryzacja {
    private Potwierdzenie potwierdzenie;
    private Bank bank;

    public Autoryzacja() {
        this.potwierdzenie = null;
        this.bank = bank;
    }

    public Autoryzacja(Potwierdzenie potwierdzenie, Bank bank) {
        this.potwierdzenie = potwierdzenie;
        this.bank = bank;
    }

    public boolean autoryzuj() throws InterruptedException {
        System.out.println("Trwa autoryzacja...");
        Thread.sleep(2000);
        return true;
    }

    public Potwierdzenie getPotwierdzenie() {
        return potwierdzenie;
    }

    public void setPotwierdzenie(Potwierdzenie potwierdzenie) {
        this.potwierdzenie = potwierdzenie;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
