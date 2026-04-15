class ScreenStore {

    Screens[] screens = new Screens[20];
    int index = 0;

    void save(Screens screen) {
        if (index < this.screens.length) {
            this.screens[index] = screen;
            index++;
            System.out.println("Screen saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Screens temp : this.screens) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the screen values");
        }
    }

    void update(Screens oldName, Screens newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < screens.length; start++) {
                if (oldName == screens[start]) {
                    screens[start] = newName;
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