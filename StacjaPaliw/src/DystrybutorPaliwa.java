import java.io.IOException;

public abstract class DystrybutorPaliwa {
    public double kursPaliwa;
    public double kwotaDoZaplaty;
    public double iloscPaliwaDoZatankowania;
    public Klient klient;
    public Platnosc platnosc;

    public abstract void tankuj(double iloscPaliwa) throws IOException, InterruptedException;

    protected void progressBar(long czas) throws IOException, InterruptedException {
        String bar = "|";
        String tmp = "=";
        String arrow = ">";

        System.out.println("\nTankowanie...");

        for (int x = 0 ; x < 50 ; x++) {
            String data = "\r" + bar;

            for (int i = 0; i < x; i++) {
                data += tmp;
            }

            data += arrow;
            data += bar;

            System.out.write(data.getBytes());
            Thread.sleep(czas);
        }

        System.out.println("\nZatankowano! Przejdź do kasy.");
    }
}
