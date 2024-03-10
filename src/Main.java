import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // [0] - username, [1] - password, [2] - type
        String[][] users = {
                {"admin", "admin", "admin"},
                {"user1", "qwerty", "seller"},
                {"buyer1", "Test1234!", "buyer"}
        };

        boolean isLoggedIn = false;
        Scanner scanner = new Scanner(System.in);

        while (!isLoggedIn) {
            System.out.print("Введите логин: ");
            String userLogin = scanner.nextLine();
            System.out.print("Введите пароль: ");
            String userPassword = scanner.nextLine();

            String[] loggedInUser = new String[3];
            for (String[] user : users) {
                if (user[0].equals(userLogin) && user[1].equals(userPassword)) {
                    loggedInUser = user;
                    isLoggedIn = true;
                    System.out.printf("Welcome, %s! You've logged in successfully!", userLogin);
                    break;
                }
            }
            if (!isLoggedIn) {
                System.out.println("Sorry, username or password is incorrect");
            }
        }


    }
}
