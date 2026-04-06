public class MashaRunner {
    public static void main(String[] args) {
        Masha m1 = new Masha();
        MashaRun run = new MashaRun();
        run.useMasha(m1);
        Masha m2 = null;
        run.useMasha(m2);
    }
}