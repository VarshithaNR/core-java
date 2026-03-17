class Runner {
    public static void main(String[] args) {

        // FoodItem
        int price1 = FoodItem.getPrice("dosa");
        System.out.println("Returned: " + price1);

        int price2 = FoodItem.getPrice("berries");
        System.out.println("Returned: " + price2);

        int price3 = FoodItem.getPrice("pizza");
        System.out.println("Returned: " + price3);

        System.out.println("--------------------------------");

        // TissuePaper
        int tissuePrice = TissuePaper.getPrice(1.5);
        System.out.println("Returned: " + tissuePrice);

        System.out.println("--------------------------------");

        // Tyre
        int tyrePrice = Tyre.getPrice('M', 15);
        System.out.println("Returned: " + tyrePrice);

        System.out.println("--------------------------------");

        // WaterMelon
        int watermelonPrice = WaterMelon.getPrice(3);
        System.out.println("Returned: " + watermelonPrice);

        System.out.println("--------------------------------");

        // PenDrive
        int penDriveSize = PenDrive.getSize('S');
        System.out.println("Returned: " + penDriveSize);

        System.out.println("--------------------------------");

        // Ticket - place
        int ticketPrice1 = Ticket.getPrice("city1");
        System.out.println("Returned: " + ticketPrice1);

        // Ticket - movie
        int ticketPrice2 = Ticket.getPrice("kgf", 'G', "pvr");
        System.out.println("Returned: " + ticketPrice2);

        // Ticket - email
        String email = Ticket.getEmail("ram");
        System.out.println("Returned: " + email);

        // Ticket - mobile
        long mobile = Ticket.getMobile("ram");
        System.out.println("Returned: " + mobile);
    }
}