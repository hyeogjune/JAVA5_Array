package reference;

public class EX5 {

	public static void main(String[] args) {
		// 1~9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷�
		int [] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3]; //_ _ _
		
		
		
		for(int i = 0; i<ballArr.length; i++) {
			int k = (int) (Math.random() * ballArr.length);
			int temp = 0;
			
			ballArr[i] = ballArr[k]; // �迭�� 1~9������ �������
			temp = ballArr[i]; // �迭�� ������� 1~9�� �������			
			ballArr[k] = temp; // �����迭�� ������ �������, ���� �� �۾��� ��..?
			
			System.arraycopy(ballArr,0,ball3,0,3);
			
		}

		for(int i = 0; i<3; i++) {
			System.out.print(ball3[i]);			
		}

		
	}

}
