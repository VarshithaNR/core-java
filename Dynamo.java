class Dynamo {

    String[] dynamos = new String[5];
    int index = 0;

    void saveDynamo(String name) {
        if (name != null && index < dynamos.length) {
            dynamos[index] = name;
            System.out.println("Saved: " + dynamos[index]);
            index++;
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : dynamos) {
            if (name == temp) {
                System.out.println("Dynamo found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Dynamo not found");
    }
}
