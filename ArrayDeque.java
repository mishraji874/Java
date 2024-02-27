import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast();
        dq.pollFirst();

        dq.forEach((x)->System.out.println(x));

        dq.offerFirst(1);
        dq.offerFirst(2);
    }
}
