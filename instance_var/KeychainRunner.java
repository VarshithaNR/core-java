public class KeychainRunner {
    public static void main(String[] args) {
        Keychain k1 = new Keychain();
        KeychainRun run = new KeychainRun();
        run.useKeychain(k1);
        Keychain k2 = null;
        run.useKeychain(k2);
    }
}