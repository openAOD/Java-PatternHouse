

public class numericpattern185 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n- row+ 1; col++) {
                if (col % 2 == 0){
                    System.out.print("* ");
                }else{
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }
}
