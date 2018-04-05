public class punkt_m {
    /* nowa publiczna klasa o nazwie punkt_m*/
    protected int masa;
    /*konstruktor o nazwie masa*/
    public punkt_m() {

        this.masa=1;
    }
    /*przypisujemy wartość masy =1*/

    public punkt_m(int masa) {

        setMasa(masa);
    }
    /*konstruktor z parametrem masa*/

    public void setMasa(int masa)
    {
        if(masa >0) {
            this.masa = masa;
            return;
        }
        else {
            System.out.println("Sprzecznosc! Masa nie moze byc mniejsza od 0. Masa domyslna=10");
            this.masa = 10;
        }
    }
    /*metoda z parametrem (masa) -> podajemy wartosć parametru masa, sprawdza warunek >0, jeżeli sprzecznośc -> masa=10*/
    public int getMasa() {
        return this.masa;
    }

    public int moment_B() {
        int i = 0;
        return i;
    }
    /*metoda bez parametru*/

    public int moment_B_ST(int x) { return (moment_B() + getMasa()*x*x); }
    /*metoda z parametrem (X) obliczająca moment bezwładnosć z tw S.*/
    public void opis() {
        System.out.println("Punkt Materialny");
    }
    /*metoda zwracajaca opis*/

}