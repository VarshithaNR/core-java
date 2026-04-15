
class GloveStore {

    Gloves[] gloves = new Gloves[20];
    int index = 0;

    void save(Gloves glove) {
        if (index < this.gloves.length) {
            this.gloves[index] = glove;
            index++;
            System.out.println("Glove saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Gloves temp : this.gloves) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the glove values");
        }
    }

    void update(Gloves oldName, Gloves newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < gloves.length; start++) {
                if (oldName == gloves[start]) {
                    gloves[start] = newName;
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
