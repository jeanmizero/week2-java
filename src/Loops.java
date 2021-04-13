public class Loops {

	public static void main(String[] args) {
		// a. while loop that prints all even numbers from 0 to 100
		int i = 0;
		while(i <= 100) {
			System.out.println(i );
			i += 2;
		}
		// b. while loop that prints every 3rd number going backwards 
		int x = 100;
		while(--x >= 0) {
			if (x % 3 == 0) {
				System.out.println(x);	
			}
		}		
		// c. for loop that prints every other number from 1 to 100
		for (int y = 1; y<= 100; y+= 2) {
			System.out.println(y);
		}
		// d.for loop that prints every number from 0 to 100, but if the number is divisible by 3
		for (int z = 0; z <= 100; z++) {
			if(z % 15 == 0) {
				System.out.println("HelloWorld");	
			}else if(z % 5 == 0) {
				System.out.println("World");
			}else if(z % 3 == 0) {
				System.out.println("Hello");
	
			}else {
				System.out.println("z");
			}
		}
	}
}
