public class CoinRun{
	CoinRun(){
		System.out.println("no args constructor coin");
	}
	void useCoin(Coin c) {.
        if (c != null) {
            c.display();
        } else {
            System.out.println("Coin is null");
        }
    }
}