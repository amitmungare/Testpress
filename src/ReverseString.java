import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    private static String reverseString(String s) {
        String rev="";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev+=s.charAt(i);
        }
        return rev;
    }

}
