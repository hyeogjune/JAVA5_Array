package reference;

public class EX4 {
	public static void main(String[] args) {
		
		//주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
		//배열의 행과 열 의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다
		
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
