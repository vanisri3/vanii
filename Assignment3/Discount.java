package Assignment3;

public interface Discount {  //Interface, for discount 
	
	double discountpercent();
}

class ordering implements Discount { //implementation of interface Discount
	
	public double discountpercent() {
		return 0.40;
	}
	
}	