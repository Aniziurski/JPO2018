public class pret extends punkt_m
{ protected int dlugosc;
    protected int srednica;
    protected int x;
    protected int masa;

    public pret(int dlugosc, int srednica,int masa, int x) {
        super.setMasa(masa);
        super.moment_B();
        super.moment_B_ST(x);
        setDlugosc(dlugosc);
        setSrednica(srednica);

    }
    public void setDlugosc (int dlugosc)
    {
        if(dlugosc >0) {
            this.dlugosc = dlugosc;
            return;
        }
        else {
            System.out.println("Sprzecznosc! Dlugosc nie moze byc mniejsza od 0. Masa domyslna=100");
            this.dlugosc = 100;
        }
    }
    public void setSrednica (int srednica)
    {
        if(srednica >0) {
            this.srednica = srednica;
            return;
        }
        else {
            System.out.println("Sprzecznosc! Srednica nie moze byc mniejsza od 0. Masa domyslna=10");
            this.srednica = 10;
        }
    }
    public void opis_pret() {
        System.out.println("Figura: pręt");

    }

}



