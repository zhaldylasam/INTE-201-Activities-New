public class Main {
    public static void main(String[] args) {

    String User = "zhaldypogi123";
    String Pass = "akotosinatoy";
    boolean locked = false;

    System.out.println("NESTED LOGIN VALIDATOR");
    System.out.println("===========================");
    if (User.equals("zhaldypogi123")) {
    if (Pass.equals("akotosinatoy")) {
    if (locked == false) {
    System.out.println("Login Successful!");
    System.out.println("Welcome, " + User);
    } else {
    System.out.println("Login Failed: Account is locked.");
    }
    } else {
    System.out.println("Login Failed: Wrong password.");
    }

    } else {
    System.out.println("Login Failed: Wrong username.");
    }
    System.out.println("-------------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}
