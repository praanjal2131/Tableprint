import java.util.*;
class TablePrintdo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number till you want to print table :");
	int n=sc.nextInt();
	int i=1;
	do
	{
		System.out.print("\t"+i);
		int j=1;
		do
		{
			System.out.print("\t"+i*j);
			j++;
		}while(j<=n);
		i++;
		System.out.println();
	}while(i<=10);
	
	}
}
