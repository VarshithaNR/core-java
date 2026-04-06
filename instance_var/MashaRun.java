class MashaRun {
    MashaRun() { System.out.println("masha"); }
    void useMasha(Masha m) {
        if (m != null) { m.show(); }
        else { System.out.println("Masha is null"); }
    }
}