import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create a StringBuilder object with the input
        StringBuilder sb = new StringBuilder(input);

        // Reverse the string using StringBuilder
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
        // Check if the original string and reversed string are equal
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close(); // Close the scanner
    }
}
