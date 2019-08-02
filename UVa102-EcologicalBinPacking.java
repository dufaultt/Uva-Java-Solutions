package UVa102;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		//Order is Brown, Green, Clear
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		double[][] bins = new double[3][3];
		double[] bcg,bgc,cbg,cgb,gbc,gcb;
		double min;
		int truemin;
		String minord = null;
		bcg = new double[2];
		bgc = new double[2];
		cbg = new double[2];
		cgb = new double[2];
		gbc = new double[2];
		gcb = new double[2];
		
		
		while(inp.hasNext())
		{
			min=1999999999;
			truemin = 0;
			bcg[1] = 0;
			bgc[1] = 0;
			cbg[1] = 0;
			cgb[1] = 0;
			gbc[1] = 0;
			gcb[1] = 0;
			
			for(int x=0; x<3; x++)
			{
				for(int y=0; y<3; y++)
				{
					bins[x][y] = inp.nextDouble();
				}
				
				
			}
			
			bcg[0] = bins[1][0] + bins [2][0] + bins [0][1] + bins [1][1] + bins[0][2] + bins[2][2];
			bgc[0] = bins[1][0] + bins [2][0] + bins [0][1] + bins [2][1] + bins[0][2] + bins[1][2];
			cbg[0] = bins[0][0] + bins [2][0] + bins [0][1] + bins [1][1] + bins[1][2] + bins[2][2];
			cgb[0] = bins[0][0] + bins [1][0] + bins [0][1] + bins [2][1] + bins[1][2] + bins[2][2];
			gbc[0] = bins[0][0] + bins [2][0] + bins [1][1] + bins [2][1] + bins[0][2] + bins[1][2];
			gcb[0] = bins[0][0] + bins [1][0] + bins [1][1] + bins [2][1] + bins[0][2] + bins[2][2];
			
			if(bcg[0] <= min)
			{
				min = bcg[0];
			}
			
			if(bgc[0] <= min)
			{
				min = bgc[0];
			}
			
			if(cbg[0] <= min)
			{
				min = cbg[0];
			}
			
			if(cgb[0] <= min)
			{
				min = cgb[0];
			}
			
			if(gbc[0] <= min)
			{
				min = gbc[0];
			}
			
			if(gcb[0] <= min)
			{
				min = gcb[0];
			}
			////////////////////////////
			if(bcg[0] == min)
			{
				bcg[1] = 1;
			}
			
			if(bgc[0] == min)
			{
				bgc[1] = 1;
			}
			
			if(cbg[0] == min)
			{
				cbg[1] = 1;
			}
			
			if(cgb[0] == min)
			{
				cgb[1] = 1;
			}
			
			if(gbc[0] == min)
			{
				gbc[1] = 1;
			}
			
			if(gcb[0] == min)
			{
				gcb[1] = 1;
			}
			///////////////////////////
			while(true)
			{
				if(bcg[1] == 1)
				{
					truemin = (int)bcg[0];
					minord = "BCG";
					break;
				}
				
				if(bgc[1] == 1)
				{
					truemin = (int)bgc[0];
					minord = "BGC";
					break;
				}
				
				if(cbg[1] == 1)
				{
					truemin = (int)cbg[0];
					minord = "CBG";
					break;
				}
				
				if(cgb[1] == 1)
				{
					truemin = (int)cgb[0];
					minord = "CGB";
					break;
				}
				
				if(gbc[1] == 1)
				{
					truemin = (int)gbc[0];
					minord = "GBC";
					break;
				}
				
				if(gcb[1] == 1)
				{
					truemin = (int)gcb[0];
					minord = "GCB";
					break;
				}
			}
			
			System.out.println(minord + " " + truemin);
			
		}
		
		inp.close();

	}

}

/*
 * for(int i=0;i<3;i++)
				{
					if(bins[i][0] >= lb);
					{
						lb=bins[i][0];
						lbc=i;
					}
					
					if(bins[i][1] >= lg)
					{
						lg=bins[i][1];
						lgc=i;
					}
					
					if(bins[i][2] >= lc)
					{
						lc=bins[i][2];
						lcc=i;
					}
				}
 */
 
