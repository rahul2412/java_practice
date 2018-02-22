import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter name :");
		String name=var.nextLine();
		System.out.println("Enter Roll No :");
		int roll=var.nextInt();
		var.nextLine();
		System.out.println("Enter Subject :");
		String sub=var.nextLine();
		System.out.println("Enter Marks :");
		int marks=var.nextInt();
		System.out.println("Enter Grade :");
		String grade=var.next();
		System.out.println(name+" Details :");
		System.out.println("Roll No : "+roll);
		System.out.println("Subject : "+sub);
		System.out.println("Marks : "+marks);
		System.out.println("Grades : "+grade);







	}
	
}