package reference;

public class EX6 {
	public static void main(String[] args) {
		
		//�Ž������� ��� �������� ������ �� �ִ���, ���� money�� �ݾ��� �������� �ٲ����� ���� ��� ������ �ʿ�����. ��, ������ �����Ž�����
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int[] temp = new int[4]; // _ _ _ _
		
		System.out.println("money = " + money);
		
		for(int i = 0; i<coinUnit.length; i++) {
			
			temp[i] = money/coinUnit[i]; // 5,26,53,268 
			money = money/temp[i];
		}
		
		for(int i = 0; i<temp.length; i++) {
			System.out.println(coinUnit[i] + "�� " + temp[i]);
		}
	}
}
