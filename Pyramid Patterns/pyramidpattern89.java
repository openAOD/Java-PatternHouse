import java.util.Scanner;

class pyramidpattern89 {

    // Function to print white spaces
    static void printWhiteSpace (int total) {

        for (int j = 1; j <= total; j++) {
            System.out.print(" ");;
        }
    }

    // Function to print triangle of stars
    static void printTriangle (int lines) {

        for (int i = 1; i <= lines; i++) {

            // Condition to print alternate star & blank space
            if ((i & 1) == 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar;

        // Loop to print upper triangle of stars
        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = ((2 * totalLines) - i);
            printStar = ((2 * i) - 1);

            printWhiteSpace (whiteSpaces);
            printTriangle (printStar);

            System.out.println();
        }

        // Loop to print left & right triangles of stars
        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            // Printing left triangle
            printWhiteSpace (whiteSpaces);
            printTriangle (printStar);

            printWhiteSpace (whiteSpaces);
            System.out.print(" ");

            // Printing right triangle
            printWhiteSpace (whiteSpaces);
            printTriangle (printStar);

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