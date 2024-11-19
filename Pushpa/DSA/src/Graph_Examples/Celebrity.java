package Graph_Examples;

import java.util.Scanner;

public class Celebrity {
	 int v,visited[],g[][];
	 void createGraph(int nodes)
	    {   int v=nodes;
	        Scanner in=new Scanner(System.in);
	        g=new int[v][v];//adj mat   //taking connections from user 
	       // visited=new int[v];//visited array
	        for(int i =0;i<v;i++)
	        {
	            for(int j=0;j<v;j++)
	            {
	                System.out.println("Enter value for v"+i+" to v"+j+":");
	                g[i][j]=in.nextInt();

	            }
	        }
	        
	        
	        
	        
	        
	    }
	    void printG()
	    {
	        for(int i =0;i<v;i++)
	        {
	            for(int j=0;j<v;j++)
	            {
	                System.out.print(g[i][j]+"\t");
	            }
	            System.out.println();
	        }
	    }
}
