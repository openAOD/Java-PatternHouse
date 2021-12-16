import java.util.Scanner;

public class pyramidpattern55 {

    static void printWhitespace (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            System.out.print("   ");
        }
    }

    static void printNumber (int totalLines, int counter) {

        for (int i = totalLines; i >= 1; i--) {

            System.out.printf("%3d", counter++);
        }
    }

    static void printPattern (int totalLines) {

        int counter;

        for (int i = 1; i <= totalLines; i++) {

            counter = (totalLines - i);

            printWhitespace((totalLines - i));
            printNumber(i, counter);

            System.out.println();
        }

        for (int i = (totalLines - 1); i >= 1; i--) {

            counter = (totalLines - i);

            printWhitespace((totalLines - i));
            printNumber(i, counter);

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