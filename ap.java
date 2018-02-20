import java.util.Scanner;
public class ap {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a :");
		int a=var.nextInt();
		System.out.println("Enter d :");
		int d=var.nextInt();
		System.out.println("Enter no :");
		int n=var.nextInt();
		int x=a+(n-1)*d;
		System.out.println(n+"th no is "+x);


		}
	}