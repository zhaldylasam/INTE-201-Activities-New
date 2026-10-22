import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    int[] scores = {67, 79, 78, 92, 88, 75, 99, 75};
    int T = 92;
    int I = -1;

    System.out.println("Search & Sort Mini-Tool");
    System.out.println("===========================");
    // Linear Search
    for (int i = 0; i < scores.length; i++) {
    if (scores[i] == T) {
    I = i;
    break;
    }
    }

    if (I != -1) {
    System.out.println(T + " found at index " + I);
    } else {
    System.out.println(T + " not found.");
    }

    // Copy the array before sorting.
    // This keeps the original order unchanged.
    int[] sorted = scores.clone();

    Arrays.sort(sorted);
    System.out.println("Original: " + Arrays.toString(scores));
    System.out.println("Sorted: " + Arrays.toString(sorted));
    System.out.println("-------------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}
