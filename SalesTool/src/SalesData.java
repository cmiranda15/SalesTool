
public class SalesData {
	
	int[] data = {0,4,42};
	
	public void display() {
		System.out.println("Data:");
		for (int n: data) {
			System.out.println("Next value: " + n);
		}
	}
	
	public void doubleSales() {
		for (int i = 0; i<data.length; i++) {
			data[i] = data[i] * 2;
		}
	}
}
