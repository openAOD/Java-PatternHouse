import java.util.Scanner;

public class pyramidpattern9 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar;
        char Character = (char)(64 + totalLines);

        for (int i = totalLines; i >= 1; i--) {

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= printStar; k++) {

                if((k & 1) != 0) {

                    System.out.print(Character);
                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
            Character--;
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