package arrays;

import java.util.Arrays;

public class TesteArray3d {

	public static void main(String[] args) {
		
		int[][][] a = {
		{	
				{1, 2},
				{3, 4}, 
				{5, 6},
		},
		{
			{1},
			{2},
			{3},
		}
	};
		
		for(int[][] b: a) {
		for(int[] c: b) {
			System.out.print(Arrays.toString(c));
			}
		}
		System.out.println();
		System.out.print(Arrays.deepToString(a));
		
	}

}





