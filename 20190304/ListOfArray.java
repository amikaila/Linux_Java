import java.util.ArrayList;

public class ListOfArray{
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println("Element 0: " + arrayList.get(0));
        System.out.println("Element 9: " + arrayList.get(9));
        System.out.println("Size: " + arrayList.size());

              for(int i = 0; i < arrayList.size(); i++){
                System.out.println("Array list: " + arrayList.get(i));
      }
              for(Integer x : arrayList)
                System.out.println(x);

       arrayList.remove(5);
       System.out.println(arrayList);
    }
  }
