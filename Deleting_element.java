//Deleting an element form an array at index 3
package com.src1;
public class Deleting_element {

	public static void main(String[] args) {
		int index=4;
		int A[]=new int[10];
		A[0]=1;
		A[1]=4;
		A[2]=8;
		A[3]=6;
		A[4]=11;
		A[5]=19;
		int n=6;
		for(int i=0;i<=A.length-1;i++) {
	    	   System.out.print(A[i]+" ");
		}
		System.out.println("");
		for(int i=index;i<=n;i++)
		{
			A[i]=A[i+1];
		}
		for(int i=0;i<=A.length-1;i++) {
	    	   System.out.print(A[i]+" ");
		}
	}

}
