package reference;

public class EX5 {

	public static void main(String[] args) {
		// 1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
		int [] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3]; //_ _ _
		
		
		
		for(int i = 0; i<ballArr.length; i++) {
			int k = (int) (Math.random() * ballArr.length);
			int temp = 0;
			
			ballArr[i] = ballArr[k]; // 배열에 1~9랜덤값 집어넣음
			temp = ballArr[i]; // 배열을 빈공간에 1~9값 집어넣음			
			ballArr[k] = temp; // 랜덤배열에 랜덤값 집어넣음, 굳이 이 작업을 왜..?
			
			System.arraycopy(ballArr,0,ball3,0,3);
			
		}

		for(int i = 0; i<3; i++) {
			System.out.print(ball3[i]);			
		}

		
	}

}
