
class Student {

    String N;
    int[] Q;
    double A;

    Student(String n, int[] q) {
    N = n;
    Q = q;

    int sum = 0;

    for (int i = 0; i < q.length; i++) {
    sum += q[i];
    }

    A = (double) sum / q.length;
    }
}

public class Main {
    public static void main(String[] args) {
    String[] names = {"Natoy Cutie", "Boss Atan", "Jordan Banayad", "Golem SpinMove"};

    int[][] scores = {
    {75, 79, 82, 84},
    {89, 94, 90, 91},
    {95, 90, 92, 93},
    {75, 99, 99, 99}
    };

    System.out.println("Class Ranking System");
    System.out.println("============================");
    
    Student[] students = new Student[4];
    // Create student objects
    for (int i = 0; i < students.length; i++) {
    students[i] = new Student(names[i], scores[i]);
    }
    
    // Bubble Sort (highest average first)
    for (int i = 0; i < students.length - 1; i++) {
    for (int j = 0; j < students.length - 1 - i; j++) {
    if (students[j].A < students[j + 1].A) {
    Student temp = students[j];
    students[j] = students[j + 1];
    students[j + 1] = temp;
    }
    }
    }

    // Display sorted results
    System.out.println("Students Ranked by Average:");
    System.out.println("___________________________________");
    for (int i = 0; i < students.length; i++) {
    System.out.printf("%s - Average: %.2f%n",
    students[i].N, students[i].A);
    }
    System.out.println("------------------------------------------");
    System.out.println("Programmer's Name: Zhaldy R. Lasam");
    
    }
}