import java.awt.*;
import java.awt.event.*;

class MEHandling extends Frame implements MouseListener, MouseMotionListener {
    String msg = "", msg2 = "";
    int x = 150, y = 100;

    MEHandling() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent me) {
        msg = "mouse Clicked";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "mouse Exited";
        repaint();
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg2 = "mouse Dragged";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg2 = "mouse Moved";
        repaint();
    }

    // Paint method
    public void paint(Graphics g) {
        g.drawString(msg, x, y);
        g.drawString(msg2, x, y + 20); // offset so both are visible
    }

    public static void main(String args[]) {
        MEHandling mh = new MEHandling();
        mh.setTitle("Mouse Handling Event");
        mh.setSize(400, 450);
        mh.setVisible(true);

        mh.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
