//Finds the second largest element form an array
package com.src1;

public class Find_second_largest {

	public static void main(String[] args) {
		int max1,max2;
		int A[]= {5,6,4,7,8,12,14,15,16};
		max1=A[0];
		max2=A[0];
		for(int i=0;i<=A.length-1;i++)
		{
			if(A[i]>max1)
			{
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2)
			{
				max2=max1;
			}
		}
		System.out.println("Second largest is "+max2);

	}

}
