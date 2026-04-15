class Tissues {

    String brand;
    String type;
    int quantity;
    boolean isSoft;
    double price;
    String color;
    String fragrance;
    int layers;
    double weight;
    boolean isReusable;

    Tissues(String brand, String type, int quantity, boolean isSoft,
            double price, String color, String fragrance,
            int layers, double weight, boolean isReusable) {

        this.brand = brand;
        this.type = type;
        this.quantity = quantity;
        this.isSoft = isSoft;
        this.price = price;
        this.color = color;
        this.fragrance = fragrance;
        this.layers = layers;
        this.weight = weight;
        this.isReusable = isReusable;
    }

    void display() {
        System.out.println(brand+" "+type+" "+quantity+" "+isSoft+" "+price+" "+color+" "+fragrance+" "+layers+" "+weight+" "+isReusable);
    }
}
