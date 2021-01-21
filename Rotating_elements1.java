//Right Rotation(1 step)
package com.src1;

public class Rotating_elements1 {

	public static void main(String[] args) {
		int temp;
		int A[]= {1,2,3,4,5,6};
		 for(int x:A)
	            System.out.print(x+",");
	        System.out.println("");
		temp=A[A.length-1];
		for(int i=1;i<A.length;i++)
		{
			A[A.length-i]=A[A.length-i-1];
		}
		A[0]=temp;
		for(int x:A)
            System.out.print(x+",");
        System.out.println("");

	}

}
