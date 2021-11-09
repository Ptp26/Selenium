
public class Common {

	private int length;
	private int breath;
	private int height;

	public void setBoxDimensions(int l, int b, int h) {
		System.out.println("The dimensions of the box are " + l + " " + b + " " + h + "");
	}

	public int setLength(int l) {
		
		if (l>1) {
			length = l;
		}
		else {
			System.out.println("Please enter a valid length");
		}
		
		
		return length;
	}

	public int setBreath(int b) {
		if (b>1) {
			breath = b;
		}
		else {
			System.out.println("Please enter a valid breath");
		}
	
		return breath;
	}

	public int setHeight(int h) {
		if (h>1) {
			height = h;
		}
		else {
			System.out.println("Please enter a valid height");
		}
		return height;
	}

	public int getHeight() {

		return height;
	}

	public int getLength() {

		return length;
	}

	public int getBreath() {

		return breath;
	}

}
