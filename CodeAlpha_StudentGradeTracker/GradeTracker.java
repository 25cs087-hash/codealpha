import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int marks) {
        students.add(new Student(name, marks));
        System.out.println("Student Added Successfully!\n");
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Records Found.\n");
            return;
        }

        System.out.println("\n------ Student Report ------");

        int total = 0;
        int highest = students.get(0).getMarks();
        int lowest = students.get(0).getMarks();

        String topper = students.get(0).getName();
        String lowStudent = students.get(0).getName();

        for (Student s : students) {

            System.out.println(s);

            total += s.getMarks();

            if (s.getMarks() > highest) {
                highest = s.getMarks();
                topper = s.getName();
            }

            if (s.getMarks() < lowest) {
                lowest = s.getMarks();
                lowStudent = s.getName();
            }
        }

        double average = (double) total / students.size();

        System.out.println("----------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest + " (" + topper + ")");
        System.out.println("Lowest Marks  : " + lowest + " (" + lowStudent + ")");
        System.out.println();
    }
}
