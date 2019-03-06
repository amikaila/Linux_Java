import java.util.Scanner;

public class User_Input {
  public static void main(String[] args){
    int user_input;
    Scanner in = new Scanner(System.in);
    do {
      System.out.println("Please enter the number: 5");
      user_input = in.nextInt();
    } while (user_input != 5);
    System.out.println("You add the number 5");
  }
}
