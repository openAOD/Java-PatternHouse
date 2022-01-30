public class symbolpattern10 {

    public static void main(String []args){
        int n = 3;
        for(int i = n; i >= -n; i--) {
            for(int j = n; j >= Math.abs(i); j--) {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
}