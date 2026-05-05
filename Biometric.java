class Biometric {

    String[] devices = new String[5];
    int index = 0;

    void saveDevice(String name) {
        if (name != null) {
            if (index < devices.length) {
                devices[index] = name;
                System.out.println("Saved: " + devices[index]);
                index++;
            }
        }
    }

    void search(String name) {
        boolean found = false;
        for (String temp : devices) {
            if (name == temp) {
                System.out.println("Device found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Device not found");
    }
}
