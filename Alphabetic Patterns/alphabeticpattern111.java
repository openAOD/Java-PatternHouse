public class Main
{
	public static void main(String[] args) { 
	    
    int n = 9, x = n/2 + 1;
    char ch = 'A';
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            if(j == x || j == n - x + 1)
                System.out.print(ch + " ");
            else 
                System.out.print("  ");
        }
        if(i <= n/2) {
            x--;
            ch++;
        }
        else {
            x++;
            ch--;
        }
        System.out.println();
    }
		
	}
}
