import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class ListOfElement {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<10; i++){
      list.add(i);
      System.out.println("Inside for: "+list);
    }
    System.out.println("Full list: " +list);
    list.remove(5);
    System.out.println("Removed 5th element: " +list);
  }
}
