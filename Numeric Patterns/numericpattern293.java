class Main{

     public static void main(String []args){
         
         int n = 7, x = n/2 + 1;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= x; j++) 
            System.out.print(j+" ");

        if(i <= n/2)
            x--;
        else
            x++;
        System.out.println();
    }
        
     }
}