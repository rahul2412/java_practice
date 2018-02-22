import java.util.Scanner;
public class q2 {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter sale in first month :");
		int s1=var.nextInt();
		System.out.println("Enter sale in second month :");
		int s2=var.nextInt();
		System.out.println("Enter sale in third month :");
		int s3=var.nextInt();
		System.out.println("Enter sale in fourth month :");
		int s4=var.nextInt();
		System.out.println("Enter sale in fifth month :");
		int s5=var.nextInt();
		System.out.println("Enter the average sales in 6 months :");
		float x=var.nextFloat();
		float s6=x*6-s1-s2-s3-s4-s5;
		System.out.printf("The sale in sixth month is Rs.%.2f",s6);
		
		}
	}