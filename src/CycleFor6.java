import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyBoundsListener;

public class CycleFor6 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPane());
    }
}

class DrawPane extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0, 0, 20,  20 );
        g.fillRect(20, 20, 20,  20 );
        g.fillRect(40, 40, 20,  20 );
        g.fillRect(60, 60, 20,  20 );
        g.fillRect(80, 80, 20,  20 );

    }
 }

