/**
 * 
 */
package com.greatlearning.questionone;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Aravind
 *
 */
public class ConstructionProcess {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// get the size of array from user
		System.out.println("\n Enter the total no of floors in the building : ");

		int size = sc.nextInt();
		int arr[] = new int[size + 1];

		// get the elements of the array from user
		for (int i = 1; i < size + 1; i++) {
			System.out.println("\n Enter the floor size given on day : " + i);
			int n = sc.nextInt();
			arr[n] = i;
		}

		int j = size;
		boolean flag;

		System.out.println("\n The order of construction is as follows ");

		// loop thru each day
		for (int i = 1; i <= size; i++) {

			flag = false;
			System.out.println("\n Day :" + i);

			// find the larger size floor and print the remaining floors till day
			while (j >= 1 && arr[j] <= i) {

				flag = true;
				System.out.print(" " + j);
				j--;
			}

			if (flag == true) {
				System.out.println();
			}
		}
	}
}
