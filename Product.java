

public class Product {
private int id;
private String name;
private int srok;
private int price;
public Product(int id, String name, int srok, int price) {
	super();
	this.id = id;
	this.name = name;
	this.srok = srok;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
public int getsrok() {
	return srok;
}
public void setsrok(int srok) {
	this.srok = srok;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "product [id=" + id + ", name=" + name + ", srok=" + srok + ", price=" + price + "]";
}

}
