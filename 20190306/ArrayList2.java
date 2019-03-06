import java.util.ArrayList;

public class ArrayList2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("FirstName");
    names.add("SecondName");
    names.add("ThirdName");
    names.add("FourthName");
    names.add("FifthName");
    for(String el : names){
      System.out.println(el);
    }
  }
}
