public class Main {
    public static void main(String[] args) {

    int[] scores = {67, 69, 70, 82, 88, 75, 95, 99};

    int sum = 0;
    int highest = scores[0];
    int lowest = scores[0];

    System.out.println("CLASS STATISTICS CALCULATOR");
    System.out.println("==================================");
    for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
    if (scores[i] > highest) {
    highest = scores[i];
    }

    if (scores[i] < lowest) {
    lowest = scores[i];
    }
    }

    double A = (double) sum / scores.length;
    System.out.println("Total Sum: " + sum);
    System.out.println("Average: " + A);
    System.out.println("Highest Score: " + highest);
    System.out.println("Lowest Score: " + lowest);
    System.out.println("---------------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    }
}
