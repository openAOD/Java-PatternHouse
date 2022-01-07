public class Main
{
	public static void main(String[] args) { 
	    
	  int n = 7;
	  int x = 1;
	  
    for(int i = 1; i <= n; i++) {
        
        for(int j = 1; j < 2*x; j++) {
            
            if(j <= x)
                System.out.print((char)(j + 64) + " ");
            else
                System.out.print((char)(2*x - j + 64) + " ");
        }
        
        if(i <= n/2)
            x++;
        else
            x--;
            
        System.out.println();
    }
    
	}
}
