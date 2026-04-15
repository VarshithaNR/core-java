class Silencers {

    String brand;
    String material;
    double weight;
    boolean isNoiseReduced;
    int durability;
    double price;
    String color;
    String type;
    double length;
    boolean isHeatResistant;

    Silencers(String brand, String material, double weight, boolean isNoiseReduced,
              int durability, double price, String color, String type,
              double length, boolean isHeatResistant) {

        this.brand = brand;
        this.material = material;
        this.weight = weight;
        this.isNoiseReduced = isNoiseReduced;
        this.durability = durability;
        this.price = price;
        this.color = color;
        this.type = type;
        this.length = length;
        this.isHeatResistant = isHeatResistant;
    }

    void display() {
        System.out.println(brand+" "+material+" "+weight+" "+isNoiseReduced+" "+durability+" "+price+" "+color+" "+type+" "+length+" "+isHeatResistant);
    }
}

