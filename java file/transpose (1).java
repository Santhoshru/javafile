import java.util.*;
class transpose
{
	public static void main(String args[])
	{  
	int original[][]={{5,8,9},{17,21,22},{6,3,1}};     
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(original[i][j]+" ");    
		}
		System.out.println();    
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(original[j][i]+" ");    
		}
		System.out.println();    
	}    
	}
}