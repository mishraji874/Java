import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());
        p.forEach((x)->System.out.println(x));

        p.poll();
        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));
    }
}
