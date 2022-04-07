
public class SilverCard extends Card {

	public SilverCard(Owner owner) {
		super(owner);
		this.initialDiscount=2;
		
	}
	
	@Override
	public void getDiscount() {
		if(this.owner.getTurnoverPreviousMonth()>300)
			this.initialDiscount=3.5;
	}

	
}
