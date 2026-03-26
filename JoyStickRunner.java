class JoyStickRunner {
	public static void main(String[] args) {

		JoyStick j1 = new JoyStick();
		JoyStick j2 = new JoyStick();
		JoyStick j3 = new JoyStick();
		JoyStick j4 = new JoyStick();
		JoyStick j5 = new JoyStick();

		System.out.println(j1.buttons + " " + j1.price + " " + j1.model + " " + j1.wireless + " " + j1.battery);

		j1.buttons = 12;
		j1.price = 2500;
		j1.model = 'X';
		j1.wireless = true;
		j1.battery = 4000;

		System.out.println(j1.buttons + " " + j1.price + " " + j1.model + " " + j1.wireless + " " + j1.battery);
	}
}