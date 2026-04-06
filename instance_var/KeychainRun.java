class KeychainRun {
    KeychainRun() { System.out.println("keychain"); }
    void useKeychain(Keychain k) {
        if (k != null) { k.show(); }
        else { System.out.println("Keychain is null"); }
    }
}