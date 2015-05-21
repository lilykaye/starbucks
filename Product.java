import java.util.List;


public class Product {
	/** the price of each size */
	public List<Integer> price;
	
	/** the cost of each size */
	public List<Integer> cost;
	
	/** the name of the product */
	public String name;
	
	/** the amount of this product ordered in total */
	public int orderTotal; 
	
	
	public Product(String name, List<Integer> price, List<Integer> cost)
	{
		
		System.out.println("21: " + price.get(0).intValue());
		
		
		
		
	this.name = name;
	this.price = price;
	this.cost = cost;
	
	System.out.println(cost.get(0).toString());
	
	}
			
	
	public String toString() {
		return null;
	}
}
