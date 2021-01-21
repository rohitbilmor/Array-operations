package com.src1;

public class Addition_of_2_2Ds_array {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},{1,3,5},{2,4,6},{4,6,8}};
		int B[][]= {{4,6,8},{2,4,6},{1,3,5},{1,2,3}};
		int C[][]=new int[4][3];
		for(int i=0;i<A.length;i++) 
		{
			for(int j=0;j<A[0].length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
			for(int x[]:C)
			{
				for(int y:x)
				{
					System.out.print(y+" ");
				}System.out.println(" ");
			}
		}

	}


