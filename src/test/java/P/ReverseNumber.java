package P;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 5678;
//		int rev = 0;
//		while (num != 0) {
//			rev = rev * 10 + num % 10; // need to take last number
//			num = num / 10; // remove the last number
//		}

		StringBuffer s = new StringBuffer(String.valueOf(num));
		StringBuffer rev = s.reverse();
		System.out.println(rev);

	}
}
