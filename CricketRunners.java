
class CricketStore {

    Crickets[] crickets = new Crickets[20];
    int index = 0;

    void save(Crickets cricket) {
        if (index < this.crickets.length) {
            this.crickets[index] = cricket;
            index++;
            System.out.println("Cricket saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Crickets temp : this.crickets) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the cricket values");
        }
    }

    void update(Crickets oldName, Crickets newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < crickets.length; start++) {
                if (oldName == crickets[start]) {
                    crickets[start] = newName;
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
