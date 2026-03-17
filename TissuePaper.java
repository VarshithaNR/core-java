class TissuePaper {

    static int getPrice(double thickness) {

        if (thickness == 1.0) {
            System.out.println("Thickness 1.0 price is 10");
            return 10;
        }

        if (thickness == 1.5) {
            System.out.println("Thickness 1.5 price is 10");
            return 10;
        }

        if (thickness == 2.0) {
            System.out.println("Thickness 2.0 price is 10");
            return 10;
        }

        if (thickness == 2.5) {
            System.out.println("Thickness 2.5 price is 10");
            return 10;
        }

        if (thickness == 3.0) {
            System.out.println("Thickness 3.0 price is 10");
            return 10;
        }

        else {
            System.out.println("Invalid thickness");
            return -100;
        }
    }
}