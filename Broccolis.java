class Broccolis {

    String color;
    double weight;
    String type;
    boolean isFresh;
    int quantity;
    double price;
    String origin;
    String taste;
    double size;
    boolean isOrganic;

    Broccolis(String color, double weight, String type, boolean isFresh,
              int quantity, double price, String origin,
              String taste, double size, boolean isOrganic) {

        this.color = color;
        this.weight = weight;
        this.type = type;
        this.isFresh = isFresh;
        this.quantity = quantity;
        this.price = price;
        this.origin = origin;
        this.taste = taste;
        this.size = size;
        this.isOrganic = isOrganic;
    }

    void display() {
        System.out.println(color+" "+weight+" "+type+" "+isFresh+" "+quantity+" "+price+" "+origin+" "+taste+" "+size+" "+isOrganic);
    }
}
