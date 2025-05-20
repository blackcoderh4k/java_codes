import java.util.Scanner;

public class stringcountaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int count = 0;
        System.out.print("Enter the character to count: ");
        char target = scanner.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == target) {
            count++;
            }
        }
        System.out.println("The character '" + target + "' appears " + count + " times in the string.");
        scanner.close();
    }
}
