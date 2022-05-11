import java.util.*;

public class Structures {
    public static void main(String[] args) {

        ArrayList names = new ArrayList<>();
        names.add("Charles");
        names.add("John");
        names.add("Jake");
        System.out.println("\nI would like to introduce " + names);

        LinkedList<Integer> age = new LinkedList<Integer>();
        age.add(35);
        age.add(64);
        age.add(27);
        System.out.println("\nTheir respective ages are " + age);

        Stack<String> prize = new Stack<String>();
        prize.add("BMW");
        prize.add("Toy Car");
        prize.add("Basketball");
        System.out.print("\nThese contestants will play the lottery to win either a " + prize.pop());
        System.out.println(" or a " + prize.pop() +  " or a " + prize.pop() + ".\n");

        Queue<String> order = new LinkedList<>();
        order.add("Jake");
        order.add("Charles");
        order.add("John");
        System.out.println(order.peek() + " is the first contestant to pick their lottery number.\n");

        HashMap<String, Integer> number = new HashMap<String, Integer>();
        number.put("Jake", 351);
        number.put("Charles", 289);
        number.put("John", 194);
        System.out.println("The contestants and their respective lottery numbers are " + number + ".\n");










    }
}
