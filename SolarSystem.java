class SolarSystem{
	
	String[] planets = new String[5];
	int index = 0;
	
	void saveSolarSystem(String planet){
		
		System.out.println("SolarSystem is running in saveSolarSystem method");
		
		if(planet!=null){
			
			System.out.println("planets not null");
			
			if(this.index < this.planets.length){
				
				this.planets[index] = planet;
				System.out.println("planet names in the index: "+this.planets[index]);
				System.out.println("index of planet name: "+this.index);
				this.index++;
			}
			else{
				System.out.println("Memory is full"+this.planets.length);
			}
		}
		else{
			System.out.println("planet is null");
		}
	}
	
	void search(String planet){
		
		System.out.println("SolarSystem is running in search method");
		
		if(planet != null){
			
			System.out.println("planets not null");
			Boolean found = false;
			
			for(String temp : this.planets){
				
				if(planet == temp){
					
					System.out.println("book is found");
					found = true;
					break;
					
				}
			}
			
			if(!found){
				System.out.println("book not found");
			}
			
		}
		else{
			System.out.println("planet is null");
		}
		
	}
}