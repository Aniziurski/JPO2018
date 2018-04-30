package japplet;


public class vector2D {
    //nowa clasa

    public double x,y;
    //konstruktory
    public vector2D()
    {
        this.x = 0;
        this.y = 0;
    }
    //metoda  z zerami

    public vector2D(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    //metoda z parametrami

    public vector2D suma_vector(vector2D vect)
    {
        return new vector2D(this.x + vect.x, this.y + vect.y);
    }
    //metoda zwracjąca sumę
    public vector2D roznica_vector(vector2D vect)
    {
        return new vector2D(this.x - vect.x , this.y - vect.y);
    }
    //metoda zwracająca różnicę
    public vector2D multi_vector(int i)
    {
        return new vector2D(this.x *i,this.y * i);
    }
    //metoda multiplikowania wektora
    public double dlugosc()
    {
        return Math.sqrt((this.x*this.x ) + (this.y *this.y));
    }
    //metoda zwracająca długośc wektora
    public vector2D normal()
    {
        if (this.dlugosc()>0){

            return new vector2D(this.x/this.dlugosc(),this.y/this.dlugosc());

        }
        else
        {
            System.out.println("Operacja niemożliwa. Dlugosć <= 0.");
            return null;

        }
    }
    //metoda zwracająca znormalizowany wektor
}