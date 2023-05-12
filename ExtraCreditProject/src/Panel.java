import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Panel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.YELLOW);
        g2D.fillRect(0,400,500,100);
        g2D.setPaint(Color.blue);
        g2D.fillRect(0,250,500,150);
        g2D.setPaint(Color.cyan);
        g2D.fillRect(0,0,500,250);

        g2D.setPaint(Color.ORANGE);
        g2D.fillOval(25,25,80,80);

        g2D.setPaint(Color.BLACK);
        g2D.fillOval(200,43,10,10);

        g2D.setPaint(Color.red);
        g2D.fillOval(170,50,80,25);

        g2D.setPaint(Color.black);
        g2D.fillOval(165,45,8,35);

        g2D.setPaint(Color.RED);
        int[] xPoints = {225, 250, 250};
        int[] yPoints = {60, 60, 28};
        g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setPaint(Color.LIGHT_GRAY);
        g2D.fillOval(190,60,35,7);

        g2D.setPaint(Color.LIGHT_GRAY);
        g2D.fillOval(230,53,20,7);

        g2D.setPaint(Color.BLACK);
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(250,60,280,40);
        g2D.drawLine(250,60,280,80);

        g2D.setPaint(Color.green);
        g2D.fillRect(280,30,200,60);

        g2D.setPaint(Color.black);
        g2D.setFont(new Font("ink",Font.BOLD,25));
        g2D.drawString("GO VAQUEROS",285,70);
    }
}
