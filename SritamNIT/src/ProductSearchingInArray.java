class Product2{
	private int id;
	private String name;
	private double price;
	public Product2(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}

public class ProductSearchingInArray {
  void main() {
	  int size = Integer.parseInt(IO.readln("enter size"));
	   Product2 arr[]=new Product2[size];
	   IO.println("Enter number for product: "+size);
	   int c=1;
	   for(int i=0;i<size;i++) {
		   IO.println("Enter details for product "+c+" :"); 
		   int id = Integer.parseInt(IO.readln("enter id"));
		   String name = IO.readln("enter name");
		   double price = Double.parseDouble(IO.readln("enter price"));
		   Product2 p = new Product2(id,name,price);
		   arr[i]=p;	
		   c++;
	   }
	   int pId = Integer.parseInt(IO.readln("enter product id to search"));
	   
	   boolean isFound=false;
	   for(Product2 brr:arr) {
		   if(brr.getId()==pId) {
		   IO.println("Product Found: "+brr);
		   isFound=true;
		   }		   
	   }
	   if(!isFound) {
		   IO.println("Product with ID "+pId+" not found.");
	   }
  }
}