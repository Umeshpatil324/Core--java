package inheritancePractice;

public class Mobile {
	long number;
	String brand;
	int price;
	
	Mobile(){
		System.out.println("Mobile Info");
	}
	
	Mobile(long number,String brand,int price){
		this.number=number;
		this.brand=brand;
		this.price=price;
	}
	void viewDetails() {
		System.out.println("Mobile number:"+number);
		System.out.println("Mobile brand name:"+brand);
		System.out.println("Mobile price:"+price);
		
	}

}
