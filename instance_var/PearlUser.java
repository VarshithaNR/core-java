class PearlUser{
	String name;
	String origin;

	PearlUser(String name,String origin){
		this.name=name;
		this.origin=origin;
	}

	void display(){
		System.out.println(name+" "+origin);
	}
}
