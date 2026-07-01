import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        int choice;

        do {

            System.out.println("========== Student Grade Tracker ==========");
            System.out.println("1. Add Student");
            System.out.println("2. View Report");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    int marks = sc.nextInt();

                    tracker.addStudent(name, marks);

                    break;

                case 2:

                    tracker.displayStudents();

                    break;

                case 3:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice\n");
            }

        } while (choice != 3);

        sc.close();
    }
}
