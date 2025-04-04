package learning.codingproblems.solutions;

import java.util.ArrayList;
import java.util.List;

public class PrintSecondSmallestAndSecondLargestNumbersInArray {

	public static void main(String[] args) {
		int [] array = {5,1,3,5,9,6,8,45,79,88,-5};
		List <Integer> arrList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			int temp =0;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}				
			}
			arrList.add(array[i]);
		}
			System.out.println(arrList);
			System.out.println("Second smallest number is "+arrList.get(1));
			System.out.println("Second largest number is "+arrList.get(arrList.size()-2));

	}

}
