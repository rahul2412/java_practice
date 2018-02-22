import java.util.Scanner;
public class sort {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter no :");
		int n=var.nextInt();
		int a[]=new int[15];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
		a[i]=var.nextInt();
	int temp;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("array elements :");

	for(int i=0;i<n;i++)
		System.out.println(a[i]);

	}
}