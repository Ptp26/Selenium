
public class Square implements ShapeDemo {
	
	
	

	public static void main(String[] args) {
		Square sq = new Square();
		sq.moveShape();
		sq.colorShape();
	}
	@Override
	public void moveShape() {
		// TODO Auto-generated method stub
		
		System.out.println("This is the method to move the shape");
		
	}

	@Override
	public void colorShape() {
		System.out.println("This is the method to color the shape");
		
	}
	

}
