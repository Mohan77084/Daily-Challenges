package learning.codingproblems.solutions;

import java.util.Scanner;

public class GiveIndexOfElement {

	public static void main(String[] args) {
		int array[] = {1,3,3,4,5,5,5,6,7,7,8,8,9,9,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				System.out.print(i+" ");
				found = true;
			}
		}	
        if (!found) {
            System.out.println("Element not found");
        }

	}
	

}
