public class Pizza{
	private int price;
	private Boolean veg;
	
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	
	private Boolean isExtraCheeseAdded = false;
	private Boolean isExtraToppingsAdded = false;
	private Boolean isOptedforTakeout = false;

	
	public Pizza(Boolean veg) {
		this.veg = veg;
		
		if(veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	
	public void addExtraCheese(){
		isExtraCheeseAdded = true;
		
		//System.out.println("Extra Cheese Added.");
		
		this.price += extraCheesePrice;
		//isExtraCheeseAdded = false;
	}
	
	
	public void addExtraToppings(){
		isExtraToppingsAdded = true;
		
		//System.out.println("Extra Toppings Added.");
		
		this.price += extraToppingsPrice;
		//isExtraToppingsAdded = false;
	}
	
	

	public void takeAway(){
		isOptedforTakeout = true;
		
		//System.out.println("Takeaway opted.");
		
		this.price += backPackPrice;
		//isOptedforTakeout = false;
	}
	
	
	public void getBill(){
		String bill = "";
		
		System.out.println("Base Pizza: "+ basePizzaPrice);
		
		if(isExtraCheeseAdded){
			bill += "Extra Cheese: " + extraCheesePrice +"\n";
		}
		
		if(isExtraToppingsAdded){
			/*if (isExtraCheeseAdded){
				isExtraCheeseAdded = false;
			}*/
			bill += "Extra Toppings: " + extraToppingsPrice +"\n";
		}
		
		if(isOptedforTakeout){
			/*if (isExtraToppingsAdded){
				isExtraToppingsAdded = false;
			}*/
			bill += "Takeout opted: "+backPackPrice+"\n";
			
		}
		
		bill += "Total Bill: "+this.price+"\n";		//how does adding the "+" before "=" enables printing extra options with their prices?
		System.out.println(bill);
	}
}