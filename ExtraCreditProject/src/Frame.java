import javax.swing.*;

public class Frame extends JFrame
{
    Panel pan;

    public Frame()
    {
        pan = new Panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pan);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}