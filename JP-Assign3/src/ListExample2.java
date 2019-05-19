import sun.awt.image.ImageWatched;

import java.util.*;

public class ListExample2 {

    public static void main(String args[]) {

        // make some students
        GradStudent a = new GradStudent("Larry", 100);
        MedStudent b = new MedStudent("Curly", 101);
        UndergradStudent c = new UndergradStudent("Moe", 102);

        //Student d = (Student) a;
        //System.out.println(a.whoami);

        a.Graduate();
        b.Graduate();
        c.Graduate();


        List<Person> myList = new ArrayList();
        //myList.clear();
        myList.add(0, a);
        myList.add(1, b);
        myList.add(c);

        System.out.println("My List: " + myList);
        System.out.println("Item 1: " + myList.get(0).getName());
        System.out.println("Item 3: " + myList.get(2).getName());

        LinkedList<String> queue  = new LinkedList<String>();
        queue.addFirst("six");
        queue.addFirst("seven");
        queue.addFirst("eight");
        queue.addFirst("nine");
        queue.addFirst("ten");

        System.out.println("My Queue: " + queue);

        queue.removeLast();
        queue.removeLast();

        System.out.println("After last two removed: " + queue);
    }
}
