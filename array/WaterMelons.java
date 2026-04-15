class WaterMelons {

    String color;
    double weight;
    String shape;
    boolean isSweet;
    int seeds;
    double price;
    String taste;
    String origin;
    double size;
    boolean isFresh;

    WaterMelons(String color, double weight, String shape, boolean isSweet,
                int seeds, double price, String taste, String origin,
                double size, boolean isFresh) {

        this.color = color;
        this.weight = weight;
        this.shape = shape;
        this.isSweet = isSweet;
        this.seeds = seeds;
        this.price = price;
        this.taste = taste;
        this.origin = origin;
        this.size = size;
        this.isFresh = isFresh;
    }

    void display() {
        System.out.println(color+" "+weight+" "+shape+" "+isSweet+" "+seeds+" "+price+" "+taste+" "+origin+" "+size+" "+isFresh);
    }
}
