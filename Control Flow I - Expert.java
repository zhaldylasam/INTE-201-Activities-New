public class Main {
    public static void main(String[] args) {

    String username = "esmeringhoy213xd";
    int pin = 1234;

    double B = 67000;
    double W = 42000;
    double L = 0;
    double F = 0;
    String T = "";

    // Check username and PIN
    if (username.equals("esmeringhoy213xd")) {
    if (pin == 1234) {

    System.out.println("ATM TRANSACTION AUTHORIZER");
    System.out.println("===============================");
    // Check account tier
    if (B >= 50000) {
    T = "Platinum";
    L = 30000;
    } else if (B >= 20000) {
    T = "Gold";
    L = 15000;
    } else if (B >= 5000) {
    T = "Silver";
    L = 5000;
    } else {
    T = "Bronze";
    L = 2000;
    }

    // Transaction fee
    switch (T) {
    case "Platinum":
    F = 0;
    break;
    case "Gold":
    F = 0.01;
    break;
    case "Silver":
    F = 0.02;
    break;
    case "Bronze":
    F = 0.03;
    break;
    }

    double total = W + (W * F);
    System.out.println("Account Tier: " + T);
    System.out.println("Balance: " + B);
    System.out.println("Withdrawal: " + W);

    // Check withdrawal
    if (W > 0) {
    if (W <= L) {
    if (total <= B) {
    B -= total;
    System.out.println("APPROVED");
    System.out.println("Remaining Balance: " + B);
    } else {
    System.out.println("DENIED: Insufficient balance.");
    }
    } else {
    System.out.println("DENIED: Daily limit exceeded.");
    }
    } else {
    System.out.println("DENIED: Invalid amount.");
    }
    } else {
    System.out.println("DENIED: Wrong PIN.");
    }
    } else {
    System.out.println("DENIED: Wrong username.");
    }
    System.out.println("-----------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}