import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        while (true) {
            System.out.println("School Systems into a Unified School Management Application");
            System.out.println("1. Attendance System");
            System.out.println("2. Grading System");
            System.out.println("3. Library System");
            System.out.println("4. Exit");
            System.out.print("Choose a system to integrate: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    attendanceAdapter.integrateSystem();
                    break;
                case 2:
                    gradingAdapter.integrateSystem();
                    break;
                case 3:
                    libraryAdapter.integrateSystem();
                    break;
                case 4:
                    System.out.println("Thanks");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
