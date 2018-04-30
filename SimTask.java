package japplet;
import java.util.TimerTask;



/*nowa klasa pochodna od TimerTask */
public class SimTask extends TimerTask {
    private japplet.SimEngine simengine;
    private japplet.SpringApplet springapplet;
    private double space;
    /* pola przechowujące obiekty klasy: SimEngine, SpringApplet */
    public SimTask (japplet.SimEngine simengine, japplet.SpringApplet springapplet, double space){
        this.simengine=simengine;
        this.springapplet=springapplet;
        this.space=space;
        /*konstruktory przypisane do pól obiektów */
    }
    public void run(){
        simengine.simulate(space);
        springapplet.repaint();

    }

}