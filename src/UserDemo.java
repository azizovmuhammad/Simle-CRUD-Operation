import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserDemo {
    public static Scanner scanner;
    public static List<User> users = new ArrayList<>();

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        int choice ;

        do{
            showMainMenu();
            System.out.print("\nChoose the option: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    createUser();
                    break;
                case 2:
                    viewUsers();
                    break;
                case 3:
                    searchUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    updateUser();
                    break;
                default:
            }

        }while (choice != 0);
    }

    private static void showMainMenu() {
        System.out.println("------------------");
        System.out.println("1. Create User");
        System.out.println("2. View Users");
        System.out.println("3. Search User");
        System.out.println("4. Delete User");
        System.out.println("5. Update User");
        System.out.println("------------------");
    }

    private static void updateUser() {
        System.out.println("-----------------------------------");
        System.out.print("Enter Phone Number: ");
        String phone = scanner.next();

        for (User user : users) {
            if (user.getPhone_number().equals(phone)) {

                System.out.println("=== Change Your Info ===");
                System.out.print("Enter your new Firstname: ");
                String firstname = scanner.next();

                System.out.print("Enter your new Lastname: ");
                String lastname = scanner.next();

                System.out.print("Enter your new Username: ");
                String username = scanner.next();
                user.setFirstname(firstname);
                user.setLastname(lastname);
                user.setUsername(username);

            }

            System.out.println("Successfully Updated :)");
        }
    }

    private static void deleteUser() {

        System.out.println("-----------------------------------");
        System.out.print("Enter Phone Number: ");
        String phone = scanner.next();
        users.removeIf(user -> user.getPhone_number().equals(phone));
        System.out.println("Successfully Deleted");
        System.out.println("-----------------------------------");
    }

    private static void searchUser() {

        System.out.println("-----------------------------------");
        System.out.print("Enter Username: ");
        String username = scanner.next();

        for (User user : users){
            if (user.getUsername().equals(username)){
                System.out.println("-----------------------------------");
                System.out.println("Result: ");
                System.out.println(user);
            }
        }
        System.out.println("-----------------------------------");
    }

    private static void viewUsers() {
        System.out.println("-----------------------------------");

        for (User user : users) {
            if (user != null) {
                System.out.println(user);
            }
            else {
                System.out.println("USERS ARE CURRENTLY UNAVAILABLE");
            }

        }

        System.out.println("-----------------------------------");
    }

    private static void createUser() {
        System.out.println("-----------------------------------");
        System.out.print("Enter your Phone Number: ");
        String phone_number = scanner.next();

        System.out.print("Enter your Firstname: ");
        String firstname = scanner.next();

        System.out.print("Enter your Lastname: ");
        String lastname = scanner.next();

        System.out.print("Enter your Username: ");
        String username = scanner.next();
        System.out.println("-----------------------------------");
        System.out.println("Successfully New User Created\n");
        users.add(new User(phone_number, firstname, lastname, username ));

    }
}
