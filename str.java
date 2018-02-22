import java.util.Scanner;
public class str {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter string :");
		String s=var.nextLine();
		int i,j,k,l,p=0,m;
		int count;
		char c[]=new char[15];
		int a[]=new int[15];
		l=s.length();
		for(i=0;i<l;i++)
		{
			k=i;
				count=1;

for(j=i+1;j<l;j++)
{
	if(s.charAt(j)==s.charAt(i))
	count++;
	else
	break;
}
i=j-1;
		

a[p]=count;
c[p]=s.charAt(k);

p++;
		

		}
		
		for(i=0;i<p;i++)
		System.out.printf("%c%d",c[i],a[i]);

		

		}

		}
		