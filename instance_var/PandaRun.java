class PandaRun {
    PandaRun() { System.out.println("panda"); }
    void usePanda(Panda p) {
        if (p != null) { p.show(); }
        else { System.out.println("Panda is null"); }
    }
}