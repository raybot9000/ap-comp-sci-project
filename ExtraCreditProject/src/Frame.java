import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame
{
    public Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawLine(0,0,500,500);
    }
}