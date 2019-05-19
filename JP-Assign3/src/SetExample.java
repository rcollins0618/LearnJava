import java.util.*;

public class SetExample {
	
  public static void main(String args[]) {
	  
    Set<Object> set = new HashSet<Object>(); // HashSet comes from java.util
    
    Stock myStock1 = new Stock();
    Animal myAnimal1 = new Animal();
    
    set.add("one");
    set.add("two");
    set.add("three");
    set.add("four");
    set.add("five");
    
    System.out.println("Our Set: " + set);
    
    Set<Object> sortedSet = new TreeSet<Object>(set);
    
    System.out.println("Our Tree Set: " + sortedSet);
  }
}
