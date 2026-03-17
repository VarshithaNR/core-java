class WaterMelon {

    static int getPrice(int quantity) {

        if (quantity == 1) {
            System.out.println("1 Watermelon price is 10");
            return 10;
        }

        if (quantity == 2) {
            System.out.println("2 Watermelons price is 20");
            return 20;
        }

        if (quantity == 3) {
            System.out.println("3 Watermelons price is 30");
            return 30;
        }

        if (quantity == 4) {
            System.out.println("4 Watermelons price is 40");
            return 40;
        }

        if (quantity == 5) {
            System.out.println("5 Watermelons price is 50");
            return 50;
        }

        else {
            System.out.println("Invalid quantity");
            return -100;
        }
    }
}