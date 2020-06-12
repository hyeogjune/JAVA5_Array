package reference;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또 7자리(6자리 + 보너스1자리), 배열(array) 활용, 값들이 서로겹치지 않도록, 1~45사이
		
		int[] arr = new int[7]; //주소생성
		
		
		for(int i =0; i<7; i++) {
			arr[i] = (int) (Math.random()*45)+1;
			if(arr[i+1]==arr[i]) {
				arr[i] = (int) (Math.random()*45)+1;
			}
		}
		
		for(int i=0; i<7; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}

}
