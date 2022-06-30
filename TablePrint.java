import java.util.*;
class TablePrint
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number till you want to print table :");
	int n=sc.nextInt();
	int i=1;
	while(i<=10)
	{
		//System.out.print("\n\t\t"+i);
		int j=1;
		while(j<=n)
		{
			System.out.print("\t\t"+(i*j)+" ");
			j++;
		}
		i++;
		System.out.println();
	}
	
	}
}
