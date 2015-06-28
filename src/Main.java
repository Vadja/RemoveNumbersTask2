import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int counter;
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(10));
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if ((list.get(i)).equals(list.get(j))) {
                    counter = counter+1;
                }
            }
            if (counter < 3) {
                result.add(list.get(i));
            }
        }
        System.out.println("Task 2 result: " + result);
    }
}
