import java.util.*;
class TablePrintfor
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number till you want to print table :");
	int n=sc.nextInt();
	
	for(int i=1;i<=10;i++)
	{
		System.out.print("\t"+i);
		
		for(int j=1;j<=n;j++)
		{
			System.out.print("\t"+(i*j));
			
		}
		
		System.out.println();
	}
	
	}
}
