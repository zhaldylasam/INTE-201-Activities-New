public class Main {
    public static void main(String[] args) {

    double PA = 420;
    double D = 0;
    String T = "";

    System.out.println("MULTI-TIER DISCOUNT SYSTEM");
    System.out.println("=============================");
    if (PA >= 5000) {
    D = 0.15;
    T = "15% Discount";
    } else if (PA >= 3000) {
    D = 0.10;
    T = "10% Discount";
    } else if (PA >= 1000) {
    D = 0.05;
    T = "5% Discount";
    } else {
    D = 0;
    T = "No Discount";
    }
    double TD = PA * D;
    double FP = PA - TD;
    System.out.println("Purchase Amount: PHP " + PA);
    System.out.println("Discount Tier: " + T);
    System.out.println("Discount Amount: PHP " + TD);
    System.out.println("Final Price: PHP " + FP);
    System.out.println("-------------------------------");
    System.out.println("Progammer's Name: Zhaldy R. Lasam");
    }
}
