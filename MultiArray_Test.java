package reference;

public class MultiArray_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int [] [] multiarr = new int [4][5];
		System.out.println(multiarr[0][0]);
		
		int [][] gugudan = {{9,1,9},{9,2,9},{9,3,27},{9,4,36}}; //4x3
		
		
		for(int i=0; i<gugudan.length; i++) {
			for(int j=0; j<gugudan[i].length; j++) {
				System.out.println(gugudan[i][j]);
			}
		}
		
		int[] arr = {1,2,3,4,5};
		
		for (int temp : arr) {
			System.out.println(temp);
		}
		*/
		
		//1 2 3 4 5
		//6 7 8 9 10
		//11 12 13 14 15
		//16 17 18 19 20
		//21 22 23 24 25
		int[] [] arr = new int[5][5];
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		
		//행렬 합
		int[][] arr1 = {{1,2}, {3,4}};
		int[][] arr2 = {{1,2}, {3,4}};
		int[][] arr3 = new int[2][2];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		//행렬 곱
		arr3[0][0] = arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[1][0];
		arr3[0][1] = arr1[0][0]*arr2[0][1] + arr1[0][1]*arr2[1][1];
		arr3[1][0] = arr1[1][0]*arr2[0][0] + arr1[1][1]*arr2[1][0];
		arr3[1][1] = arr1[1][1]*arr2[0][1] + arr1[1][1]*arr2[1][1];
		
		for (int i =0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for (int k=0; k<2; k++) {
					arr3[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
	}

}
