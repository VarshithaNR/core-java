class Gloves {

    String brand;
    String type;
    String material;
    boolean isWaterproof;
    int size;
    double price;
    String color;
    String usage;
    double weight;
    boolean isReusable;

    Gloves(String brand, String type, String material, boolean isWaterproof,
           int size, double price, String color, String usage,
           double weight, boolean isReusable) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.isWaterproof = isWaterproof;
        this.size = size;
        this.price = price;
        this.color = color;
        this.usage = usage;
        this.weight = weight;
        this.isReusable = isReusable;
    }

    void display() {
        System.out.println(brand+" "+type+" "+material+" "+isWaterproof+" "+size+" "+price+" "+color+" "+usage+" "+weight+" "+isReusable);
    }
}
