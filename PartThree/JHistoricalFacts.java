import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Press for a new FACT: ");
    JLabel stars = new JLabel("\n**********************************************");
    JLabel fact1 = new JLabel("Australia is the only continent covered by a single country. ");
    JLabel fact2 = new JLabel("On an average, a Koala sleeps for about 20 hours per day. ");
    JLabel fact3 = new JLabel("Australia was the second country in the world to grant women the right to vote; this occurred in 1894. ");
    JLabel fact4 = new JLabel("The average Australian drinks 83 litres of beer per year. ");
    JLabel fact5 = new JLabel("The Aussie state of Tasmania has the world's cleanest air. ");
    int counter = 0;
    public JHistoricalFacts()
    {
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(stars);
        add(fact1);
        button.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JHistoricalFacts rFrame = new JHistoricalFacts();
        rFrame.setSize(700,200);
        rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(fact1);
            add(fact2);
        }
        else
        if(counter == 2)
        {
            remove(fact2);
            add(fact3);
        }
        else
        if(counter == 3)
        {
            remove(fact3);
            add(fact4);
        }
        else
        if(counter == 4)
        {
            remove(fact4);
            add(fact5);
        }
        else
        {
            remove(fact5);
            add(fact1);
        }
        validate();
        repaint();
    }

}