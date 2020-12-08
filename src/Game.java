import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {
     HashMap<Integer, String> pokeMap = new HashMap<Integer, String>();
     ArrayList<Integer> answers = new ArrayList<Integer>();
     ArrayList<String> questionsList = new ArrayList<String>();

     public String name;

     Game() {
         // set up collections
         pokeMap.put(1, "Bulbasaur");
         pokeMap.put(2, "Charmander");
         pokeMap.put(3, "Eevee");
         pokeMap.put(4, "Pikachu");
         pokeMap.put(5, "Squirtle");

         questionsList.add(", do you have a short fuse?\n" +
                 "Strongly Disagree(1) -  Disagree(2) - Neutral(3) - Agree(4) - Strongly Agree(5)");
         questionsList.add(", do you get along with most people.\n" +
                 "Strongly Disagree(1) -  Disagree(2) - Neutral(3) - Agree(4) - Strongly Agree(5)");
         questionsList.add(", what is your favorite season?\n" +
                 "Winter(1) -  Fall(2) - Spring(3) - Summer(4) - I don’t care(5))");
         questionsList.add(", what sport do you enjoy?\n" +
                 "Football(1) -  Soccer(2) - Baseball(3) - NASCAR(4) - Speed Boat Racing(5)");
         questionsList.add(", what do you enjoy in your spare time?\n" +
                 "Reading(1) -  Playing Video Games(2) - Being Outdoors(3) - Cooking(4) - Spending Time with Friends(5)");
         questionsList.add(", do you enjoy taking hikes?\n" +
                 "Strongly Disagree(1) -  Disagree(2) - Neutral(3) - Agree(4) - Strongly Agree(5)");
         questionsList.add(", swimming is a favorite pass time for you.\n" +
                 "Strongly Disagree(1) -  Disagree(2) - Neutral(3) - Agree(4) - Strongly Agree(5)");
         questionsList.add(", You are at a restaurant, which item off the menu do you order? \n" +
                 "Burger - Salad - Taco - Gyro - Alfredo");
         questionsList.add(", which fictional city you would live in...? \n" +
                 "Bikini Bottom (1) Springfield(2) Gotham(3) Skyrim(4) Pallet Town - Pokemon (5)");
         questionsList.add(", If you could choose a super-power what would it be?…\n" +
                 "Water Mastery(1) - Fire Mastery(2) - Electricity Mastery(3) - Earth Mastery(4) - Psychic Abilities(5)");

         Scanner userInput = new Scanner(System.in);

         System.out.println("What is your name fam?");
         name = userInput.nextLine();
         System.out.println(name);
         System.out.println("Would you like to play? Click Y or y to play or any other key to quit");

         String choice;

         choice = userInput.next();

         if (choice.equals("Y") || choice.equals("y")) {
            for (int i = 0; i < questionsList.size(); i++) {
                answers.add(Questions.question(name + questionsList.get(i)));
            }
             System.out.println(Questions.calculate(answers, name, pokeMap));
         } else {
             System.out.println("Have a great day");
         }
     }
}
