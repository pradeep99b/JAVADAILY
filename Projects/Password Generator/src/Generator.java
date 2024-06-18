import java.util.Scanner;

public class Generator {

    Alphabet alphabet;
    public static Scanner sc;

    public Generator(Scanner sc) {
        this.sc = sc;
        this.alphabet = new Alphabet();
    }

    public Generator() {
        this(new Scanner(System.in));
    }

    private Password generatePassword(int length) {
        StringBuilder pass = new StringBuilder();
        int alphabetLength = alphabet.getAlphabet().length();
        int max = alphabetLength - 1;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * range) + min;
            pass.append(alphabet.getAlphabet().charAt(index));
        }

        return new Password(pass.toString());
    }

    private void checkPassword() {
        System.out.print("\nEnter your password: ");
        String input = sc.next();
        Password p = new Password(input);
        System.out.println(p.calculateScore());
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Enter 1 - Password Generator");
        System.out.println("Enter 2 - Password Strength Check");
        System.out.println("Enter 3 - Quit");
        System.out.println("Choice: ");
    }

    private void printQuitMessage() {
        System.out.println("Closing the program");
    }

    public void mainLoop() {
        System.out.println("Welcome to Password Services");

        while (true) {
            printMenu();
            String userOption = sc.next();

            switch (userOption) {
                case "1":
                    System.out.print("Enter the desired password length: ");
                    int length = sc.nextInt();
                    Password password = generatePassword(length);
                    System.out.println("Generated Password: " + password.toString());
                    break;
                case "2":
                    checkPassword();
                    break;
                case "3":
                    printQuitMessage();
                    System.exit(0);
                default:
                    System.out.println("Kindly select one of the available options");
            }
        }
    }
}


