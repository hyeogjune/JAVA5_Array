package reference;

public class EX4 {
	public static void main(String[] args) {
		
		//�־��� 2���� �迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭�� �����ؼ�
		//�迭�� ��� �� �� ������ ��ҿ� �� ���� ���� ������ �����ϰ� ����ϴ� ���α׷��̴�
		
		int[][] score = {
						{100,100,100},
						{20,20,20},
						{30,30,30},
						{40,40,40},
						{50,50,50},				
						};
		int[][] result = new int[score.length+1][score[0].length+1]; //int[6][4]
		
				
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				result[i][j] = score[i][j];
				result[i][3] = score[i][0]+score[i][1]+score[i][2];
				result[5][j] = score[0][j]+score[1][j]+score[2][j]+score[3][j]+score[4][j];
				result[5][3] = score[i][j]+result[5][3];
				
			}
			
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
			
		}
		
		
		
		
		
	}
}
