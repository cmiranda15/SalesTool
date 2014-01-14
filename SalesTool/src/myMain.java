
public class myMain {

	public static void main(String[] args) {
		System.out.println("Executing main");
		displayGreeting();
		SalesData data = new SalesData();
		data.display();
		System.out.println("Doubling sales");
		data.doubleSales();
		data.display();

	}
	
	public static void displayGreeting() {
		System.out.println("Hello Happy Sales People!");
		System.out.println("This app shows sales data.");
		System.out.println("-------------------------");
	}

}
