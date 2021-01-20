//this program will prints the sum of all elements in the array.
package com.src1;

public class Sum_all_ele_array {

	public static void main(String[] args) {
		int sum=0;
		int A[]= {1,2,3,4,5,6};
		for(int i=0;i<=A.length-1;i++)
		{
			sum=sum+A[i];
		}
			System.out.println(sum);
	}

}
