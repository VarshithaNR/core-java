class Alloy {

    String[] alloys = new String[5];
    int index = 0;

    void saveAlloy(String name) {
        if (name != null && index < alloys.length) {
            alloys[index] = name;
            System.out.println("Saved: " + alloys[index]);
            index++;
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : alloys) {
            if (name == temp) {
                System.out.println("Alloy found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Alloy not found");
    }
}
