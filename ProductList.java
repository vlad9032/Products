

public class ProductList {
private Product[] products;//massiv productov
private int count;
public ProductList() {
	products = new Product[5];
	count=-1;
}
public void add(Product	product) {
	products[++count] = product;
}
public Product get(int i) {
	return products[i];
}
public int size() {
	return count+1;
}
public void print() {
	for (int i = 0; i < size(); i++) {
		System.out.println(products[i]);
	}}
	public void printproductsByname(String name ) {
		for (int i = 0; i < size(); i++) {
			if(products[i].getname().equals(name)) {
		}
	}}
	public void printproductsBynameAndPrice(String name, int Price ) {
		for (int i = 0; i < size(); i++) {
			if(products[i].getname().equals(name) && products[i].getPrice().Price>24) {
		}
	}}
	public ProductList getproductsByname(String name ) {
		ProductList productsByname = new ProductList();
		for (int i = 0; i < size(); i++) {
			if(products[i].getname().equals(name)) {
				productsByname.add(products[i]);
		}
			
	}
		return productsByname;
	}
	
}


