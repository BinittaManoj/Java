import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Scribble1 extends JFrame implements MouseListener, MouseMotionListener{
    private int lastx,lasty;
    JButton clear;
    Scribble1() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
        clear = new JButton("Clear");
        clear.setBounds(20, 20, 70, 20);
        add(clear);
    }
    public static void main(String[] args) {
        new Scribble1();
    }
    public void mousePressed(MouseEvent me)
    {
        lastx = me.getX();
        lasty = me.getY();
    }
    public void mouseDragged(MouseEvent me)
    {
        Graphics g = this.getGraphics();
        int x = me.getX();
        int y = me.getY();
        g.drawLine(lastx, lasty, x, y);
        lastx = x;
        lasty = y;
    }
    public void mouseClicked(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseMoved(MouseEvent me){}
}