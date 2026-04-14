class SolarSystemRunner{
	
	public static void main(String... args){
		
		SolarSystem solarSystem = new SolarSystem();
		solarSystem.saveSolarSystem("earth");
		solarSystem.saveSolarSystem("jupiter");
		solarSystem.saveSolarSystem("mercury");
		solarSystem.saveSolarSystem("venus");
		solarSystem.saveSolarSystem("pluto");
		
		solarSystem.search("earth");
	}

}