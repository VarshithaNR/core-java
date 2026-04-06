public class PandaRunner {
    public static void main(String[] args) {
        Panda p1 = new Panda();
        PandaRun run = new PandaRun();
        run.usePanda(p1);
        Panda p2 = null;
        run.usePanda(p2);
    }
}