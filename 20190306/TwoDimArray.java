public class TwoDimArray {
  public static void main(String[] args) {
    int [][] big_nums = new int [][]{
      {5, 7, 19, 234},
      {2, 3, 18, 34},
      {543, 5, 51, 44},
      {56, 9, 11, 24}
    };
    for(int i = 0; i < big_nums.length; i++) {
      for(int j = 0; j < big_nums[i].length; j++) {
        System.out.print(big_nums[i][j]+ " ");
    }
    System.out.println("");
    }
  }
}
