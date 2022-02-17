// program to print below pattern
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class numericpattern54 {

    public static void main(String[] args) {

        int rows = 5;
        numeric_triangle(rows);
    }
    static void numeric_triangle(int n){

        for(int row = 1; row <= n; row++){
            if(row%2 == 1){
                int i=1;
                for(int col=1; col <= row; col++){
                    System.out.print(i + " ");
                    i = (i == 0) ? 1 : 0;
                }
            } else{
                int k=0;
                for(int col=1; col<=row; col++){
                    System.out.print(k + " ");
                    k = (k == 0) ? 1 : 0;
                }
            }
            System.out.println();
        }
    }
}
