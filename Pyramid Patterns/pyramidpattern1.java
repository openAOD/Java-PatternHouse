
import java.util.Scanner;

public class pyramidpattern1 {

    static char swapCharacters (char Character) {

        if (Character == '*') {

            Character = ' ';
            return Character;

        } else {

            Character = '*';
            return  Character;

        }
    }

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar;
        char Character;

        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            Character = '*';

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= printStar; k++) {

                System.out.print(Character);
                Character = swapCharacters (Character);
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int totalLines;

        System.out.print("How many lines to be printed? --> ");
        totalLines = input.nextInt();

        System.out.println("\nYour pattern looks like this:\n");
        printPattern (totalLines);
    }
}
