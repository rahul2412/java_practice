import java.util.Scanner;
public class pattern {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter no :");
		int n=var.nextInt();
		

	for(int i=0;i<n;i++)
	{
		for(int j=n;j>i;j--)
		{
	System.out.print(j);

		}
	System.out.println();

	}
		

}
}