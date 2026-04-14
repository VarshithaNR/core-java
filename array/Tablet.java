class Tablet {

    String[] tablets = new String[5];
    int index = 0;

    void saveTablet(String name) {
        if (name != null) {
            if (index < tablets.length) {
                tablets[index] = name;
                System.out.println("Saved: " + tablets[index]);
                index++;
            } else {
                System.out.println("Memory full");
            }
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : tablets) {
            if (name == temp) {
                System.out.println("Tablet found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Tablet not found");
    }
}
