import java.util.ArrayList;
import java.util.HashMap;


public class Questions {

    public static int calculate(ArrayList<Integer> list) {
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
        return largest;
    }

}
