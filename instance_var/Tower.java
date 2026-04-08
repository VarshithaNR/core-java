class Tower{
	int height;
	String name;
	String location;

	Tower(int height,String name,String location){
		this.height=height;
		this.name=name;
		this.location=location;
	}

	void show(){
		System.out.println(height+" "+name+" "+location);
	}
}
