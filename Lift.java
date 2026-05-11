class Lift {

    String[] lifts = new String[5];
    int index = 0;

    void saveLift(String name) {
        if (name != null && index < lifts.length) {
            lifts[index] = name;
            System.out.println("Saved: " + lifts[index]);
            index++;
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : lifts) {
            if (name == temp) {
                System.out.println("Lift found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Lift not found");
    }
}
