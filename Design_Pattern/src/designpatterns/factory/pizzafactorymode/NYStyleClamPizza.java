package designpatterns.factory.pizzafactorymode;

public class NYStyleClamPizza extends Pizza{

	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}

}
