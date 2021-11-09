
public class EncapsulationDemo {
	
	
	
	
	public static void main(String[] args) {
		
		
		Common cm = new Common();
		int b = cm.setBreath(10);
		int l = cm.setLength(20);
		int h = cm.setHeight(15);
		
		cm.setBoxDimensions(l, b, h);
		
		System.out.println(cm.getLength());
	}

}
