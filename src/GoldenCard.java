
public class GoldenCard extends Card{

	public GoldenCard(Owner owner) {
		super(owner);
		this.initialDiscount=2;
	}
	
	public void getDiscount() {
		double temp = 0;
		temp = temp + (this.owner.getTurnoverPreviousMonth()/100);
		if(temp>8)
			this.initialDiscount+=8;
		else
			this.initialDiscount+=temp;
	}
	
	

}
