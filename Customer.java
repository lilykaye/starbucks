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
		int x = 0;

		whichItem = generator.nextInt(s.menu.size());
		whichSize = generator.nextInt(s.price.size());

		int customers[][];
		customers = new int[2][100];

		for(int i = 0; i < 100; i++)

		{
			customers[0][i] = i;

			if(i < 25)
			{
				if(generator.nextInt(x) == 0)
				{
					//1 is buy
					//0 is not buy
					customers[0][i] = 1;
				}

				else {
					customers[0][i] = 0;
				}

			}
			if((i >= 25) && (i < 50))
			{
				if(generator.nextInt(x) == 0)
				{
					customers[0][i] = 1;
				}

				else {
					customers[0][i] = 0;
				}

			}
			if((i >= 50) && (i < 68))
			{
				if(generator.nextInt(x) == 0)
				{
					customers[0][i] = 1;
				}

				else {
					customers[0][i] = 0;
				}

			}
			if((i >= 68) && (i < 80))
			{
				if(generator.nextInt(x) == 0)
				{
					customers[0][i] = 1;
				}

				else {
					customers[0][i] = 0;
				}
			}
			if((i >= 80) && (i < 92))
			{
				
				if(generator.nextInt(x) == 0)
				{
					customers[0][i] = 1;
				}
				
				else {
					customers[0][i] = 0;
				}

			}
			if((i >= 92) && (i < 96))
			{
				
				if(generator.nextInt(x) == 0)
				{
					customers[0][i] = 1;
				}
				
				else {
					customers[0][i] = 0;
				}

			}
			if((i >= 96) && (i <= 100))
			{
				if(generator.nextInt(x) == 0)
				{
					customers[0][i] = 1;
				}
				
				else {
					customers[0][i] = 0;
				}

			}
		}

		for (int col = 0; col < 100; col++)
		{
			System.out.println(customers[0][col]);
		}

		//add money to total paid
		this.totalPaid = s.menu.get(whichItem).price.get(whichSize);


		//return product to be placed

		return null;

	}

	public String toString() {
		return null;
	}

}
