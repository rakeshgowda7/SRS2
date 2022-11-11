package P;

public class ReverseString {

	public static void main(String[] args) {
		String str = "RAKESH";
//		StringBuffer s = new StringBuffer(str);
//		StringBuffer rev =s.reverse();
//		System.out.println(rev);

//		String rev = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
		String rev = "";
		char a[] = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);

	}
}
