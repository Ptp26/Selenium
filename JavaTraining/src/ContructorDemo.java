
public class ContructorDemo {
	
	
	public ContructorDemo() {
		System.out.println("This is a default constructor");
	}
	
	public ContructorDemo(int i) {
		System.out.println("This a parametrized constructor" +i);
	}
	public static void main(String[] args) {
		ContructorDemo ce = new ContructorDemo();

	}

}
