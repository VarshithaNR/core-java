class Tyre {

    static int getPrice(char brand, int size) {

        if (brand == 'M' && size == 15) {
            System.out.println("MRF tyre price is 12");
            return 12;
        }

        if (brand == 'A' && size == 16) {
            System.out.println("Apollo tyre price is 12");
            return 12;
        }

        if (brand == 'C' && size == 17) {
            System.out.println("CEAT tyre price is 12");
            return 12;
        }

        if (brand == 'B' && size == 18) {
            System.out.println("Bridgestone tyre price is 12");
            return 12;
        }

        if (brand == 'G' && size == 19) {
            System.out.println("Goodyear tyre price is 12");
            return 12;
        }

        else {
            System.out.println("Tyre not found");
            return -100;
        }
    }
}