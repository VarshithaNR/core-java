class HammerUser{
	String name;
	String usage;

	HammerUser(String name,String usage){
		this.name=name;
		this.usage=usage;
	}

	void display(){
		System.out.println(name+" "+usage);
	}
}
