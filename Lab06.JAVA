public class Apple {
	private String type;
	private double price;
	private double weight;
	
	
	public Apple() {
		this.type = "Gala"; //Red Delicious, Golden Delicious,  Gala, Granny Smith
		this.price = 0.0; //non-negative
		this.weight = 0.0; //must be between 0-2 kgs
	}
	
	public Apple(String t, double w, double p) { //parameterized constructor
		this.type = t;
		this.weight = w;
		this.price = p;
	}
	
	
	public void setType(String t) {
		if(t.equals("Gala") || "Golden Delicious".equals(t) || "Red Delicious".equals(t) || "Granny Smith".equals(t)) {
			this.type = t;
		}
		else {
			System.out.println("This type is not valid.");
		}
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setWeight(double w) { //makes sure weight is more than & equal to 0 and less than & equal to 2
		if (w >= 0 && w<= 2) {
			System.out.println("");
			this.weight = w;
		}  else {
			this.weight = 0.0;}
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setPrice(double p) {
		if (p > 0) { //makes sure price is over $0
			this.price = p;	
		}
		else {
			this.price = 0.0;
		}
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	public String toString() {
		return "Apple Type: " + getType() + " \nWeight: " + getWeight() + "kgs \nPrice: $" + getPrice(); //creates sentence for the classes
	}
	
	public boolean equals(Apple c) {
		   return c != null && this.type.equals(c.getType()) && this.weight == c.getWeight() && this.price == c.getPrice();
	   }
	
}
