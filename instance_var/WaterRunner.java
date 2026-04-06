public class WaterRunner {
    public static void main(String[] args) {
        Water w1 = new Water();
        WaterRun run = new WaterRun();
        run.useWater(w1);
        Water w2 = null;
        run.useWater(w2);
    }
}