
class WaterMelonStore {

    WaterMelons[] watermelons = new WaterMelons[20];
    int index = 0;

    void save(WaterMelons waterMelons) {
        if (index < this.watermelons.length) {
            this.watermelons[index] = waterMelons;
            index++;
            System.out.println("WaterMelon saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (WaterMelons temp : this.watermelons) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the watermelon values");
        }
    }

    void update(WaterMelons oldName, WaterMelons newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < watermelons.length; start++) {
                if (oldName == watermelons[start]) {
                    watermelons[start] = newName;
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
