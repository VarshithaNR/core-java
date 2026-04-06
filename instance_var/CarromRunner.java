public class CarromRunner {
    public static void main(String[] args) {
        Carrom c1 = new Carrom();
        CarromRun run = new CarromRun();
        run.useCarrom(c1);
        Carrom c2 = null;
        run.useCarrom(c2);
    }
}