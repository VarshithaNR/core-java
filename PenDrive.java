class PenDrive {

    static int getSize(char brand) {

        if (brand == 'S') {
            System.out.println("Sandisk size is 5GB");
            return 5;
        }

        if (brand == 'K') {
            System.out.println("Kingston size is 5GB");
            return 5;
        }

        if (brand == 'H') {
            System.out.println("HP size is 5GB");
            return 5;
        }

        if (brand == 'T') {
            System.out.println("Transcend size is 5GB");
            return 5;
        }

        if (brand == 'D') {
            System.out.println("Dell size is 5GB");
            return 5;
        }

        else {
            System.out.println("Brand not found");
            return -100;
        }
    }
}