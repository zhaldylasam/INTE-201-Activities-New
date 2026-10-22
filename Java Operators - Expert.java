public class Main {
    public static void main(String[] args) {

    int una = 14;
    int pangalawa = 5;
    int pangatlo = 7;

    System.out.println("PRECEDENCE PUZZLE SOLVER");
    System.out.println("===============================");
    
    // Predicted Result: true
    System.out.println(una - pangalawa * pangatlo == 3);
    // Predicted Result: true
    System.out.println(una > pangalawa && pangalawa + pangatlo < 10);
    // Predicted Result: true
    System.out.println(una / pangatlo < pangalawa || pangalawa == 8);
    // Predicted Result: 15
    System.out.println(++una);
    // Predicted Result: 5
    System.out.println(pangalawa++);
    System.out.println("-------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    // I predicted true, but the actual result is false.
    // The second condition is false because 5 + 7 = 12,
    
    }
}