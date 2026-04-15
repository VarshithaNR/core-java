class Screen {

    String type;
    double size;
    String resolution;
    boolean isTouch;
    int refreshRate;
    double price;
    String brand;
    String color;
    double weight;
    boolean isSmart;

    Screen(String type, double size, String resolution, boolean isTouch,
           int refreshRate, double price, String brand, String color,
           double weight, boolean isSmart) {

        this.type = type;
        this.size = size;
        this.resolution = resolution;
        this.isTouch = isTouch;
        this.refreshRate = refreshRate;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.weight = weight;
        this.isSmart = isSmart;
    }

    void display() {
        System.out.println(type+" "+size+" "+resolution+" "+isTouch+" "+refreshRate+" "+price+" "+brand+" "+color+" "+weight+" "+isSmart);
    }
}
