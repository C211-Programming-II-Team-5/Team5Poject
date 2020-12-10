import java.util.HashMap;
import java.util.ArrayList;

public class Game {
     public HashMap<Integer, String> pokeMap = new HashMap<Integer, String>();
     public static ArrayList<Integer> answers = new ArrayList<Integer>();

     Game() {
         pokeMap.put(1, "Bulbasaur");
         pokeMap.put(2, "Charmander");
         pokeMap.put(3, "Eevee");
         pokeMap.put(4, "Pikachu");
         pokeMap.put(5, "Squirtle");
    }
}
