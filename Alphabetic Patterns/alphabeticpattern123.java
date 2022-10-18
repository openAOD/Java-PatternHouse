class Main
{
	public static void main(String[] args) { 
	    
	 int n = 5, x = 0;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j <= x; j++) {
            if(i != n/2)
                System.out.print("*"+" ");
            else
                System.out.print((char)(j + 65) + " ");
        }
        if(i < n/2)
            x++;
        else
            x--;
        System.out.println();
    }
    	
    	
	}
}