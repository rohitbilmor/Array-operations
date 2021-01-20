package com.src1;

public class Search_in_array {

	public static void main(String[] args) {
		int s=6;
		int A[]= {1,2,3,4,5,6};
		for(int i=0;i<=A.length-1;i++)
		{
			if(A[i]==s)
			{
				System.out.println("index of element is " +i);
				i=i++;
				System.exit(0);
			}
			
		}
		System.out.println("not found");
		
	}

}
