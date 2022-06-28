import java.util.Arrays;

class Problem1 {
    // declare the getFirstElement method here

    public static <E> E getFirstElement(E[] array) {
        return array[0];
    }
}

public class FirstElement {
    public static void main(String[] args) {
        Integer[] inputInt = { 1, 2, 3 };
        Integer[] inputEmpty = new Integer[5];
        String[] inputStr = { "Cake", "Donut", "Cupcake" };

        System.out.println(Problem1.getFirstElement(inputInt)); // 1
        System.out.println(Problem1.getFirstElement(inputEmpty)); // null
        System.out.println(Problem1.getFirstElement(inputStr)); // Cake
    }
}
