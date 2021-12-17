import java.util.Scanner;

public class symbolpattern2 {

    static void printPattern (int totalLines) {

        for (int i = 1; i <= totalLines; i++){

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");;
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