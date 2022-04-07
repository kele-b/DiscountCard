
public class BronzeCard extends Card {
	
	public BronzeCard(Owner owner) {
		super(owner);
		
	}
	
	@Override
	public  void getDiscount() {
		if(this.owner.getTurnoverPreviousMonth()<100)
			this.initialDiscount = 0;
		if(this.owner.getTurnoverPreviousMonth()>=100 && this.owner.getTurnoverPreviousMonth()<=300)
			this.initialDiscount = 1;
		else
			this.initialDiscount=2.5;
	}

}
