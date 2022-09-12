import java.util.*;
public class PatternFour 
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
				System.out.print(j+" ");
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
7 6 5 4 3 2 1 
7 6 5 4 3 2 
7 6 5 4 3 
7 6 5 4 
7 6 5 
7 6 
7 
*/
