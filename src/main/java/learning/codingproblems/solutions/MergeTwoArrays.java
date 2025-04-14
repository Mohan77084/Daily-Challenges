package learning.codingproblems.solutions;

import java.util.ArrayList;
//Write a program to merge two array lists [a,b,c] [1,2,3]. Output should be [a,1,b,2,c,3]. Result arraylist should be of size 6.
public class MergeTwoArrays {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayList<String> intToStrList = new ArrayList<String>();
		for (Integer integer : intList) {
			intToStrList.add(integer.toString());
		}
		
		ArrayList<String> combinedList = new ArrayList<String>();
		for(int i=0; i<strList.size(); i++) {
			if (i<strList.size()) {
			combinedList.add(strList.get(i));
			    }
			if (i<intToStrList.size()) {
				combinedList.add(intToStrList.get(i));
				}
		}
		System.out.println(combinedList);
		System.out.println("Size of list : "+combinedList.size());
	}

}
