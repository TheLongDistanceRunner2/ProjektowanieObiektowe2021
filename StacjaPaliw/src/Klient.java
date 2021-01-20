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
     static void platnoscTankowanie(Klient klient, DystrybutorPaliwa dystrybutorPaliwa) throws InterruptedException {
        Kasjer kasjer1 = new Kasjer(34);

        System.out.println("\nWybierz formę płatności: 1 - Karta  2 - Gotówka");
        Scanner reader = new Scanner(System.in);
        int menu3 = reader.nextInt();

        // karta:
        if (menu3 == 1) {
            Karta karta1 = new Karta(klient, kasjer1, klient.getKwotaDoZaplaty());
            karta1.getKasjer().przyjmijPlatnosc(dystrybutorPaliwa.kwotaDoZaplaty);
            karta1.setAutoryzacja(new Autoryzacja());
            karta1.getAutoryzacja().setBank(new Bank());
            karta1.getAutoryzacja().autoryzuj();
            karta1.getAutoryzacja().getBank().potwierdzPlatnosc();

            wyborRachunku(dystrybutorPaliwa.kwotaDoZaplaty);
        }
        // Gotówka:
        else if (menu3 == 2) {
            Gotowka gotowka1 = new Gotowka(klient, kasjer1, klient.getKwotaDoZaplaty());
            gotowka1.getKasjer().przyjmijPlatnosc(dystrybutorPaliwa.kwotaDoZaplaty);

            wyborRachunku(dystrybutorPaliwa.kwotaDoZaplaty);
        }
        // Błąd
        else {
            System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
        }
    }

    private static void platnoscMyjnia(Klient klient, Myjnia myjnia) {
        Kasjer kasjer1 = new Kasjer(34);

        System.out.println("\nWybierz formę płatności: 1 - Gotówka  2 - Rzeton");
        Scanner reader = new Scanner(System.in);
        int menu3 = reader.nextInt();

        // gotówka:
        // rzeton:
        if (menu3 == 1) {
            Gotowka gotowka1 = new Gotowka(klient, kasjer1, klient.getKwotaDoZaplaty());
            gotowka1.getKasjer().przyjmijPlatnosc(myjnia.getKwotaDoZaplaty());

            wyborRachunku(myjnia.getKwotaDoZaplaty());
        }
        // Rzeton:
        else if (menu3 == 2) {
            Rzeton rzeton1 = new Rzeton(klient, myjnia.getKwotaDoZaplaty());
            rzeton1.zaplac(myjnia.getKwotaDoZaplaty());
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

                System.out.println("\nKurs Diesla: " + ((DystrybutorDiesla) dystrybutorPaliwa1).getKursPaliwa() +
                        "\n" + "Podaj ile litrów chcesz zatankować:");
                iloscPaliwa = reader.nextDouble();

                dystrybutorPaliwa1.tankuj(iloscPaliwa);
            }
            // LPG:
            else if (menu2 == 3) {
                dystrybutorPaliwa1 = new DystrybutorLPG();
                ((DystrybutorLPG) dystrybutorPaliwa1).setKursPaliwa(2.21);

                System.out.println("\nKurs LPG: " + ((DystrybutorLPG) dystrybutorPaliwa1).getKursPaliwa() +
                        "\n" + "Podaj ile litrów chcesz zatankować:");
                iloscPaliwa = reader.nextDouble();

                dystrybutorPaliwa1.tankuj(iloscPaliwa);
            }
            // błąd
            else {
                System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
                return;
            }

            platnoscTankowanie(klient1, dystrybutorPaliwa1);
        }
        // myjnia:
        else if (menu1 == 2) {
            Myjnia myjnia1 = new Myjnia();

            System.out.println("Wprowadź kwotę:");
            reader = new Scanner(System.in);
            int zaplacono = reader.nextInt();
            myjnia1.setKwotaDoZaplaty(zaplacono);

            platnoscMyjnia(klient1, myjnia1);

            System.out.println("\nWybierz program:  1 - " + myjnia1.getProgramy().get(0)
                    + "  2 - " + myjnia1.getProgramy().get(1)
                    + "  3 - " + myjnia1.getProgramy().get(2)
                    + "  4 - " + myjnia1.getProgramy().get(3));

            reader = new Scanner(System.in);
            int menu5 = reader.nextInt();

            if (menu5 == 1 || menu5 == 2 || menu5 == 3 || menu5 == 4) {
                myjnia1.umyj(menu5);
            }
            else {
                System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
            }
        }
        // odkurzacz:
        else if (menu1 == 3) {
            Odkurzacz odkurzacz1 = new Odkurzacz();

            System.out.println("Wrzuć rzeton:");
            reader = new Scanner(System.in);
            int zaplacono = reader.nextInt();
            odkurzacz1.setKwotaDoZaplaty(zaplacono);

            if (zaplacono == 1 || zaplacono == 2 || zaplacono == 3) {
                odkurzacz1.odkurz(zaplacono);
            }
            else {
                System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
            }
        }
        else {
            System.out.println("Wprowadzono niepoprawną liczbę. Koniec programu");
        }
    }
}
