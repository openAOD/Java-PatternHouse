public class Main
{
	public static void main(String[] args) {
	
     int n=5;
    int k=1;
    boolean star=true;

    for(int i=0; i<n; i++){
        for(int j=1; j<=n; j++){
            if(star==true){
                System.out.print("*"+" ");
                star=false;
            }
            else{
                System.out.print(k++ + " ");
                star=true;
            }
        }
        System.out.println();
    }
		
	}
}