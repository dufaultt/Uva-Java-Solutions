import java.util.Scanner;
import java.io.BufferedInputStream;
public class Main 
{

	public static void main(String[] args)
	{

		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		int i,j,min,max,count,countmax;
		
		countmax=0;
		
		while(inp.hasNext())
		{
			
			i=inp.nextInt();
			j=inp.nextInt();
			
			if(i>j)
			{
				min=j;
				max=i;
			}
			else
			{
				min=i;
				max=j;
			}
			
			countmax=0;
			
			for(int x=min; min<=max ;min++)
			{
				x=min;
				
				for(count=1; x!=1 ;count++)
				{
					if(x%2==1)
					{
						x=3*x+1;						
					}
					else
					{
						x=x/2;
					}
				}
				
				if(count>countmax)
				{
					countmax=count;
				}
			
			}
			
			System.out.println(i + " " + j + " " + countmax);
			
		}
		
		inp.close();
		

	}

}
