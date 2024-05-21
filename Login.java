import java.util.Scanner;

public class Login {
    Db_operations dbOperations = new Db_operations();
    
    public static final String ADMIN_USERNAME = "root"; //DATABASE USERNAME
    public static final String ADMIN_PASSWORD = "root1234"; //DATABASE PASSWORD

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();

            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (loginAdmin(username, password)) {
                System.out.println("Admin login successful.");
                break;
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean loginAdmin(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }
}
