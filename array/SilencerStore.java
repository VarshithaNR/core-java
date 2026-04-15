
class SilencerStore {

    Silencers[] silencers = new Silencers[20];
    int index = 0;

    void save(Silencers silencer) {
        if (index < this.silencers.length) {
            this.silencers[index] = silencer;
            index++;
            System.out.println("Silencer saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Silencers temp : this.silencers) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the silencer values");
        }
    }

    void update(Silencers oldName, Silencers newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < silencers.length; start++) {
                if (oldName == silencers[start]) {
                    silencers[start] = newName;
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
