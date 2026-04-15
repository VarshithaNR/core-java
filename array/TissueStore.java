
class TissueStore {

    Tissues[] tissues = new Tissues[20];
    int index = 0;

    void save(Tissues tissue) {
        if (index < this.tissues.length) {
            this.tissues[index] = tissue;
            index++;
            System.out.println("Tissue saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Tissues temp : this.tissues) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the tissue values");
        }
    }

    void update(Tissues oldName, Tissues newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < tissues.length; start++) {
                if (oldName == tissues[start]) {
                    tissues[start] = newName;
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
