import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Questions {

    public static Integer question(String message) {
        System.out.println(message);

        Scanner scan = new Scanner(System.in);
        Integer answer = scan.nextInt();
        switch (answer) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                return 0;
        }
    }

    public static String calculate(ArrayList<Integer> list, String name, HashMap<Integer, String> pokeMap) {
        //Integer one = 0, two = 0, three = 0, four = 0, five = 0;
        HashMap<Integer, Integer> calcMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < 5; i++) {
            calcMap.put(i + 1, 0);
        }

        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case 1:
                    calcMap.put(1, calcMap.get(1)+ 1);
                    break;
                case 2:
                    calcMap.put(2, calcMap.get(2)+ 1);
                    break;
                case 3:
                    calcMap.put(3, calcMap.get(3)+ 1);
                    break;
                case 4:
                    calcMap.put(4, calcMap.get(4)+ 1);
                    break;
                case 5:
                    calcMap.put(5, calcMap.get(5)+ 1);
                    break;
            }
        }
        for (Integer i : calcMap.keySet()) {
            System.out.println(calcMap.get(i));
        }

        Integer largest = 0;
        System.out.println(calcMap);

        for (Integer i : calcMap.keySet()) {
            if (calcMap.get(i) > largest) {

                largest = i;
            }
        }

        System.out.println(largest);
        switch(largest) {
            case 1:
                return "congratulations " + name + " your spirit Pokemon is " + pokeMap.get(1) + "!";
            case 2:
                return "congratulations " + name + " your spirit Pokemon is " + pokeMap.get(2) + "!";
            case 3:
                return "congratulations " + name + " your spirit Pokemon is " + pokeMap.get(3) + "!";
            case 4:
                return "congratulations " + name + " your spirit Pokemon is " + pokeMap.get(4) + "!";
            case 5:
                return "congratulations " + name + " your spirit Pokemon is " + pokeMap.get(5) + "!";
        }
        return "";
    }
}
