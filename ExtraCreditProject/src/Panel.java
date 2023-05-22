import javax.swing.*;
import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class Panel extends JPanel {
    private static Graphics2D graphics2D = null;

    Panel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g)
    {
        graphics2D = (Graphics2D) g;
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
            graphics2D.setPaint(Color.cyan);
            graphics2D.fillOval(x,240,75,30);
        }
    }

    private static void sun() {
        graphics2D.setPaint(Color.ORANGE);
        graphics2D.fillOval(25,20,80,80);

        graphics2D.setPaint(Color.black);
        //glasses
        graphics2D.fillRect(15, 45, 50,5);
        graphics2D.fillRect(20, 50, 50,5);
        graphics2D.fillRect(25, 55, 40,5);
        graphics2D.fillRect(30, 60, 30,5);

        graphics2D.fillRect(60, 45, 60,5);
        graphics2D.fillRect(65, 50, 50,5);
        graphics2D.fillRect(70, 55, 40,5);
        graphics2D.fillRect(75, 60, 30,5);

        //smile
        graphics2D.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        CubicCurve2D c = new CubicCurve2D.Double();
        c.setCurve(50, 80, 60, 85, 75, 90, 80, 80);
        graphics2D.draw(c);
    }

    private static void boat() {
        graphics2D.setPaint(Color.decode("#60615D"));
        graphics2D.fillOval(80,190,12,12);
        graphics2D.fillOval(75,190,12,12);
        graphics2D.fillOval(70,190,12,12);
        graphics2D.fillOval(65,185,12,12);
        graphics2D.fillOval(60,185,12,12);
        graphics2D.fillOval(55,180,12,12);
        graphics2D.fillOval(50,180,12,12);
        graphics2D.fillOval(45,175,12,12);
        graphics2D.fillOval(40,175,12,12);
        graphics2D.fillOval(35,170,12,12);
        graphics2D.fillOval(30,170,12,12);
        graphics2D.fillOval(25,165,12,12);
        graphics2D.fillOval(20,165,12,12);

        graphics2D.setPaint(Color.decode("#B2B3B0"));
        graphics2D.fillRect(80,200,15,50);
        graphics2D.setPaint(Color.white);
        graphics2D.fillRect(20,250,150,40);
        int[] x1Points = {170, 170, 230};
        int[] y1Points = {290, 250, 250};
        graphics2D.fillPolygon(x1Points, y1Points, 3);
        graphics2D.setPaint(Color.black);
        graphics2D.fillRect(60,230,80,20);
        graphics2D.drawLine(20,260,210,260);
        for (int x = 35; x < 160;x+=35)
        {
            graphics2D.setPaint(Color.cyan);
            graphics2D.fillOval(x,265,15,15);

        }
    }

    private BufferedImage getIHSLogo()
    {
        BufferedImage img = null;
        try {
            URL url = getClass().getResource("irvinehighlogo.png");
            img = ImageIO.read(new File(url.getPath()));
        } catch (IOException e) {
            System.out.println(e);
        }
        return img;
    }

    private void banner() {
        graphics2D.setPaint(Color.BLACK);
        graphics2D.setStroke(new BasicStroke(3));
        graphics2D.drawLine(250,60,280,40);
        graphics2D.drawLine(250,60,280,80);

        graphics2D.setPaint(Color.decode("#365f3d"));
        graphics2D.fillRect(280,30,200,60);

        BufferedImage ihsLogo = getIHSLogo();
        graphics2D.drawImage(ihsLogo, 285, 35, 60, 50, null);

        graphics2D.setPaint(Color.WHITE);
        graphics2D.setFont(new Font("ink", Font.PLAIN,20));
        graphics2D.drawString("GO ",355,55);
        graphics2D.drawString("VAQUEROS!",355,80);

        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawRect(280,30,200,60);
    }

    private static void airplane() {
        graphics2D.setPaint(Color.BLACK);
        graphics2D.fillOval(200,43,10,10);

        graphics2D.setPaint(Color.red);
        graphics2D.fillOval(170,50,80,25);

        graphics2D.setPaint(Color.black);
        graphics2D.fillOval(165,45,8,35);

        graphics2D.setPaint(Color.RED);
        int[] xPoints = {225, 250, 250};
        int[] yPoints = {60, 60, 28};
        graphics2D.fillPolygon(xPoints, yPoints, 3);

        graphics2D.setPaint(Color.LIGHT_GRAY);
        graphics2D.fillOval(190,60,35,7);

        graphics2D.setPaint(Color.LIGHT_GRAY);
        graphics2D.fillOval(230,53,20,7);
    }

    private static void background() {
        // sand
        GradientPaint sandColor = new GradientPaint(0, 0, Color.decode("#d9cfab"),400, 0, Color.decode("#b59e48"));
        graphics2D.setPaint(sandColor);
        graphics2D.fillRect(0,400,500,100);

        // ocean
        GradientPaint waterColor = new GradientPaint(0, 0,  Color.decode("#09459e"), 0, 20, Color.decode("#030554"), true);
        graphics2D.setPaint(waterColor);
        graphics2D.fillRect(0,250,500,150);

        // sky
        graphics2D.setPaint(Color.cyan);
        graphics2D.fillRect(0,200,500,50);
        GradientPaint skyColor = new GradientPaint(250, 0,  Color.WHITE, 250, 200, Color.CYAN, true);
        graphics2D.setPaint(skyColor);
        graphics2D.fillRect(0,0,500,200);
    }

    private static void umbrella(Point p, int length, Color c1, Color c2) {
        graphics2D.setPaint(c1);
        graphics2D.fillArc(p.x -(length / 4),p.y,length,60,90,-90);
        graphics2D.setPaint(c2);
        graphics2D.fillArc(p.x -(length / 4),p.y,length,60,90,90);

        graphics2D.setPaint(c2);
        graphics2D.fillArc(p.x,p.y,(length / 2),60,90,-90);
        graphics2D.setPaint(c1);
        graphics2D.fillArc(p.x,p.y,(length / 2),60,90,90);

        graphics2D.setPaint(Color.black);
        graphics2D.drawLine(p.x + (length / 4), p.y + 30, p.x + (length / 4), p.y + 60);
    }

    private static void volcano() {
        graphics2D.setPaint(Color.decode("#583C02"));
        int[] x2Points = {310,360,420,470};
        int[] y2Points = {270,180,180,270};
        graphics2D.fillPolygon(x2Points,y2Points,4);
        graphics2D.setPaint(Color.decode("#F94304"));
        graphics2D.fillRect(359,180,63,5);
        graphics2D.setPaint(Color.decode("#474341"));
        graphics2D.fillOval(340,143,40,35);
        graphics2D.fillOval(360,143,40,35);
        graphics2D.fillOval(380,143,40,35);
        graphics2D.fillOval(400,143,40,35);
        graphics2D.fillOval(355,123,30,25);
        graphics2D.fillOval(375,123,30,25);
        graphics2D.fillOval(395,123,30,25);
        graphics2D.fillOval(365,105,30,25);
        graphics2D.fillOval(385,105,30,25);
        graphics2D.setStroke(new BasicStroke(4));
        CubicCurve2D curv = new CubicCurve2D.Double();
        curv.setCurve(370, 185, 335.0, 220.0, 380.0, 240.0, 320, 268);
        graphics2D.setPaint(Color.decode("#F94304"));
        graphics2D.draw(curv);
        CubicCurve2D curv1 = new CubicCurve2D.Double();
        curv1.setCurve(390, 185, 420.0, 210.0, 315.0, 215.0, 400, 268);
        graphics2D.draw(curv1);
        CubicCurve2D curv2 = new CubicCurve2D.Double();
        curv2.setCurve(415, 185, 440.0, 220.0, 385.0, 240.0, 375, 268);
        graphics2D.draw(curv2);
        CubicCurve2D curv3 = new CubicCurve2D.Double();
        curv3.setCurve(405, 185, 400.0, 220.0, 410.0, 240.0, 455, 268);
        graphics2D.draw(curv3);
    }
}
