
class BroccoliStore {

    Broccolis[] broccolis = new Broccolis[20];
    int index = 0;

    void save(Broccolis broccoli) {
        if (index < this.broccolis.length) {
            this.broccolis[index] = broccoli;
            index++;
            System.out.println("Broccoli saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Broccolis temp : this.broccolis) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the broccoli values");
        }
    }

    void update(Broccolis oldName, Broccolis newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < broccolis.length; start++) {
                if (oldName == broccolis[start]) {
                    broccolis[start] = newName;
                    updated = true;
                    System.out.println("Updated successfully");
                }
            }

            if (!updated) {
                System.out.println("Old object not found");
            }
        } else {
            System.out.println("Old or new object cannot be null");
        }
    }
}
