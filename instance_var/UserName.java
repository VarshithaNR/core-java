class UserName{
	String name;
	String brand;

	UserName(String name,String brand){
		this.name=name;
		this.brand=brand;
	}

	void display(){
		System.out.println("running in the method UserName");
		System.out.println("name: "+this.name);
		System.out.println("brand: "+this.brand);
	}
}