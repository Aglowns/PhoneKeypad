package programming;
import java.util.Scanner;
public class PhoneKeypad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char ch = letter.toUpperCase().charAt(0); 
        if (letter.length() == 1 && Character.isLetter(ch)) {
            int number = getPhoneNumber(ch);
            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println("Invalid input.");
        }
    }
    public static int getPhoneNumber(char uppercaseLetter) {
        switch (uppercaseLetter) {
            case 'A': case 'B': case 'C':
                return 2;
            case 'D': case 'E': case 'F':
                return 3;
            case 'G': case 'H': case 'I':
                return 4;
            case 'J': case 'K': case 'L':
                return 5;
            case 'M': case 'N': case 'O':
                return 6;
            case 'P': case 'Q': case 'R': case 'S':
                return 7;
            case 'T': case 'U': case 'V':
                return 8;
            case 'W': case 'X': case 'Y': case 'Z':
                return 9;
            default:
                return -1;
        }
    }
}
