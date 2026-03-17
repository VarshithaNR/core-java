class Ticket {

    static int getPrice(String place) {

        if (place == "city1") {
			System.out.println("Price 30"); return 30;
		}
        if (place == "city2") {
			System.out.println("Price 30"); return 30; 
		}
        if (place == "city3") { 
		System.out.println("Price 30"); return 30; 
		}
        if (place == "city4") {
			System.out.println("Price 30"); return 30; 
		}
        if (place == "city5") {
		System.out.println("Price 30"); return 30; 
		}
        if (place == "city6") {
			System.out.println("Price 30"); return 30; 
		}
        if (place == "city7") {
			System.out.println("Price 30"); return 30;
		}
        if (place == "city8") {
			System.out.println("Price 30"); return 30; 
		}
        if (place == "city9") {
			System.out.println("Price 30"); return 30; 
		}
        if (place == "city10") {
			System.out.println("Price 30"); return 30;
		}

        return -100;
    }

    static int getPrice(String movie, char seatType, String theater) {

        if (movie == "kgf" && seatType == 'G' && theater == "pvr") { 
		System.out.println("Price 50"); return 50; 
		}
        if (movie == "rrr" && seatType == 'G' && theater == "inox") {
			System.out.println("Price 50"); return 50; 
			}
        if (movie == "leo" && seatType == 'G' && theater == "cinepolis") {
			System.out.println("Price 50"); return 50; 
			}
        if (movie == "pushpa" && seatType == 'G' && theater == "pvr") {
			System.out.println("Price 50"); return 50;
			}
        if (movie == "vikram" && seatType == 'G' && theater == "inox") {
			System.out.println("Price 50"); return 50; 
			}

        return -100;
    }

    static String getEmail(String name) {

        if (name == "ram") { 
		System.out.println("Email found"); return "ram@gmail.com"; 
		}
        if (name == "raj") {
			System.out.println("Email found"); return "raj@gmail.com"; 
		}
        if (name == "ravi") {
			System.out.println("Email found"); return "ravi@gmail.com";
		}
        if (name == "arun") {
			System.out.println("Email found"); return "arun@gmail.com"; 
		}
        if (name == "kiran") { 
		System.out.println("Email found"); return "kiran@gmail.com"; 
		}
        if (name == "vinay") {
			System.out.println("Email found"); return "vinay@gmail.com"; 
		}
        if (name == "akash") {
			System.out.println("Email found"); return "akash@gmail.com"; 
		}
        if (name == "manoj") {
			System.out.println("Email found"); return "manoj@gmail.com"; 
		}
        if (name == "deepak") {
			System.out.println("Email found"); return "deepak@gmail.com"; 
		}
        if (name == "rohit") {
			System.out.println("Email found"); return "rohit@gmail.com"; 
		}
        if (name == "rahul") {
			System.out.println("Email found"); return "rahul@gmail.com"; 
		}
        if (name == "naveen") {
			System.out.println("Email found"); return "naveen@gmail.com"; 
		}
        if (name == "suresh") {
			System.out.println("Email found"); return "suresh@gmail.com"; 
		}
        if (name == "mahesh") {
			System.out.println("Email found"); return "mahesh@gmail.com"; 
		}
        if (name == "ganesh") {
			System.out.println("Email found"); return "ganesh@gmail.com"; 
		}

        return "invalid";
    }


    static long getMobile(String name) {

        if (name == "ram") { System.out.println("Mobile found"); return 9000000001L;
		}
        if (name == "raj") { System.out.println("Mobile found"); return 9000000002L; 
		}
        if (name == "ravi") { System.out.println("Mobile found"); return 9000000003L;
		}
        if (name == "arun") { System.out.println("Mobile found"); return 9000000004L; 
		}
        if (name == "kiran") { System.out.println("Mobile found"); return 9000000005L; 
		}
        if (name == "vinay") { System.out.println("Mobile found"); return 9000000006L;
		}
        if (name == "akash") { System.out.println("Mobile found"); return 9000000007L; 
		}
        if (name == "manoj") { System.out.println("Mobile found"); return 9000000008L; 
		}
        if (name == "deepak") { System.out.println("Mobile found"); return 9000000009L; 
		}
        if (name == "rohit") { System.out.println("Mobile found"); return 9000000010L; 
		}
        if (name == "rahul") { System.out.println("Mobile found"); return 9000000011L;
		}
        if (name == "naveen") { System.out.println("Mobile found"); return 9000000012L;
		}
        if (name == "suresh") { System.out.println("Mobile found"); return 9000000013L; 
		}
        if (name == "mahesh") { System.out.println("Mobile found"); return 9000000014L;
		}
        if (name == "ganesh") { System.out.println("Mobile found"); return 9000000015L; 
		}

        return -100;
    }
}