class NetRun {
    NetRun() { System.out.println("net"); }
    void useNet(Net n) {
        if (n != null) { n.show(); }
        else { System.out.println("Net is null"); }
    }
}