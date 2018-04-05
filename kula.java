public class kula extends punkt_m
    {
        public int srednica;
        public int x;
        public int masa;

        public kula(int srednica,int masa,int x) {
            super.setMasa(masa);
            super.getMasa();
            super.moment_B();
            super.moment_B_ST(x);
            setSrednica(srednica);
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
        public void opis_kula() {
            System.out.println("Figura: kula");

        }

    }

