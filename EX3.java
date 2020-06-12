package reference;

public class EX3 {
	public static void main(String[] args) {
		//배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서, 개수만큼 *찍어서 그래프 그리는 프로그램
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2}; //0~10
		int[] counter = new int[4];//주소값만 생성 _ _ _ _
		
		for(int i=0; i<answer.length; i++) {
			
			
			
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			
			
		}
		
		
		
	}
}
