import java.util.Scanner; 
public class fact{
	static public void main(String[] args)
	{
	int i,x;
	Scanner var = new Scanner(System.in);
	System.out.println("enter a no. ");
	x=var.nextInt();
	int fact=1;
	for(i=x;i>=1;i--)
	{
	fact*=i;
	}
	System.out.println(fact);



	}
}