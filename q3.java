import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter the binary number ");
		String s1=var.nextLine();
		System.out.println("Enter the octal number ");
		String s2=var.nextLine();
		System.out.println("Enter the hexadecimal number ");
		String s3=var.nextLine();
		int x=Integer.parseInt(s1,2);
		int y=Integer.parseInt(s2,8);
		int z=Integer.parseInt(s3,16);
		System.out.println("The integer value of binary number "+s1+" is "+x);
		System.out.println("The integer value of octal number "+s2+" is "+y);
        System.out.println("The integer value of hexadecimal number "+s3+" is "+z);

}
}
