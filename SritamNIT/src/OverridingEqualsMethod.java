class Product{
	private int productId;
	private String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public boolean equals(Object obj) { // object obj = new product()
		if(obj instanceof Product) {
		Product p = (Product) obj;
		if(this.productId==p.productId && this.productName==p.productName) {
			return true;
		}
		else {
			return false;
		}
		}
		else {
			IO.println("please compare two same class objects");
			return false;
		}
	}
	public int hashCode() {
		return this.productId;
	}
}
public class OverridingEqualsMethod{
	void main() {
		Product p1 = new Product(111,"sritam");
		Product p2 = new Product(111,"sritam");
		IO.println(p1.equals(p2));
		IO.println(p1.hashCode());
		IO.println(p2.hashCode());
	}
}
