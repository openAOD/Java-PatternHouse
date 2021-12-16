import java.util.Scanner;

public class pyramidpattern52 {

    static char printUpperHalf (int totalLines) {

        char Character = 'A';

        for (int i = 1; i <= totalLines; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(Character + " ");;
            }

            Character++;
            System.out.println();
        }

        return Character;
    }

    static void printLowerHalf (int totalLines, char Character) {

        for (int i = totalLines; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(Character + " ");
            }

            Character++;
            System.out.println();
        }
    }

    static void printPattern (int totalLines) {

        char Character = printUpperHalf(totalLines);
        printLowerHalf((totalLines - 1), Character);
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