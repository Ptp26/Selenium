
public class Truck extends VehicleCommon{

	public static void main(String[] args) {
		
		
		Truck tk = new Truck();
		tk.start();
		tk.stop();
	}
	
	
	public void loadCapacity() {
		System.out.println("The load capacity of the truck is 1000 tons");
	}
}
