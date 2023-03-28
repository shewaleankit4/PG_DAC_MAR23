/*
Star Pattern 6
diagonal traingle


	*******
	 *****
	  ***
	   *
*/
class Star_6{

public static void main(String args[]){
		/*
		for (int i=1;i<=4;i++)
		{	for (int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
		
			for (int j=4;j>=i;j--)
			{
				System.out.print("*");
				
			}
			for (int k=3;k>=i;k--)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}*/
		
		for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(j<i)
					System.out.print(" ");
					else
					System.out.print("*");
				}
				for (int j=4;j>=1;j--)
				{
					if(j<i)
					System.out.print(" ");
					else
					System.out.print("*");
				}
				System.out.println();
			}
		
	
	}

}