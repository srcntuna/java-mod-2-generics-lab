import java.util.Arrays;

class Problem2 {
  // declare the convertToString method here

  public static <E> String convertToString(E[] array) {

    return Arrays.toString(array);

  }

}

public class StringRunner {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

    System.out.println(Problem2.convertToString(inputInt)); // [1, 2, 3]
    System.out.println(Problem2.convertToString(inputStr)); // [Cake, Donut,Cupcake]
  }
}