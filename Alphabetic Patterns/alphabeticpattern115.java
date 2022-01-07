public class Main
{
	public static void main(String[] args) { 
	    
	int n = 7, x = 1, y = n/2;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= y; j++) 
            System.out.print(" "+" ");

        for(int k = 1; k <= x; k++)
            System.out.print((char)(i + 64) + " ");

        if(i <= n/2) {
            x += 2;
            y--;
        }
        else {
            x -= 2;
            y++;
        }
        System.out.println();
    }
    	
    	
	}
}
