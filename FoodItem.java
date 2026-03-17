class FoodItem {

    static int getPrice(String item) {

        if (item == "dosa") {
            System.out.println("Dosa price is 30");
            return 30;
        }

        if (item == "berries") {
            System.out.println("Berries price is 20");
            return 20;
        }

        if (item == "oranges") {
            System.out.println("Oranges price is 25");
            return 25;
        }

        if (item == "guava") {
            System.out.println("Guava price is 15");
            return 15;
        }

        if (item == "spinach") {
            System.out.println("Spinach price is 18");
            return 18;
        }

        if (item == "broccoli") {
            System.out.println("Broccoli price is 35");
            return 35;
        }

        if (item == "sweet potatoes") {
            System.out.println("Sweet potatoes price is 22");
            return 22;
        }

        if (item == "kale") {
            System.out.println("Kale price is 28");
            return 28;
        }

        if (item == "salmon") {
            System.out.println("Salmon price is 50");
            return 50;
        }

        if (item == "chicken") {
            System.out.println("Chicken price is 45");
            return 45;
        }

        if (item == "eggs") {
            System.out.println("Eggs price is 10");
            return 10;
        }

        if (item == "beans") {
            System.out.println("Beans price is 12");
            return 12;
        }

        if (item == "lentils") {
            System.out.println("Lentils price is 14");
            return 14;
        }

        if (item == "nuts") {
            System.out.println("Nuts price is 40");
            return 40;
        }

        if (item == "seeds") {
            System.out.println("Seeds price is 18");
            return 18;
        }

        if (item == "olive oil") {
            System.out.println("Olive oil price is 60");
            return 60;
        }

        else {
            System.out.println("Item not found");
            return -100;
        }
    }
}