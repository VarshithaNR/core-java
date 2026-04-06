class WaterRun {
    WaterRun() { System.out.println("water"); }
    void useWater(Water w) {
        if (w != null) { w.show(); }
        else { System.out.println("Water is null"); }
    }
}