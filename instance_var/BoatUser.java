class BoatUser{
	String name;
	String location;

	BoatUser(String name,String location){
		this.name=name;
		this.location=location;
	}

	void display(){
		System.out.println(name+" "+location);
	}
}
