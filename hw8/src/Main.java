import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> readStringsFromKeyboard(int n,Scanner s) {
        ArrayList<String> stringList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = s.nextLine();
            stringList.add(input);
        }

        return stringList;
    }
    public static void login(Map<Integer, User> userMap, Scanner scanner) {
        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : userMap.values()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                System.out.println("User details: " + user);
                return;
            }
        }

        System.out.println("Invalid login or password. Please try again.");
    }

    public static void register(Map<Integer, User> userMap, Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : userMap.values()) {
            if (user.getLogin().equals(login)) {
                System.out.println("User with this login already exists.");
                System.out.println("1. Try again");
                System.out.println("2. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the remaining newline character

                switch (choice) {
                    case 1:
                        register(userMap, scanner);
                        return;
                    case 2:
                        System.out.println("Exiting the application.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Exiting the application.");
                        System.exit(0);
                }
            }
        }

        int newId = userMap.size() + 1;
        User newUser = new User(newId, name, login, password);
        userMap.put(newId, newUser);

        System.out.println("Registration successful!");
        System.out.println("User details: " + newUser);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of strings to take as input: ");
        int n = s.nextInt();
        s.nextLine();
        ArrayList<String> l = readStringsFromKeyboard(n,s);
        System.out.println(l);

        Map<Integer, User> userMap = new HashMap<>();

        while (true) {
            System.out.println("Welcome! Please choose an option:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");

            int choice = s.nextInt();
            s.nextLine(); // Consume the remaining newline character

            if(choice==1) {
                login(userMap, s);
            }
            if(choice==2) {
                register(userMap, s);
            }
            if(choice == 0){
                System.out.println("Exiting the application.");
                break;
            }
            else{
                System.out.println("Invalid choice. Please try again.");

            }
        }
        s.close();
    }

}
