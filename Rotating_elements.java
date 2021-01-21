//Left Rotation(1 step)
package com.src1;

public class Rotating_elements {

	public static void main(String[] args) {
		int temp;
		int A[]= {1,2,3,4,5,6};
		 for(int x:A)
	            System.out.print(x+",");
	        System.out.println("");
		temp=A[0];
		for(int i=1;i<A.length;i++)
		{
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		for(int x:A)
            System.out.print(x+",");
        System.out.println("");

	}

}
