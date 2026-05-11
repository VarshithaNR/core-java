class Cupp {

    String[] cups = new String[5];
    int index = 0;

    void saveCup(String cupName) {

        System.out.println("Cup is running in saveCup method");

        if (cupName != null) {

            System.out.println("cup is not null");

            if (this.index < this.cups.length) {

                this.cups[index] = cupName;
                System.out.println("cup name at index: " + this.cups[index]);
                System.out.println("index of cup: " + this.index);
                this.index++;
            } else {
                System.out.println("Memory is full " + this.cups.length);
            }

        } else {
            System.out.println("cup is null");
        }
    }

    void search(String cupName) {

        System.out.println("Cup is running in search method");

        if (cupName != null) {

            System.out.println("cup is not null");

            boolean found = false;

            for (String temp : this.cups) {

                if (cupName == temp) {

                    System.out.println("cup is found");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("cup not found");
            }

        } else {
            System.out.println("cup is null");
        }
    }
}
