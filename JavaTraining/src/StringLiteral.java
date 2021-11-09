
public class StringLiteral {

	public static void main(String[] args) {
		String str = "RCC";
		
		String str2 = new String("RCC");
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
	}

}
