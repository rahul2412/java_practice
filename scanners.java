import java.util.Scanner;
public class scanners{ 
public static void main(String[] args)
{
	Scanner sn=new Scanner(System.in);
	String x=sn.nextLine();
	int y=Integer.parseInt(x);
	System.out.println(y+2);
}
}