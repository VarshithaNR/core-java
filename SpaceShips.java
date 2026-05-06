class SpaceShips {

    String name;
    String agency;
    double speed;
    boolean isReusable;
    int capacity;
    double price;
    String fuelType;
    String destination;
    double weight;
    boolean isManned;

    SpaceShips(String name, String agency, double speed, boolean isReusable,
               int capacity, double price, String fuelType,
               String destination, double weight, boolean isManned) {

        this.name = name;
        this.agency = agency;
        this.speed = speed;
        this.isReusable = isReusable;
        this.capacity = capacity;
        this.price = price;
        this.fuelType = fuelType;
        this.destination = destination;
        this.weight = weight;
        this.isManned = isManned;
    }

    void display() {
        System.out.println(name+" "+agency+" "+speed+" "+isReusable+" "+capacity+" "+price+" "+fuelType+" "+destination+" "+weight+" "+isManned);
    }
}
