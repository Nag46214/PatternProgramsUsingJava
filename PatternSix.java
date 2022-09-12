package com.Patterns;
import java.util.*;
public class PatternSix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=sc.nextInt();
		int spaces;
		spaces=n/2;
		int stars=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				
				System.out.print("x");
				
			}
			System.out.println();
			if(i<n/2) {
				stars+=2;
				spaces--;
			}
			else {
				stars-=2;
				spaces++;
			}
		}
	}
}

/*
Inputs:-
Enter the value: 
10
Output:-
    x
   xxx
  xxxxx
 xxxxxxx
xxxxxxxxx
 xxxxxxx
  xxxxx
   xxx
    x
    
*/
