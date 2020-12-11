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
                label.setText("What is your favorite season?");
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
            case 10:
                label.setText("What is your favorite color?");
                buttons[0].setText("Blue");
                buttons[1].setText("Orange");
                buttons[2].setText("Green");
                buttons[3].setText("Yellow");
                buttons[4].setText("Brown");
                break;
            case 11:
                label.setText("You're lost in a forest and only get one of these items. Which do you choose?");
                buttons[0].setText("Flashlight");
                buttons[1].setText("Axe");
                buttons[2].setText("Lighter");
                buttons[3].setText("Gun");
                buttons[4].setText("Bow");
                break;
            case 12:
                label.setText("What is your hat choice?");
                buttons[0].setText("Fedora");
                buttons[1].setText("Western hat");
                buttons[2].setText("Top hat");
                buttons[3].setText("Baseball cap");
                buttons[4].setText("Wig");
                break;
            case 13:
                label.setText("You're at a sign that says DO NOT ENTER. What do you do?");
                buttons[0].setText("Turn around and find somewhere else to go");
                buttons[1].setText("Say screw it and enter anyways");
                buttons[2].setText("Try to find another way to enter");
                buttons[3].setText("Leave the area immediately");
                buttons[4].setText("Cross out the word NOT and enter");
                break;
            case 14:
                label.setText("Favorite number?");
                buttons[0].setText("7");
                buttons[1].setText("42, the answer to everything");
                buttons[2].setText("01101100 01101111 01101100");
                buttons[3].setText("0");
                buttons[4].setText("Don't have one");
                break;
            case 15:
                label.setText("You have one snack to eat for the rest of your life. What do you go with?");
                buttons[0].setText("Chips");
                buttons[1].setText("Cookies");
                buttons[2].setText("Candy");
                buttons[3].setText("Fruit");
                buttons[4].setText("Pastries");
                break;
            case 16:
                label.setText("What type of weather do you prefer the most?");
                buttons[0].setText("Rainy");
                buttons[1].setText("Sunny");
                buttons[2].setText("Cloudy");
                buttons[3].setText("Windy");
                buttons[4].setText("Snowy");
                break;
             case 17:
                label.setText("You're in a battle where you feel like you have an advantage over your opponent. How hard do you try to win?");
                buttons[0].setText("Barely try, too ez");
                buttons[1].setText("Give in a little effort");
                buttons[2].setText("Play moderately");
                buttons[3].setText("Give forth a lot of effort");
                buttons[4].setText("Try my best because I want to crush them!");
                break;
            case 18:
                label.setText("Preferred method of transportation?");
                buttons[0].setText("Walking");
                buttons[1].setText("Running");
                buttons[2].setText("Canoe");
                buttons[3].setText("Cycling");
                buttons[4].setText("Car");
                break;
            case 19:
                label.setText("Is it easy for me to make new friends?");
                buttons[0].setText("Strongly Agree");
                buttons[1].setText("Agree");
                buttons[2].setText("Neutral");
                buttons[3].setText("Disagree");
                buttons[4].setText("Strongly Disagree");
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
