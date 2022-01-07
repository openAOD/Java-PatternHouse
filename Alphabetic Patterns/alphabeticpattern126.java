public class Main
{
	public static void main(String[] args) { 
	    
	  int n = 7, x = 1, y = n;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            if(j >= x && j <= y)
                System.out.print((char)(i + 64) + " ");
            else
                System.out.print(" "+" ");
        }
        if(i <= n/2) {
            x++;
            y--;
        }
        else {
            x--;
            y++;
        }
        System.out.println();
    }
    
	}
}
