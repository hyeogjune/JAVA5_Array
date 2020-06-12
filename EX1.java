package reference;

public class EX1 {
	
	public static void main(String[] args) {
		//배열 arr에 담긴 모든 값을 더하는 프로그램
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i<=4; i++) {
			sum = sum + arr[i];
		}

		
		System.out.println("sum = " + sum);
		
	}

}
