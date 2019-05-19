import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String args[]) {

        Queue<String> qe = new LinkedList<String>();

        qe.add("b");
        qe.add("a");
        qe.add("c");
        qe.add("e");
        qe.add("d");

        Iterator<String> it = qe.iterator();

        System.out.println("Initial Size of Queue: " + qe.size());

        while (it.hasNext()) {
            String iterValue = (String)it.next();
            System.out.println("Queue Next Value: " + iterValue);
        }

        // Get value, and do not remove from Queue
        System.out.println("Queue Peek: " + qe.peek());

        // Get first value, remove it from Queue
        System.out.println("Queue poll: " + qe.poll());

        System.out.println("Final size of Queue: " + qe.size());
        System.out.println("Resultant Quwuw: " + qe);
    }
}
