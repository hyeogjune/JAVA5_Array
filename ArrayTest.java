package reference;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		
		//_ _ _ _ _ _ _ ¹è¿­ÀÌ »ı±è
		/*int[] arr = new int[7];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		
		System.out.println(arr[0]);
		
		for (int i=0; i<7; i++) {
			System.out.println(arr[i]);
			
		} */
		
		double[] arrdouble = null;
		long[] arrlong = {1,2,3};
		byte[] arrbyte = null;
		arrbyte = new byte[10];
		
		for (int i=0; i<10; i++) {
			arrbyte[i] = (byte) i;
		}
		for (int i=0; i<10; i++) {
			System.out.println(arrbyte[i]);
		}
		
	}
}
