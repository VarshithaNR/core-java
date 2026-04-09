

class Boat{
	String name;
	double price;
	BoatType type;
	BoatUser[] users;

	Boat(String name,double price,BoatType type){
		this.name=name;
		this.price=price;
		this.type=type;
	}

	void info(){
		System.out.println(name+" "+price+" "+type);
		if(users!=null){
			for(BoatUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}