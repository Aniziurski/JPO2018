package japplet;

public class SimEngine {
    private static double G=9.8f;
    private double masa;
    private double ks;
    private double L;
    private double B;
    private double X0;
    private double Y0;
    private double X0m;
    private double Y0m;
    private double Vx;
    private double Vy;
    public double a;
    public double t;

    public SimEngine(double m, double k, double b, double l, int x0, int y0, int x0m, int y0m) {

    }
    /* masa, współczynnik sprężystości, tłumienia, długość sprężyny, położenie masy, współrzędne punktu zaczepienia sprężyny, prędkości masy, przyspieszenie G */
    /* mutatory poniezej */

    public void setmasa(double m){
        masa=m;
    }
    public void setks(double k){
        ks=k;
    }
    public void setB(double b){
        B=b;
    }
    public void setL(double l){
        L=l;
    }
    public void setX0(float x0){
        X0=x0;
    }
    public void setY0(float y0){
        Y0=y0;
    }
    public void setX0m (float x0m){
        X0m=x0m;
    }
    public void setY0m (float y0m){
        Y0m=y0m;
    }
    public void setVx (float vx){
        Vx=vx;
    }
    public void setVy (float vy){
        Vy=vy;
    }
    public void setG (double g){
        G=g;
    }
    /*akcesory poniżej*/
    public double getmasa(){
        return masa;
    }
    public double getks(){
        return ks;
    }
    public double getB(){
        return B;
    }
    public double getL(){
        return L;
    }
    public double getX0(){
        return X0;
    }
    public double getY0(){
        return Y0;
    }
    public double getX0m(){
        return X0m;
    }
    public double getY0m(){
        return Y0m;
    }
    public double getVx(){
        return Vx;
    }
    public double getVy(){
        return Vy;
    }
    public double getG(){
        return G;
    }

    public vector2D polozenie;

    public SimEngine(int masa, int ks, int B, int L, int X0, int Y0, int X0m, int Y0m){
        this.masa=masa;
        this.ks=ks;
        this.B=B;
        this.L=L;
        this.X0m=X0m;
        this.Y0m=Y0m;
        this.X0=X0;
        this.Y0=Y0;
        this.Vx=0;
        this.Vy=0;
        this.a=0;
        polozenie = new japplet.vector2D(X0m,Y0m);
    }
    public double getpolozenieX(){
        return polozenie.x;
    }
    public double getpolozenieY(){
        return polozenie.y;
    }
    public void setpolozenie(float x, float y){
        this.polozenie=new japplet.vector2D(x,y);
    }

    public void simulate(double t){
        a=(1/masa)*(-ks*polozenie.y-B*Vy+masa*G);
        Vy=Vy+a*t;
        polozenie.y=(float) (polozenie.y+(Vy*t+(a*t*t)/2));
    }
    public void zero(){
        Vy=0;
        this.a=0;

    }
    /*metoda resetująca */

}