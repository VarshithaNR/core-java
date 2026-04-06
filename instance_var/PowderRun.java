class PowderRun {
    PowderRun() { System.out.println("powder"); }
    void usePowder(Powder p) {
        if (p != null) { p.show(); }
        else { System.out.println("Powder is null"); }
    }
}