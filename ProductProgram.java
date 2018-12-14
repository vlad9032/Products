

public class ProductProgram {
public static void main(String[] args) {
	ProductList productlist = new ProductList();
	productlist.add(new Product(1,"Kolbaska",2018,35));
	productlist.add(new Product(2,"Hleb",2018,11));
	productlist.add(new Product(3,"Kapustka",2021,3));
	productlist.add(new Product(4,"Kolbaska",2019,25));
	productlist.add(new Product(4,"Kolbaska",2019,20));
	productlist.add(new Product(4,"Kolbaska",2019,23));
	productlist.add(new Product(5,"Kartofel",2019,20));
	productlist.printproductsByname("Kolbaska");
	productlist.printproductsBynameAndPrice("Kolbaska");
	
	ProductList productsKolbaska = productlist.getproductsByname("Kolbaska");
		productsKolbaska.print();
	ProductList productsKolbaskaAndPrice = productlist.getproductsBynameAndPrice("Kolbaska");
		productsKolbaska.print();
	
	
}
	
}
