public class Main {
    public static void main(String[] args) {

    int Ave = 89;
    int Ab = 5;

    System.out.println("GRADE THRESHOLD CHECKE");
    System.out.println("==========================");
    boolean result = ((Ave >= 75 && Ab <= 3) || Ave >= 95);
    System.out.println("Student Average: " + Ave);
    System.out.println("Total Absences: " + Ab);
    if (result) {
    System.out.println("Result: PASSED");
    System.out.println("Reason: Paldo with Honors.");
    } else {
    System.out.println("Result: FAILED");
    System.out.println("Reason: Nice Try Lang ERP.");
    System.out.println("-----------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
    }
}
