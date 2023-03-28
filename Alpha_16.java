/*

ABCDEDCBA
 BCDEDCB
  CDEDC
   DED
    E
*/

class Alpha_16
	{

public static void main(String args[]) 
		{	int al=64;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(j<i)
					System.out.print(" ");
					else
					System.out.print((char)(al+j));
				}
				for (int j=4;j>=1;j--)
				{
					if(j<i)
					System.out.print(" ");
					else
					System.out.print((char)(al+j));
				}
				System.out.println();
			}
		}
	
	}
	