class CoinRun {

    CoinRun() {
        System.out.println("no args constructor coin");
    }

    void useCoin(Coin c) {
        if (c != null) {
            c.show();
        } else {
            System.out.println("Coin is null");
        }
    }
}