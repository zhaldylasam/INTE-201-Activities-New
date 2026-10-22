public class Main {
    public static void main(String[] args) {
    double cm = 77.3;

    int M = (int) cm / 100;
    double R = cm - (M * 100);

    System.out.println("Centimeters: " + cm);
    System.out.println("Meters: " + M);
    System.out.println("Remaining cm: " + R);

    double num = 25.75;
    double num2 = num;
    System.out.println("Widening: " + num2);

    // Casting double to int removes the decimal part.
    int num3 = (int) num;
    System.out.println("Narrowing: " + num3);
    System.out.println("-------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}