import java.util.ArrayList;
public class program_test {

    public static void main(String[] args) {
        walec walec1 = new walec(100, 10, 5, 5);
        {
            System.out.println("Obiekt walec1");
            walec1.opis_walec();
            System.out.println("Masa " + walec1.getMasa());
            System.out.println("Srednica " + walec1.srednica);
            System.out.println("Dlugosc  " + walec1.dlugosc);
            System.out.println("Glowny moment bezwladnosci " + walec1.moment_B());
            System.out.println("Moment bezwladnosci z tw. Steinera " + walec1.moment_B_ST(x));
            System.out.println(" ");

        }
        kula kula1 = new kula(100, 10, 6);
        {
            System.out.println("Obiekt kula1");
            kula1.opis_kula();
            System.out.println("Masa " + kula1.getMasa());
            System.out.println("Srednica " + kula1.srednica);
            System.out.println("Glowny moment bezwladnosci " + kula1.moment_B());
            System.out.println("Moment bezwladnosci z tw. Steinera " + kula1.moment_B_ST(x));
            System.out.println(" ");
        }

        pret pret1 = new pret(100, 10, 5, 7);
        {
            System.out.println("Obiekt pret1");
            pret1.opis_pret();
            System.out.println("Masa " + pret1.getMasa());
            System.out.println("Srednica " + pret1.srednica);
            System.out.println("Dlugosc  " + pret1.dlugosc);
            System.out.println("Glowny moment bezwladnosci " + pret1.moment_B());
            System.out.println("Moment bezwladnosci z tw. Steinera " + pret1.moment_B_ST(x));
            System.out.println(" ");

        }
    }
}

