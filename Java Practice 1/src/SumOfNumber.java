public class SumOfNumber{
	public static void main(String[] args){
		int result = sum(20);
		System.out.println(result);
	}
	
	public static int sum(int f) {
		if (f > 0) {
			return f + sum(f - 1);
		} else {
			return 0;
		}
	}
}