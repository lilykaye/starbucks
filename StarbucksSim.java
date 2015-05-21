import java.util.Random;


public class StarbucksSim {
	public static void main(String[] args) {
		Store star = new Store(100);
		Random generator = new Random();

		Customer[] customers = new Customer[100];
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer();
			//trying to make it not print for such a long time. (so you just get a general idea of what the customers buy 
			if(generator.nextInt(1000) == (1) || (2)|| (3)|| (4)|| (5)|| (6)|| (7)){
				System.out.println(customers);
			}
		}
//print every 20 customers then the total at the end.
		int rounds = 100;
		for (int j = 0; j < rounds; j++) {
			for (Customer c : customers) {
				c.placeOrder(star);
				System.out.println(c);
			}
			System.out.println(star);
		}

	}
}
