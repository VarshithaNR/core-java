public class PowderRunner {
    public static void main(String[] args) {
        Powder p1 = new Powder();
        PowderRun run = new PowderRun();
        run.usePowder(p1);
        Powder p2 = null;
        run.usePowder(p2);
    }
}