class Aeroplane {

    String[] planes = new String[5];
    int index = 0;

    void savePlane(String name) {
        if (name != null && index < planes.length) {
            planes[index] = name;
            System.out.println("Saved: " + planes[index]);
            index++;
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : planes) {
            if (name == temp) {
                System.out.println("Plane found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Plane not found");
    }
}
