class CarromRun {
    CarromRun() { System.out.println("carrom"); }
    void useCarrom(Carrom c) {
        if (c != null) { c.show(); }
        else { System.out.println("Carrom is null"); }
    }
}