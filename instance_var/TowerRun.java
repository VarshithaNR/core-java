
class TowerRun{
	int floors;
	String type;

	TowerRun(int floors,String type){
		this.floors=floors;
		this.type=type;
	}

	void details(){
		System.out.println(floors+" "+type);
	}

	public Tower info(){
		return new Tower(300,"TV Tower","Delhi");
	}
}
