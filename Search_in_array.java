//we can search an element from an array which prints the index of key. 
package com.src1;
import java.util.Scanner;
public class Search_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s;
		s=sc.nextInt();
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
