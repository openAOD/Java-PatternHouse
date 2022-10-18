import java.util.Scanner;

class pyramidpattern49 {

    static void printUpperHalf (int totalLines) {

        char Character;

        for (int i = 1; i <= totalLines; i++) {

            Character = (char)(64 + totalLines);

            for (int j = 1; j <= i; j++) {

                System.out.print(Character-- + " ");;
            }

            System.out.println();
        }
    }

    static void printLowerHalf (int totalLines) {

        char Character;

        for (int i = totalLines; i >= 1; i--) {

            Character = (char)(65 + totalLines);

            for (int j = 1; j <= i; j++) {

                System.out.print(Character-- + " ");
            }

            System.out.println();
        }
    }

    static void printPattern (int totalLines) {

        printUpperHalf(totalLines);
        printLowerHalf((totalLines - 1));
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