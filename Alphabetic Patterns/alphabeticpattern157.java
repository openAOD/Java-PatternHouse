public class alphabeticpattern157 {

    public static void main(String []args) {
        int n = 7, mid = n/2 + 1, x = 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= mid; j++) {
                if(i == 1 || j == 1 || i == mid || (j == mid && i < mid) || j == x) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            if(i >= mid)
                x++;
            System.out.println();
        }
    }

}