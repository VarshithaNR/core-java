
class BiometricRunner {
    public static void main(String[] args) {
        Biometric b = new Biometric();
        b.saveDevice("Fingerprint");
        b.saveDevice("Iris");
        b.search("Fingerprint");
    }
}