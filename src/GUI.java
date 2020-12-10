import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JButton[] buttons = new JButton[5];
    private static JFrame frame = new JFrame();
    private static String message = "Begin!";
    private static JLabel label = new JLabel("What is your favorite pokemon", JLabel.CENTER);
    private static JPanel panel = new JPanel();
    int count = 0;

    public GUI() {

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(message);
            buttons[i].addActionListener(this);
            if (i != 0) {
                buttons[i].setVisible(false);
            }
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
            Game.answers.add(1);
            System.out.println(Game.answers);
            count++;
        } else if (e.getSource() == buttons[1]) {
            Game.answers.add(2);
            System.out.println(Game.answers);
            count++;
        } else if (e.getSource() == buttons[2]) {
            Game.answers.add(3);
            System.out.println(Game.answers);
            count++;
        } else if (e.getSource() == buttons[3]) {
            Game.answers.add(4);
            System.out.println(Game.answers);
            count++;
        } else if (e.getSource() == buttons[4]) {
            Game.answers.add(5);
            System.out.println(Game.answers);
            count++;
        }
        setUpQuestion(count);
    }

    public static void setUpQuestion(int numQuestion) {
        for (JButton btn : buttons) {
            btn.setVisible(true);
        }
        switch (numQuestion) {
            case 0:
                label.setText("Do you have a short fuse?");
                buttons[0].setText("Strongly Agree");
                buttons[1].setText("Agree");
                buttons[2].setText("Neutral");
                buttons[3].setText("Disagree");
                buttons[4].setText("Strongly Disagree");
                break;
            case 1:
                label.setText("Do you get along with most people?");
                buttons[0].setText("Strongly Agree");
                buttons[1].setText("Agree");
                buttons[2].setText("Neutral");
                buttons[3].setText("Disagree");
                buttons[4].setText("Strongly Disagree");
                break;
            case 2:
                label.setText("what is your favorite season?");
                buttons[0].setText("Spring");
                buttons[1].setText("Summer");
                buttons[2].setText("Autumn");
                buttons[3].setText("Winter");
                buttons[4].setText("Who cares about seasons?");
                break;
            case 3:
                label.setText("Which of these are your preferred sport?");
                buttons[0].setText("Basketball");
                buttons[1].setText("Soccer");
                buttons[2].setText("NASCAR");
                buttons[3].setText("Speed Boat Racing");
                buttons[4].setText("Bowling(lol)");
                break;
            case 4:
                label.setText("How do you spend your spare time?");
                buttons[0].setText("Reading");
                buttons[1].setText("Playing video games");
                buttons[2].setText("Hanging out with friends");
                buttons[3].setText("Exercising");
                buttons[4].setText("Watching TV");
                break;
            case 5:
                label.setText("Which fictional land would you live in?");
                buttons[0].setText("Bikini Bottom (Spongebob)");
                buttons[1].setText("Skyrim");
                buttons[2].setText("Gotham");
                buttons[3].setText("Kanto (Pokemon)");
                buttons[4].setText("Springfield (Simpsons)");
                break;
            case 6:
                label.setText("Which of these items do order at a restaurant?");
                buttons[0].setText("Hamburger");
                buttons[1].setText("Pizza");
                buttons[2].setText("Tacos");
                buttons[3].setText("Shrimp Lo Mein");
                buttons[4].setText("Sushi");
                break;
            case 7:
                label.setText("Your superpower of choice?");
                buttons[0].setText("Water Mastery");
                buttons[1].setText("Fire Mastery");
                buttons[2].setText("Earth Mastery");
                buttons[3].setText("Electricity Mastery");
                buttons[4].setText("Psychic Abilities");
                break;
            case 8:
                label.setText("Preferred Marvel villain?");
                buttons[0].setText("Thanos(Avengers)");
                buttons[1].setText("Loki(Thor)");
                buttons[2].setText("The Green Goblin(Spider-man)");
                buttons[3].setText("The Red Skull(Captain America)");
                buttons[4].setText("Magneto (X-Men)");
                break;
            case 9:
                label.setText("You need to break into a locked box, what method do you use?");
                buttons[0].setText("Pick the lock");
                buttons[1].setText("Blow that sucker open with a grenade");
                buttons[2].setText("Find the key");
                buttons[3].setText("Saw around the lock");
                buttons[4].setText("Walk away, the box is locked for a reason");
                break;
            default:
                for (JButton btn : buttons) {
                    btn.setVisible(false);
                }
                Game newGame = new Game();
                int result = Questions.calculate(Game.answers);
                label.setText("Congratulations! your spirit pokemon is..." + newGame.pokeMap.get(result) + "!");

        }
    }
}