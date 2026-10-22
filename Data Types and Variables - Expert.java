public class Main {
    public static void main(String[] args) {


    System.out.println("PART 1: BYTE OVERFLOW");
    System.out.println("===========================");
    byte num = 127;
    System.out.println("Before: " + num);
    num++;
    System.out.println("After: " + num);
    
    System.out.println("\nPART 2: STRING COMPARISON");
    System.out.println("===========================");
    String a = new String("ako ang bagyo");
    String b = new String("ako ang bagyo");
    String c = ("ako ang bagyo");

    // False because a and b are two different objects.
    System.out.println("a == b: " + (a == b));
    System.out.println("a == c: " + (a == c));

    // False because b is a new object while c is a literal.
    System.out.println("b == c: " + (b == c));

    // All are true because .equals() checks the actual text.
    System.out.println("a.equals(b): " + a.equals(b));
    System.out.println("a.equals(c): " + a.equals(c));
    System.out.println("b.equals(c): " + b.equals(c));

    System.out.println("\nPART 3: ARRAY REFERENCE");
    System.out.println("===========================");
    int[] x = {11, 21, 31};
    int[] y = x;
    System.out.println("Before changing:");
    System.out.println("x[0]: " + x[0]);
    System.out.println("y[0]: " + y[0]);

    // Changing y also changes x because they share the same array.
    y[0] = 50;
    System.out.println("After changing:");
    System.out.println("x[0]: " + x[0]);
    System.out.println("y[0]: " + y[0]);
    System.out.println("-----------------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");

    }
}
