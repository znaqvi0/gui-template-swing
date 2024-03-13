import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{

    Dimension dimension = new Dimension(1500,800);
    MyPanel panel;
    public MyFrame()
    {
        panel = new MyPanel();
        this.setTitle("title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);

        this.add(panel);
        this.pack();
    }


    private double random(double lower, double upper)
    {
        return Math.random() * (upper - lower) + lower;
    }
}
