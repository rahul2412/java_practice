import java.util.Scanner;
public class trailing{
static public void main(String[] args)
{

Scanner scan = new Scanner(System.in);
int l = scan.nextInt();
int k=1;
int count=0;
//int l=1000000;
int m;

if(l%10==0)
{

while(true)
{  m=l&k;
if(m!=1)
 {count++;
l=l>>1;}
else
break;
}



System.out.println(count);
}
else
System.out.println("No trailing zeroes ");

System.out.println("Enter a very large no (like 100 fact) ");
//Scanner scan = new Scanner(System.in);

int g = scan.nextInt();
count=0;
int q=0;
while(g!=0)
{

    q+=g/5;
    g=g/5;

}
System.out.println(q);



}
}
