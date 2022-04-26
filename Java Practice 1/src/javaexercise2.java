public class SumOfNumber{
	public static void main(String[] args){
		calculate_sum();
	}
	static void calculate_sum() {
		int x = 0;
		for(int i = 0; i < 101; i++) {
			x = x + i;
			System.out.println(x);
		}
	}
}