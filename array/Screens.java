class Screens {

    String brand;
    double size;
    String type;
    boolean isTouch;
    int resolution;
    double price;
    String color;
    String technology;
    double weight;
    boolean isSmart;

    Screens(String brand, double size, String type, boolean isTouch,
            int resolution, double price, String color, String technology,
            double weight, boolean isSmart) {

        this.brand = brand;
        this.size = size;
        this.type = type;
        this.isTouch = isTouch;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
        this.technology = technology;
        this.weight = weight;
        this.isSmart = isSmart;
    }

    void display() {
        System.out.println(brand+" "+size+" "+type+" "+isTouch+" "+resolution+" "+price+" "+color+" "+technology+" "+weight+" "+isSmart);
    }
}
