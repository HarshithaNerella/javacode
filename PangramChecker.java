import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String input) {
       
        input = input.replaceAll(" ", "").toLowerCase();

      
        HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                characters.add(c);
            }
        }

   
        return characters.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
