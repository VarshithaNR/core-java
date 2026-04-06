public class NetRunner {
    public static void main(String[] args) {
        Net n1 = new Net();
        NetRun run = new NetRun();
        run.useNet(n1);
        Net n2 = null;
        run.useNet(n2);
    }
}