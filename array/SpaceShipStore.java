

class SpaceShipStore {

    SpaceShips[] spaceShips = new SpaceShips[20];
    int index = 0;

    void save(SpaceShips spaceShip) {
        if (index < this.spaceShips.length) {
            this.spaceShips[index] = spaceShip;
            index++;
            System.out.println("SpaceShip saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (SpaceShips temp : this.spaceShips) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the spaceship values");
        }
    }

    void update(SpaceShips oldName, SpaceShips newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < spaceShips.length; start++) {
                if (oldName == spaceShips[start]) {
                    spaceShips[start] = newName;
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
