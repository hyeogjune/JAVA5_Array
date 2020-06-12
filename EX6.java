package reference;

public class EX6 {
	public static void main(String[] args) {
		
		//거스름돈을 몇개의 동전으로 지불할 수 있는지, 변수 money의 금액을 동전으로 바꿨을떄 각각 몇개의 동전이 필요한지. 단, 가능한 적은거스름돈
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int[] temp = new int[4]; // _ _ _ _
		
		System.out.println("money = " + money);
		
		for(int i = 0; i<coinUnit.length; i++) {
			
			temp[i] = money/coinUnit[i]; // 5,26,53,268 
			money = money/temp[i];
		}
		
		for(int i = 0; i<temp.length; i++) {
			System.out.println(coinUnit[i] + "원 " + temp[i]);
		}
	}
}
