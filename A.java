import java.util.*;
class MatrixMultiplication
{
	int a[][];
	void acceptTwoDArray(int a[][])
	{
		this.a=a;
	}
	void showMatrixMultiplication()
	{
		int result[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				result [i][j]=0;
				for(int k=0;k<a.length;k++)
				{
					result[i][j]=a[i][k]*a[k][j];
				}
			}
		}
		
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result.length;j++)
			{
				System.out.println(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

public class MatrixMultiplicationApp
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Two D Array size?\t");
		int size=xyz.nextInt();
		int a[][]=new int [size][size];
		System.out.println("Enter Element in an array:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		MatrixMultiplication mm=new MatrixMultiplication();
		mm.acceptTwoDArray(a);
		mm.showMatrixMultiplication();
	}
}