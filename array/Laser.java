class Lasers {

    String brand;
    String type;
    double power;
    boolean isPortable;
    int wavelength;
    double price;
    String color;
    String application;
    double weight;
    boolean isRechargeable;

    Lasers(String brand, String type, double power, boolean isPortable,
           int wavelength, double price, String color, String application,
           double weight, boolean isRechargeable) {

        this.brand = brand;
        this.type = type;
        this.power = power;
        this.isPortable = isPortable;
        this.wavelength = wavelength;
        this.price = price;
        this.color = color;
        this.application = application;
        this.weight = weight;
        this.isRechargeable = isRechargeable;
    }

    void display() {
        System.out.println(brand+" "+type+" "+power+" "+isPortable+" "+wavelength+" "+price+" "+color+" "+application+" "+weight+" "+isRechargeable);
    }
}

