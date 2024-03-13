import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener
{
    public MyPanel()
    {
        this.setPreferredSize(new Dimension(1000, 800));
        this.setBackground(Color.black);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.addRenderingHints(rh);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }


}
