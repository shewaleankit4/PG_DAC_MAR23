/*

Star pattern 15

*
* *
*   *
* * * *

*/

import java.util.Scanner;
class Star_15
	{

public static void main(String args[]) 

		{	Scanner sc= new Scanner(System.in);
			System.out.print("enter no . to get 90deg traingle of that '*' height\n");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(j==1)
					System.out.print("* ");
					else if(i==j)
					System.out.print("* ");
					else if(i==n)
					System.out.print("* ");
					else
					System.out.print("  ");
				}
				System.out.println();
			}
		}
	}
	