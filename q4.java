public class q4 {
	public static void main(String[] args) {
		int sum=0,avg;
		int i;
		for(i=0;i<args.length;i++)
		{
			sum+=Integer.parseInt(args[i]);
		}
		avg=sum/i;
		System.out.println("Sum of given numbers :"+sum);
		System.out.println("Average of given numbers :"+avg);
	}
}