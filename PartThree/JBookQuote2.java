import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel quote = new  JLabel("I dont have any favourite book quote. ");
    JButton button = new JButton("Click for source");
    JLabel msg3 = new JLabel(" It obviously doesn't have any source. ");
    public JBookQuote2()
    {
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(quote);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(msg3);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(300, 200);
        aFrame.setVisible(true);
    }
}