import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);

    static int[][] items = {
    {10, 3, -1},
    {5, 2, 8}
    };

    public static void main(String[] args) {

    int C;
    do {
    
    System.out.println("WAREHOUSE INVENTORY SCANNER");
    System.out.println("==================================");
    
    System.out.println("\n1. Total  2. Low Stock  3. Restock  4. Exit");
    C = sc.nextInt();
    if (C == 1) {
    int T = 0;
    for (int[] row : items) {
    for (int n : row) {
    if (n == -1) continue; // Skip damaged shelf
    T += n;
    }
    }
    System.out.println("Total: " + T);
    } else if (C == 2) {

    // Find first low-stock shelf
    search:
    for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
    if (items[i][j] >= 0 && items[i][j] < 5) {
    System.out.println("Low Stock: Row " + (i + 1)
    + ", Shelf " + (j + 1));
    break search; // Stop both loops
    }
    }
    }

    } else if (C == 3) {
    restock();
    }

    } while (C != 4);

    System.out.println("Program Ended.");
    }

    static void restock() {

    System.out.print("Row and Shelf: ");
    int r = sc.nextInt() - 1;
    int s = sc.nextInt() - 1;

    if (r < 0 || r >= 2 || s < 0 || s >= 3) {
    System.out.println("Invalid shelf.");
    return;
    }
    if (items[r][s] == -1) {
    System.out.println("Damaged shelf.");
    return;
    }
    int A = 0;
    while (A <= 0) {
    System.out.print("Amount: ");
    A = sc.nextInt();
    }
    items[r][s] += A;
    System.out.println("New Stock: " + items[r][s]);
    System.out.println("------------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}