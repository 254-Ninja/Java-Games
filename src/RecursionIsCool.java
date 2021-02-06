
public class RecursionIsCool {

	public static void main(String[] args) {
	sayHi(5);
		
	}
	public static void sayHi(int n) {
		if(n == 0) {
			System.out.println("done!");
		}
	
	
	else {
		System.out.println("hi");
		sayHi(n);
	}
		}
	//Base case

}
