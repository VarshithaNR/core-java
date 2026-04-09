class NailCutter{

	String brand;
	double price;
	NailType type;
	UserName[] userName;

	NailCutter(String brand,double price,NailType type){
		this.brand=brand;
		this.price=price;
		this.type=type;
	}

	void info(){
		System.out.println("running in the method NailCutter");
		System.out.println("brand: "+this.brand);
		System.out.println("price: "+this.price);
		System.out.println("type: "+this.type);

		if(this.userName!=null){
			for(UserName temp : this.userName){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}