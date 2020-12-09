import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JButton[] buttons = new JButton[7];
    private JFrame frame = new JFrame();
    private String message = "Test Question";
    private JLabel label = new JLabel("What is your favorite pokemon", JLabel.CENTER);
    private JPanel panel = new JPanel();

    public GUI() {

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(message);
            buttons[i].addActionListener(this);
            buttons[i].setName(Integer.toString(i));
            panel.add(buttons[i]);
        }

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("I Choose You! Personality Quiz");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons[0]) {
            System.out.println("Test");
        } else if (e.getSource() == buttons[1]) {
            System.out.println("Test2");
        } else if (e.getSource() == buttons[2]) {

        } else if (e.getSource() == buttons[3]) {

        } else if (e.getSource() == buttons[4]) {

        }
    }
}