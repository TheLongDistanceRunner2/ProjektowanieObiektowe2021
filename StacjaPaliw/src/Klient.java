import java.io.IOException;
import java.util.Scanner;

public class Klient {
    private boolean czyMaKarteStalegoKlienta;
    private int idKarty;
    private double kwotaDoZaplaty;

    public Klient() {
        this.czyMaKarteStalegoKlienta = false;
        this.idKarty = 0;
        this.kwotaDoZaplaty = 0.0;
    };

    public Klient(boolean czyMaKarteStalegoKlienta, int idKarty, double kwotaDoZaplaty) {
        this.czyMaKarteStalegoKlienta = czyMaKarteStalegoKlienta;
        this.idKarty = idKarty;
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    public double getKwotaDoZaplaty() {
        return kwotaDoZaplaty;
    }

    public boolean isCzyMaKarteStalegoKlienta() {
        return czyMaKarteStalegoKlienta;
    }

    public void setCzyMaKarteStalegoKlienta(boolean czyMaKarteStalegoKlienta) {
        this.czyMaKarteStalegoKlienta = czyMaKarteStalegoKlienta;
    }

    public int getIdKarty() {
        return idKarty;
    }

    public void setIdKarty(int idKarty) {
        this.idKarty = idKarty;
    }

    public void setKwotaDoZaplaty(double kwotaDoZaplaty) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    // =================================================================================================================
    // =================================================================================================================
    // =================================================================================================================
     static void platnosc(Klient klient, DystrybutorPaliwa dystrybutorPaliwa) {
        Kasjer kasjer1 = new Kasjer(34);

        System.out.println("\nWybierz formę płatności: 1 - Karta  2 - Gotówka  3 - Rzeton");
        Scanner reader = new Scanner(System.in);
        int menu3 = reader.nextInt();

        // karta:
        if (menu3 == 1) {
            Karta karta1 = new Karta(klient, kasjer1, klient.getKwotaDoZaplaty());
            karta1.getKasjer().przyjmijPlatnosc(dystrybutorPaliwa.kwotaDoZaplaty);

            wyborRachunku(dystrybutorPaliwa.kwotaDoZaplaty);
        }
        // Gotówka:
        else if (menu3 == 2) {

        }
        // Rzeton:
        else if (menu3 == 3) {

        }
        // Błąd
        else {
            System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
        }
    }

    private static void wyborRachunku(double kwotaDoZaplaty) {
        System.out.println("\nWybierz rodzaj rachunku:  1 - Paragon  2 - Faktura");
        Scanner reader = new Scanner(System.in);
        int menu1 = reader.nextInt();

        // paragon:
        if (menu1 == 1) {
            Paragon paragon1 = new Paragon(kwotaDoZaplaty);
            paragon1.wydrukujParagon(kwotaDoZaplaty);
        }
        // faktura:
        else if (menu1 == 2) {
            Faktura faktura1 = new Faktura(kwotaDoZaplaty);
            faktura1.wydrukujFakture(kwotaDoZaplaty);
        }
        else {
            System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
            return;
        }

        System.out.println("\n\nDziękujemy! Zapraszamy ponownie!");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Klient klient1 = new Klient();

        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        double iloscPaliwa = 0.0;

        System.out.println("\nWitamy na stacji paliwowej! Wybierz czynność, którą chcesz wykonać: " +
                "\n 1 - tankowanie 2  - mycie pojazdu 3 - odkurzanie pojazdu");
        Scanner reader = new Scanner(System.in);
        menu1 = reader.nextInt();

        // tankowanie:
        if (menu1 == 1) {
            System.out.println("\nWybierz rodzaj tankowania: 1 - Benzyna  2 - Diesel  3 - LPG");
            menu2 = reader.nextInt();

            DystrybutorPaliwa dystrybutorPaliwa1 = null;

            // benzyna:
            if (menu2 == 1) {
                dystrybutorPaliwa1 = new DystrybutorBenzyny();
                ((DystrybutorBenzyny) dystrybutorPaliwa1).setKursPaliwa(4.53);

                System.out.println("\nKurs benzyny: " + ((DystrybutorBenzyny) dystrybutorPaliwa1).getKursPaliwa() +
                        "\n" + "Podaj ile litrów chcesz zatankować:");
                iloscPaliwa = reader.nextDouble();

                dystrybutorPaliwa1.tankuj(iloscPaliwa);
            }
            // diesiel:
            else if (menu2 == 2) {
                dystrybutorPaliwa1 = new DystrybutorDiesla();
                ((DystrybutorDiesla) dystrybutorPaliwa1).setKursPaliwa(4.42);
            }
            // LPG:
            else if (menu2 == 3) {
                dystrybutorPaliwa1 = new DystrybutorLPG();
                ((DystrybutorLPG) dystrybutorPaliwa1).setKursPaliwa(2.21);
            }
            // błąd
            else {
                System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
                return;
            }

            platnosc(klient1, dystrybutorPaliwa1);
        }
        // myjnia:
        else if (menu1 == 2) {

        }
        // odkurzacz:
        else if (menu1 == 3) {

        }
        else {
            System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
        }
    }
}
