public class Potwierdzenie {
    private boolean czyPotwierdzono;

    public Potwierdzenie() {
        this.czyPotwierdzono = false;
    }

    public Potwierdzenie(boolean czyPotwierdzono) {
        this.czyPotwierdzono = czyPotwierdzono;
    }

    public void wydrukujPotwierdzenie() {
        System.out.println("Drukuję potwierdzenie");
    }

    public boolean isCzyPotwierdzono() {
        return czyPotwierdzono;
    }

    public void setCzyPotwierdzono(boolean czyPotwierdzono) {
        this.czyPotwierdzono = czyPotwierdzono;
    }
}
