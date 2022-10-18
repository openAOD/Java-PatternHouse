import java.util.Scanner;

class pyramidpattern92 {

    static void printWhitespace (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            System.out.print("  ");
        }
    }

    static void printStar (int totalLines) {

        for (int i = totalLines; i >= 1; i--) {

            if ((i == 1) || (i == totalLines)) {

                System.out.print("* ");
            } else {

                System.out.print("  ");
            }
        }
    }

    static void printPattern (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            printWhitespace((totalLines - i));
            printStar(i);

            System.out.println();
        }

        for (int i = (totalLines - 1); i >= 1; i--) {

            printWhitespace((totalLines - i));
            printStar(i);

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