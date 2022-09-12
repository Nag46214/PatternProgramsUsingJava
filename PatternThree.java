package com.Patterns;
import java.util.*;
public class PatternThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=sc.nextInt();
		int stars=1;
		int spaces=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=spaces;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("$");
			}
			System.out.println();
			stars+=2;
			spaces--;
		}
	}
}
/*
Enter the value: 
10
         $
        $$$
       $$$$$
      $$$$$$$
     $$$$$$$$$
    $$$$$$$$$$$
   $$$$$$$$$$$$$
  $$$$$$$$$$$$$$$
 $$$$$$$$$$$$$$$$$
$$$$$$$$$$$$$$$$$$$
*/
