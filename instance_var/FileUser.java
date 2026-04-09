class FileUser{
	String name;
	String type;

	FileUser(String name,String type){
		this.name=name;
		this.type=type;
	}

	void display(){
		System.out.println(name+" "+type);
	}
}
