import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int len = password.length();

        String masked = password.substring(0, len - 2).replaceAll(".", "*")
                        + password.substring(len - 2);

        System.out.println("Masked Password: " + masked);
    }
}