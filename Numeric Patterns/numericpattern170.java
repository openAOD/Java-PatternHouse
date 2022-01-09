public class Main
{
	public static void main(String[] args) {
	
    int c=1;
    for (int i=1;i<=4;i++)
    {   int p=1;
        for (int j=1;j<=c;j++)
        {
            if (j%2==0)
            System.out.print("* ");
            else
            System.out.print(p++ + " ");
        }
        System.out.println();
        c+=2;
    }
	}
}