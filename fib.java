import java.util.Scanner;
public class fib {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter no :");
		int n=var.nextInt();
		int i,j,a,b;
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);

int temp;
		for(i=0;i<n-2;i++)
		 { //System.out.println(a);


		 	temp=a; 
		a=b;
				


           b+=temp;
           		System.out.println(b);

         
		}

		}
		}