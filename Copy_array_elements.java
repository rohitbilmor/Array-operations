//Copying elements of A into B
package com.src1;

public class Copy_array_elements {

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5,6};
		int B[]=new int[A.length];
		for(int i=0;i<=A.length-1;i++)
		{
			B[i]=A[i];
		}
		for(int x:B)
			System.out.print(x+" ");

	}

}
