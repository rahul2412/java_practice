import java.util.Scanner;
public class arr {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter no :");
		int n=var.nextInt();
		int a[]=new int[15];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
		a[i]=var.nextInt();
	System.out.println("array elements :");

	for(int i=0;i<n;i++)
		System.out.println(a[i]);

	}
}