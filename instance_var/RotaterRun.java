class RotaterRun {
    RotaterRun() { System.out.println("rotater"); }
    void useRotater(Rotater r) {
        if (r != null) { r.show(); }
        else { System.out.println("Rotater is null"); }
    }
}