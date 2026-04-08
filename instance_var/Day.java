class Day{
	int hours;
	String name;
	String type;

	Day(int hours,String name,String type){
		this.hours=hours;
		this.name=name;
		this.type=type;
	}

	void show(){
		System.out.println(hours+" "+name+" "+type);
	}
}
