class FlightRunner {
	public static void main(String[] args) {

		Flight f1 = new Flight();
		Flight f2 = new Flight();
		Flight f3 = new Flight();
		Flight f4 = new Flight();
		Flight f5 = new Flight();

		System.out.println(f1.seats + " " + f1.ticketPrice + " " + f1.type + " " + f1.international + " " + f1.duration);

		f1.seats = 180;
		f1.ticketPrice = 5000;
		f1.type = 'D';
		f1.international = false;
		f1.duration = 2;

		System.out.println(f1.seats + " " + f1.ticketPrice + " " + f1.type + " " + f1.international + " " + f1.duration);
	}
}