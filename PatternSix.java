package com.Patterns;

public class PatternSix {

	public static void main(String[] args) {
		int n=10;
		int spaces;
		spaces=n/2;
		int stars=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j==1||j==stars)
				System.out.print("N");
				else
					System.out.print(" ");
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
