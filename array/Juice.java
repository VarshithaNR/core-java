class Juice {

    String[] juices = new String[5];
    int index = 0;

    void saveJuice(String name) {
        if (name != null && index < juices.length) {
            juices[index] = name;
            System.out.println("Saved: " + juices[index]);
            index++;
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : juices) {
            if (name == temp) {
                System.out.println("Juice found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Juice not found");
    }
}
