package reference;

public class EX2 {
	public static void main(String[] args) {
		//2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷�
		
		int[][] arr = {{5,5,5,5,5}, 	 //25
					   {10,10,10,10,10}, //50
					   {20,20,20,20,20}, //100
					   {30,30,30,30,30}}; //150
		int total = 0;
		float average = 0;
		
		for(int i = 0; i<=3; i++) {
			for(int j = 0; j<=4; j++) {
				total = total + arr[i][j];//(0,0) + (0,1) + (0,2) +..
						
			}
			
			
		}
		
		average = (float) total/25;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
		
		
		
	}
}