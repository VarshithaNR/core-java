class MickymouseRun {
    MickymouseRun() { System.out.println("mickymouse"); }
    void useMickymouse(Mickymouse m) {
        if (m != null) { m.show(); }
        else { System.out.println("Mickymouse is null"); }
    }
}