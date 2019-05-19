import java.util.*; // Import for Collections and Maps

public class ListExample {

public static void main(String args[]) {
	  
	 Stock stock1 = new Stock();
	 Stock stock2 = new Stock();
	 
	 List<Stock> list = new ArrayList<Stock>();
     list.add(stock1);
     list.add(stock2);
    
 //   System.out.println("My List " + list);
    
    System.out.println("1: " + list.get(1).print());
    System.out.println("0: " + list.get(0).print());
    
    int amount = list.get(0).qty + list.get(1).qty;
    
    System.out.println("Total Spent is: " + amount);
    
    LinkedList<Stock> queue = new LinkedList<Stock>();
    
    queue.addFirst(stock1);
    queue.addFirst(stock2);
    queue.addFirst(stock1);
    queue.addFirst(stock2);
    queue.addFirst(stock1);
    queue.addLast(stock2);
    
  //  System.out.println("My Queue " + queue);
    
    queue.removeLast();
    queue.removeFirst();
    queue.removeLast();
    
 //   System.out.println("After 2 last removed: " + queue);
  }
}
