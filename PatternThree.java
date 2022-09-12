package com.Patterns;

public class PatternThree {

	public static void main(String[] args) {
		int n=6;
		int stars=1;
		//int spaces=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j==1||i==n||j==stars)
				System.out.print("$");
				else
					System.out.print("0");
			}
			System.out.println();
			stars+=2;
			//spaces--;
		}
	}
}
/*
$
$0$
$000$
$00000$
$0000000$
$$$$$$$$$$$
*/