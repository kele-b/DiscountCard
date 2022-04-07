
public abstract class Card {
	
	protected Owner owner;
	protected double initialDiscount;
	
	Card(Owner owner){
		this.owner=owner;
	}

	public abstract void getDiscount();
}
