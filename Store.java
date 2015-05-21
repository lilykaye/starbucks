import java.util.LinkedList;
import java.util.List;


public class Store {
	/** all the orders in line at the store */
	public List<Product> orderHistory = new LinkedList<Product>();
	/** all the possible menu items */
	public List<Product> menu = new LinkedList<Product>();
	/** the amount of money the store has made */
	public int bank;
	//price/size
	public List<Integer> price = new LinkedList<Integer>();
	
	
	/**
	 * Constructor for store
	 * adds all the menu items
	 * @param bank amount of $$ the starbucks starts with.
	 */
	public Store(int bank) {
		// set bank
		//List<Integer> price = new LinkedList<Integer>();
		price.add(2); price.add(3); price.add(5);
		price.size();
		//possible menu items
		List<Integer> cost = new LinkedList<Integer>();
		cost.add(1); cost.add(2); cost.add(3);
		this.menu.add(new Product("Caffè Latte", price,cost) );
		this.menu.add(new Product("Iced Coffee", price, cost));
		this.menu.add(new Product("Dark Rost", price, cost));
		this.menu.add(new Product("Cappuccino", price, cost));
		this.menu.add(new Product("Expresso", price, cost));
		this.menu.add(new Product("Black Tea", price, cost));
		this.menu.add(new Product("Green Tea", price, cost));
		this.menu.add(new Product("Hot Chocolate", price, cost));
		
		
		menu.size();
		
	}
	
	/**
	 * take the product and process the order
	 */
	public void processOrder(Product p) {
		
	}	
	 
	public String toString() {
		 return null;
	}
}
