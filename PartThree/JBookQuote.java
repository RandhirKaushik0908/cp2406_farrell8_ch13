import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel quote = new  JLabel("I dont have any favourite book quote. ");
    public JBookQuote()
    {
        super("Favourite Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(quote);
    }
    public static void main(String[] args)
    {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(300, 200);
        aFrame.setVisible(true);
    }
}