public class RotaterRunner {
    public static void main(String[] args) {
        Rotater r1 = new Rotater();
        RotaterRun run = new RotaterRun();
        run.useRotater(r1);
        Rotater r2 = null;
        run.useRotater(r2);
    }
}