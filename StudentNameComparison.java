import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Student Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Second Student Name: ");
        String name2 = sc.nextLine();

        // Case Sensitive
        if (name1.equals(name2)) {
            System.out.println("Case-Sensitive: Names are same");
        } else {
            System.out.println("Case-Sensitive: Names are different");
        }

        // Case Insensitive
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-Insensitive: Names are same");
        } else {
            System.out.println("Case-Insensitive: Names are different");
        }
    }
}