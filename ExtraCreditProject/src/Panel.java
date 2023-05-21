import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private static Graphics2D vaq = null;

    Panel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g)
    {
        vaq = (Graphics2D) g;
        background();
        sun();
        airplane();
        banner();
        waves();
        boat();
        umbrella(new Point(50, 380), 100, Color.white, Color.pink);
        umbrella(new Point(200, 440), 140, Color.blue, Color.green);
        umbrella(new Point(400, 390), 100, Color.red, Color.yellow);
        volcano();
    }

    private static void waves() {
        for(int x=-38;x<500;x+=50)
        {
            vaq.setPaint(Color.cyan);
            vaq.fillOval(x,240,75,30);
        }
    }

    private static void sun() {
        vaq.setPaint(Color.ORANGE);
        vaq.fillOval(25,20,80,80);

        vaq.setPaint(Color.black);
        vaq.fillRect(15, 45, 50,5);
        vaq.fillRect(20, 50, 50,5);
        vaq.fillRect(25, 55, 40,5);
        vaq.fillRect(30, 60, 30,5);

        vaq.fillRect(60, 45, 60,5);
        vaq.fillRect(65, 50, 50,5);
        vaq.fillRect(70, 55, 40,5);
        vaq.fillRect(75, 60, 30,5);
    }

    private static void boat() {
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
        int[] y1Points = {290, 250, 250};
        vaq.fillPolygon(x1Points, y1Points, 3);
        vaq.setPaint(Color.black);
        vaq.fillRect(60,230,80,20);
        vaq.drawLine(20,260,210,260);
        for (int x = 35; x < 160;x+=35)
        {
            vaq.setPaint(Color.cyan);
            vaq.fillOval(x,265,15,15);

        }
    }

    private static void banner() {
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
    }

    private static void airplane() {
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
    }

    private static void background() {
        // sand
        vaq.setPaint(Color.decode("#E5D49D"));
        vaq.fillRect(0,400,500,100);

        // ocean
        vaq.setPaint(Color.blue);
        vaq.fillRect(0,250,500,150);

        // sky
        vaq.setPaint(Color.cyan);
        vaq.fillRect(0,0,500,250);
    }

    private static void umbrella(Point p, int length, Color c1, Color c2) {
        vaq.setPaint(c1);
        vaq.fillArc(p.x -(length / 4),p.y,length,60,90,-90);
        vaq.setPaint(c2);
        vaq.fillArc(p.x -(length / 4),p.y,length,60,90,90);

        vaq.setPaint(c2);
        vaq.fillArc(p.x,p.y,(length / 2),60,90,-90);
        vaq.setPaint(c1);
        vaq.fillArc(p.x,p.y,(length / 2),60,90,90);

        vaq.setPaint(Color.black);
        vaq.drawLine(p.x + (length / 4), p.y + 30, p.x + (length / 4), p.y + 60);
    }

    private static void volcano() {
        vaq.setPaint(Color.decode("#583C02"));
        int[] x2Points = {310,360,420,470};
        int[] y2Points = {270,180,180,270};
        vaq.fillPolygon(x2Points,y2Points,4);
        vaq.setPaint(Color.decode("#F94304"));
        vaq.fillRect(359,180,63,5);
        vaq.setPaint(Color.decode("#474341"));
        vaq.fillOval(340,143,40,35);
        vaq.fillOval(360,143,40,35);
        vaq.fillOval(380,143,40,35);
        vaq.fillOval(400,143,40,35);
        vaq.fillOval(355,123,30,25);
        vaq.fillOval(375,123,30,25);
        vaq.fillOval(395,123,30,25);
        vaq.fillOval(365,105,30,25);
        vaq.fillOval(385,105,30,25);




    }
}
