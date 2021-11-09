
public class Circle extends Shapes{
	
	
	
	public static void main(String [] args) {
		
		Circle c = new Circle();
		c.drawColor();
		c.drawDesign();
		c.drawShape();
	}

	@Override
	public void drawShape() {
		System.out.println("We are draing shape");
		
	}

	@Override
	public void drawColor() {
		System.out.println("We are drawing color");
		
	}

	@Override
	public void drawDesign() {
		System.out.println("We are drawing design");
		
	}

}
