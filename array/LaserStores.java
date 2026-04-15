
class LaserStore {

    Lasers[] lasers = new Lasers[20];
    int index = 0;

    void save(Lasers laser) {
        if (index < this.lasers.length) {
            this.lasers[index] = laser;
            index++;
            System.out.println("Laser saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Lasers temp : this.lasers) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the laser values");
        }
    }

    void update(Lasers oldName, Lasers newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < lasers.length; start++) {
                if (oldName == lasers[start]) {
                    lasers[start] = newName;
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
