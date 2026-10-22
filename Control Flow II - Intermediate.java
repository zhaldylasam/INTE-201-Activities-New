import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int N = 0;
    int T = 0;

    System.out.println("SUM UNTIL SENTINEL VALUE");
    System.out.println("============================");
    System.out.println("Enter numbers (-1 to stop):");
    while (N != -1) {
    N = input.nextInt();
    if (N != -1) {
    T += N;
    }
    }
    System.out.println("Final Total: " + T);
    input.close();
    System.out.println("------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}