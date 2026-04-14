class SparkPlug {

    String[] plugs = new String[5];
    int index = 0;

    void savePlug(String name) {
        if (name != null && index < plugs.length) {
            plugs[index] = name;
            System.out.println("Saved: " + plugs[index]);
            index++;
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : plugs) {
            if (name == temp) {
                System.out.println("SparkPlug found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("SparkPlug not found");
    }
}
