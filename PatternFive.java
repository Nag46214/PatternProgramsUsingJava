package com.Patterns;
public class PatternFive {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {
				int k=(i-1)*5+1;
				for(int j=1;j<=5;j++) {
					System.out.print(k++ +"\t");	
				}
			}
			else
			{
				int k=i*5;
				for(int j=1;j<=5;j++) {
					System.out.print(k-- +"\t");
				}
			}
			System.out.println();
		}
	}
}
