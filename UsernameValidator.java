import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        username = username.trim();      // remove spaces
        username = username.toLowerCase(); // convert to lowercase

        System.out.println("Cleaned Username: " + username);
    }
}