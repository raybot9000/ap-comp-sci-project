import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Panel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g)
    {
        Graphics2D vaq = (Graphics2D) g;

        vaq.setPaint(Color.decode("#E5D49D"));
        vaq.fillRect(0,400,500,100);
        vaq.setPaint(Color.blue);
        vaq.fillRect(0,250,500,150);
        vaq.setPaint(Color.cyan);
        vaq.fillRect(0,0,500,250);

        vaq.setPaint(Color.ORANGE);
        vaq.fillOval(25,25,80,80);

        vaq.setPaint(Color.BLACK);
        vaq.fillOval(200,43,10,10);

        vaq.setPaint(Color.red);
        vaq.fillOval(170,50,80,25);

        vaq.setPaint(Color.black);
        vaq.fillOval(165,45,8,35);

        vaq.setPaint(Color.RED);
        int[] xPoints = {225, 250, 250};
        int[] yPoints = {60, 60, 28};
        vaq.fillPolygon(xPoints, yPoints, 3);

        vaq.setPaint(Color.LIGHT_GRAY);
        vaq.fillOval(190,60,35,7);

        vaq.setPaint(Color.LIGHT_GRAY);
        vaq.fillOval(230,53,20,7);

        vaq.setPaint(Color.BLACK);
        vaq.setStroke(new BasicStroke(3));
        vaq.drawLine(250,60,280,40);
        vaq.drawLine(250,60,280,80);

        vaq.setPaint(Color.green);
        vaq.fillRect(280,30,200,60);

        vaq.setPaint(Color.black);
        vaq.setFont(new Font("ink",Font.BOLD,25));
        vaq.drawString("GO VAQUEROS",285,70);
        vaq.drawRect(280,30,200,60);


        for(int x=-38;x<501;x+=50)
        {
            vaq.setPaint(Color.cyan);
            vaq.fillOval(x,240,75,30);
        }

        vaq.setPaint(Color.decode("#60615D"));
        vaq.fillOval(80,190,12,12);
        vaq.fillOval(75,190,12,12);
        vaq.fillOval(70,190,12,12);
        vaq.fillOval(65,185,12,12);
        vaq.fillOval(60,185,12,12);
        vaq.fillOval(55,180,12,12);
        vaq.fillOval(50,180,12,12);
        vaq.fillOval(45,175,12,12);
        vaq.fillOval(40,175,12,12);
        vaq.fillOval(35,170,12,12);
        vaq.fillOval(30,170,12,12);
        vaq.fillOval(25,165,12,12);
        vaq.fillOval(20,165,12,12);

        vaq.setPaint(Color.decode("#B2B3B0"));
        vaq.fillRect(80,200,15,50);
        vaq.setPaint(Color.white);
        vaq.fillRect(20,250,150,40);
        int[] x1Points = {170, 170, 230};
        int[] y2Points = {290, 250, 250};
        vaq.fillPolygon(x1Points, y2Points, 3);
        vaq.setPaint(Color.black);
        vaq.fillRect(60,230,80,20);
        vaq.drawLine(20,260,210,260);
        for (int x = 35; x < 160;x+=35)
        {
            vaq.setPaint(Color.cyan);
            vaq.fillOval(x,265,15,15);

        }



    }
}
