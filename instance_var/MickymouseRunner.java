public class MickymouseRunner {
    public static void main(String[] args) {
        Mickymouse m1 = new Mickymouse();
        MickymouseRun run = new MickymouseRun();
        run.useMickymouse(m1);
        Mickymouse m2 = null;
        run.useMickymouse(m2);
    }
}