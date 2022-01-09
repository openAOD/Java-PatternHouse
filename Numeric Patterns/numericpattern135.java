public class Main
{
    
    public static boolean isPrime(int n){
    for(int i=2; i<n; i++)
        if(n%i==0)
            return false;

    return true;
    }
    
	public static void main(String[] args) {
		
	int n=5;
    int k=2;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            while(!isPrime(k)){
                k++;
            }
            System.out.print(k++ + " ");
        }
         System.out.println();
    }
		
	}
}