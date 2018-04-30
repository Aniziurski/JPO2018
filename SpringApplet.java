package japplet;
import java.util.Timer;
import java.awt.*;
import javax.swing.JApplet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;



/* importowanie klas/bibliotek */
/* nowa klasa pochodna od JApplet*/
public class SpringApplet extends JApplet implements MouseListener, MouseMotionListener,ActionListener{
    int szerokosc=500;
    int wysokosc=500;
    /* stworzenie i nadanie wartości dla szerokosci i wysokosci*/
    boolean ruch;
    /* utworzenie i nadanie warotsci logicznej przeciagania kursora */
    private japplet.SimEngine simengine;
    private japplet.SimTask simtask;
    private  Timer space;
    private Button reset;
    private TextField masa,ks,B,G,L;
    /* utworzenie poszczególnych pól */

    public void init(){
        setSize(szerokosc,wysokosc);
        simengine= new japplet.SimEngine(100,15,2,100,200, 500, 200,500);
        simtask= new japplet.SimTask(simengine,this,0.1);
        space=new Timer();
        space.scheduleAtFixedRate(simtask, 0, 10);
        ruch=false;
        addMouseListener(this);
        addMouseMotionListener(this);
        reset=new Button("Reset");
        /*stworzenie przycisku */
        reset.addActionListener(this);
        add(reset);
        masa= new TextField("100",1);
        ks= new TextField("15",2);
        B= new TextField("2",3);
        L=new TextField("100",4);
        G=new TextField("9,8",5);
        add(masa);
        add(ks);
        add(B);
        add(L);
        add(G);
        /*stworzenie nowych obiektow i dodanie el GUI*/

    }
    /* przeciążenie metody init, utworzenie nowych obiektów i wywołanie metody*/

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e){
        int px=e.getX();
        int py=e.getY();
        /* wspolrzednie poloza kursora */

        if((px>=(int)simengine.getpolozenieX()-50 && px<=(int)simengine.getpolozenieX()+50)&&(py>=(int)simengine.getpolozenieY()-50 && py<=(int)simengine.getpolozenieY()+50)){
            space.cancel();
            simengine.zero();
            ruch=true;
            /*sprawdzanie polozenia kursora w masie, wylaczenie timera*/
        }
        e.consume();
    }
    public void mouseReleased(MouseEvent e){
        if(ruch=true) {
            simengine.zero();
            simtask = new japplet.SimTask(simengine, this, 0.01);
            space = new Timer();
            ruch = false;
        }
        e.consume();
    }


    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e){
        if(ruch=true){
            int pox=e.getX();
            int poy=e.getY();
            simengine.setpolozenie((float) simengine.getpolozenieX(),poy);
            repaint();
            /*sprawdzenie ruchu myszy i ewentualna zmiana w pozycji masy*/
        }
        e.consume();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    public void paint (Graphics g) {
        japplet.vector2D wychylenie = simengine.polozenie;
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, szerokosc, wysokosc);
        g.setColor(Color.BLACK);
        g.fillRect(160, 105, 74, 15);
        g.setColor(Color.RED);
        g.drawLine((int) simengine.getpolozenieX(), 120, (int) simengine.getpolozenieX(), (int) ((int) (wychylenie.y) + simengine.getL()));
        g.setColor(Color.GREEN);
        g.fillOval((int) simengine.getpolozenieX() - 25, (int) (simengine.getpolozenieY() + simengine.getL()), 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("Masa",15,20);
        masa.setBounds(5,30,50,30);
        g.drawString("KS",75,20);
        ks.setBounds(55,30,50,30);
        g.drawString("B",125,20);
        B.setBounds(105,30,50,30);
        g.drawString("L",175,20);
        L.setBounds(155,30,50,30);
        g.drawString("G",225,20);
        G.setBounds(205,30,50,30);
        reset.setBounds(255,30,50,30);
        g.drawString("Legenda:",5,400);
        g.drawString("Ks- współczynnik tłumienia",5,420);
        g.drawString("B- współczynnik sprężystości",5,440);
        g.drawString("L- długość sprężyny",5,460);
        g.drawString("G- przyspieszenie ziemskie",5,480);
        g.drawString("AN 2k18",450,490);
    }
    /*rysowanie: tło, umocowanie, linka, masa,przyciski */

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==reset){
            space.cancel();
            double m= Double.parseDouble(masa.getText());
            double k= Double.parseDouble(ks.getText());
            double b= Double.parseDouble(B.getText());
            double l= Double.parseDouble(L.getText());
            double g= Double.parseDouble(G.getText());
            simengine=new japplet.SimEngine(m,k,b,l,400,400,100,50);
            simengine.setG(g);
            simtask=new japplet.SimTask(simengine, this, 0.01);
            space=new Timer();
            space.scheduleAtFixedRate(simtask,0,10);
        }
    }
}