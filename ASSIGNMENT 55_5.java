import java.util.*;

class Pattern
{
	public void PatternX(String str)
	{
		int iRow = str.length();
		int iCol = str.length();
		char [] str1 = str.toCharArray();
		for (int i = 0;i<iRow;i++)
		{
			for(int j =0;j<iCol;j++)
			{
				if (j<=i)
				{
					System.out.print(str1[j]+"\t");
				}
			}
			System.out.println();
		}
		for (int i = iRow-1;i>=0;i--)
		{
			for(int j =0;j<iCol-1;j++)
			{
				if (i>=j)
				{
					System.out.print(str1[j]+"\t");
				}
			}
			System.out.println();
		}
		
	}
}


class ASSIGNMENT 55_5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sobj.nextLine();

		Pattern obj = new Pattern();
		obj.PatternX(str);
		
	}
}