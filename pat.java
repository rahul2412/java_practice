import java.util.Scanner;
public class pat {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		int i,j,k,l,m;
		int count=1;
		int n=var.nextInt();
		for(i=n;i>=0;i--)
		{
			if(count%2==0)
			{
for(j=i;j>0;j--)
{
	System.out.print(j);
}
			}
			else
		
		{
			for(j=1;j<=i;j++)
		{
System.out.print(j);
		}
	}
		System.out.println();
		count++;

		}
		

		}
		}