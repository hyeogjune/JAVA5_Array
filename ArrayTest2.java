package reference;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ζ� 7�ڸ�(6�ڸ� + ���ʽ�1�ڸ�), �迭(array) Ȱ��, ������ ���ΰ�ġ�� �ʵ���, 1~45����
		
		int[] arr = new int[7]; //�ּһ���
		
		
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
