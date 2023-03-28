/*
Star Pattern 7
upper and lower traingle
				*
			   ***
			  *****
			 *******
			  *****
			   ***
			    *
*/
class Star_7{

public static void main(String args[]) 
	{//upper traingle
	/*
		    *
		   ***
		  *****
		 *******
	*/
		for (int i=1;i<=4;i++)
		{
			for (int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for (int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		//Lower Traingle
		/*
			*******
			 *****
			  ***
			   *
		*/
		for (int i=1;i<=4;i++)
		{	for (int k=1;k<=i;k++){
				System.out.print(" ");
			}
		
			for (int j=3;j>=i;j--)
			{
				System.out.print("*");
				
			}
			for (int k=2;k>=i;k--)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
}