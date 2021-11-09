import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		 int num ;
		 
		 System.out.println("Please enter a number");
		 Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			 
		 switch(num) {
		 case 1:
			 System.out.println("This is case 1");
			 break;
			 
		 case 2:
			 System.out.println("This is case 2");
			 break;
		 case 3:
			 System.out.println("This is case 3");
			 break;
			 default:
			System.out.println("This  is a default case");
		
			
		 }
	}

}
