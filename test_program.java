public class test_program {

    public static void main(String[] args)
    {
        vector_2D vector_1 = new vector_2D(5,5);
        vector_2D vector_2 = new vector_2D(1,2);
        //towrzymy dwa nowe wektory
        vector_2D suma = vector_1.suma_vector(vector_2);
        vector_2D roznica = vector_1.roznica_vector(vector_2);
        //dodawanie i odejmowanie
        vector_2D wersor_1 = vector_1.normal();
        vector_2D wersor_2 = vector_2.normal();
        //normalizujemy
        vector_2D multi1 = vector_1.multi_vector(5);
        //mnozymy wektor nr 1 razy 5
        System.out.println("Wektor nr 1: ");
        System.out.println("Dlugosc: " + vector_1.dlugosc());
        System.out.println("znormalizowany: A=" + wersor_1.x + "*i + " + wersor_1.y+"*j");
        System.out.println("..............");
        System.out.println("Wektor nr 2: ");
        System.out.println("Dlugosc: " + vector_2.dlugosc());
        System.out.println("znormalizowany: B=" + wersor_2.x + "*i + " + wersor_2.y+"*j");
        System.out.println("..............");
        System.out.println("Suma wektorów A+B=" + suma.x + "*i + " + suma.y+"*j");
        System.out.println("Roznica wektorów A-B=" + roznica.x + "*i + " + roznica.y+"*j");
        System.out.println("..............");
        System.out.println("Wektor nr 1 pomnozony przez 5:");
        System.out.println("5*A=" + multi1.x + "*i +" + multi1.y+"*j");



    }
}
