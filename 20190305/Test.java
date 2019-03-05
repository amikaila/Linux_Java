import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Test {
  public static void main(String[] args){
    List<Integer> linkedList = new LinkedList<>();
    List<Integer> arrayList = new ArrayList<>();

    measureTime(linkedList);
    measureTime(arrayList);
    }
    long start = System.currentTimeMillis();
    for(int i = 0; i < 100000; i++){
      list.add(i);
    private static void measureTime(List<Integer> list){
      }

      long end = System.currentTimeMillis();
      System.out.println(end-start);
    }
}
