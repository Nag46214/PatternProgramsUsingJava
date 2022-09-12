package com.Patterns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
// 1 2 3 2 , 2 2 , 2 5 2
class Bar1{
	public static List<Integer> intersection(List<Integer>A,List<Integer>B,List<Integer>C){
		
		A.retainAll(B);
		A.retainAll(C);
		Collections.sort(A);
		return A;
		
	}
}

public class PatternEight {
public static void main(String[] args) {
		List<Integer>l1=new ArrayList<Integer>();
		List<Integer>l2=new ArrayList<Integer>();
		List<Integer>l3=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l2.add(2);
		l2.add(3);
		l3.add(2);
		l3.add(3);
		l3.add(2);
		List<Integer>result=Bar1.intersection(l1,l2,l3);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
	
}
