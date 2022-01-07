public class Main
{
  public static void main (String[]args)
  {

     for(char i = 'E'; i >= 'A'; i--) {
        for(char j = 'A'; j <= 'E'; j++) {
            if(j < i)
                System.out.print(i+" ");
            else 
                System.out.print(j+" ");
        }
       System.out.println();
    }

  }
}