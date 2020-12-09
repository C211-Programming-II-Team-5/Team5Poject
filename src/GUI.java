import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JButton[] buttons = new JButton[7];
    public GUI() {
        JFrame frame = new JFrame();
        String message = "Test Question";

        JLabel label = new JLabel("What is your favorite pokemon", JLabel.CENTER);
        JPanel panel = new JPanel();

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
        
    }
}