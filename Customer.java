import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {

	Random generator = new Random();
	/** the amount the customer has paid in his lifetime */
	public int totalPaid;

	/**
	 * pick product from the store's menu.
	 * add cost to totalPaid
	 * @return the product to be placed
	 */
	public  Product placeOrder(Store s) {
		//pick product from the store's menu
		int whichItem;
		int whichSize;

		whichItem = generator.nextInt(s.menu.size());
		whichSize = generator.nextInt(s.price.size());

		int customers[][];
		customers = new int[2][100];

		for(int i = 0; i < 100; i++)

		{
			customers[0][i] = i;

			if(i < 25)
			{
				if(generator.nextInt(100) == 0)
				{
					//1 is buy
					//0 is not buy
					customers[0][i] = customers[1][i];
					System.out.println("coffee");
				}

			}
//			else if((i >= 25) && (i < 50))
//			{
//				if(generator.nextInt(10) == 0)
//				{
//					customers[0][i] = customers[1][i];
//				}
//
//			}
//			else if((i >= 50) && (i < 68))
//			{
//				if(generator.nextInt(2) == 0)
//				{
//					customers[0][i] = customers[1][i];
//				}
//
//			}
//			else if((i >= 68) && (i < 80))
//			{
//				if(generator.nextInt(4) == 0 || generator.nextInt(4) == 1 || generator.nextInt(4) == 2)
//				{
//					customers[0][i] = customers[1][i];
//				}
//			}
//			else if((i >= 80) && (i < 92))
//			{
//				customers[0][i] = customers[1][i];
//			}
//			else if((i >= 92) && (i < 96))
//			{
//				customers[0][i] = customers[1][i];
//			}
//			else if((i >= 96) && (i <= 100))
//			{
//				customers[0][i] = customers[1][i];
//			}

		}
		
//		for(int row = 0; row < 1; row++){
//			for (int col = 0; col < 100; col++)
//			{
//				System.out.println(customers[row][col]);
//			}
//		}




		//add money to total paid
		this.totalPaid = s.menu.get(whichItem).price.get(whichSize);


		//return product to be placed

		return null;

	}

	public String toString() {
		return null;
	}

}
