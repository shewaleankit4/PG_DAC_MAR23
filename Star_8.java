/*
Star Pattern 8

 Traingle pattern
 
*
**
***
****
***
**
*

*/

import java.util.Scanner;
class Star_8{

public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);
		System.out.print("enter no.");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	for (int i=1;i<=n;i++)
		{
			for (int j=n-1;j>=i;j--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}