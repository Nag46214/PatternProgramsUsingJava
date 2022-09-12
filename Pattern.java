import java.util.*;
public class Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the size ");
   	 	int n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
/*
Inputs:-
Enter the size 
7
Output:-
1 1 1 1 1 1 1 
2 2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 
5 5 5 
6 6 
7 

*/
