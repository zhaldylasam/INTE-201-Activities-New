public class Main {
    public static void main(String[] args) {

    double Mani = 150;

    System.out.println("COMPOUND GROWTH & INCREMENT TRACKER");
    System.out.println("======================================");
    System.out.println("Original Balance: " + Mani);
    Mani += 750;
    System.out.println("First Change: " + Mani);
    Mani *= 2;
    System.out.println("Second Change: " + Mani);
    Mani += 350;
    System.out.println("Third Change: " + Mani);

    int number = 8;
    System.out.println("Postfix Result: " + number++);
    System.out.println("After Postfix: " + number);
    // Postfix shows the current number before adding 1.

    System.out.println("Prefix Result: " + ++number);
    System.out.println("After Prefix: " + number);
    // Prefix adds 1 first before showing the number.
    
    System.out.println("------------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    
    }
}