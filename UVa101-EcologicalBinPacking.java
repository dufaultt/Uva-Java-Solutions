package UVa101;

import java.util.Scanner;
import java.io.BufferedInputStream;
public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		int[][] ar = new int[25][25];
		
		int i=inp.nextInt();
		int c=0;
		String ins1;
		String ins2;
		int first, second;
		
		
		for(int j=i;j>=0;j--)
		{
			ar[c][0] = j;
					
			c++;
		}
		
		ins1 = inp.next();
		while(ins1.equals("quit") != false)
		{
			first = inp.nextInt();
			ins2 = inp.next();
			second = inp.nextInt();
			
			if(ins1.equals("move") == true)
			{
				if(ins2.equals("over"))
				{
					
				}
				else if(ins2.equals("onto"))
				{
					
				}
			}
			else if(ins1.equals("pile") == true)
			{
				if(ins2.equals("over"))
				{
					
				}
				else if(ins2.equals("onto"))
				{
					
				}
			}
				
			ins1 = inp.next();
			
		}
		
		for(int x=0; x<i; x++)
		{			
			System.out.println(x + ": ");
			for(int y=0; y<i; y++)
			{
				
			}
		}
		
		inp.close();
	}
	
}
