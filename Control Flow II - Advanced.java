public class Main {
    public static void main(String[] args) {

    System.out.println("PATTERN GENERATOR WITH EARLY EXIT");
    System.out.println("====================================");
    int size = 67;
    for (int i = 1; i <= size; i++) {

    // Skip row 3 using continue
    if (i == 3) {
    continue;
    }
    for (int j = 1; j <= i; j++) {

    // Stop the inner loop at column 24
    if (j == 24) {
    break;
    }
    System.out.print("* ");
    }
    System.out.println();
    }
    System.out.println("-------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}
