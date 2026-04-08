
class DayRun{
	int number;
	String season;

	DayRun(int number,String season){
		this.number=number;
		this.season=season;
	}

	void details(){
		System.out.println(number+" "+season);
	}

	public Day info(){
		return new Day(24,"Monday","Working");
	}
}
