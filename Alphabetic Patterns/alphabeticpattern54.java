// program to print hollow rectangle
// * * * * *
// *       *
// *       *
// *       *
// * * * * *

class alphabeticpattern54 {

    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;
        print_rectangle(rows,columns);
    }
    static void print_rectangle(int n, int m){
        int i, j;

        // For rows of rectangle, run the outer loop from 1 to rows.
        for (i = 1; i <= n; i++)
        {
            // For column of rectangle, run the inner loop from 1 to columns.
            for (j = 1; j <= m; j++)
            {
                // Print star for first or for last row or for first or last column
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print("* ");
                else

                    // else print blank space.
                    System.out.print("  ");
            }

            // After printing all columns of a row, print new line after inner loop
            System.out.println();
        }
    }
}
