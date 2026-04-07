class MonitorRunner {

    public static void main(String... values) {

        ComputerLab lab = new ComputerLab("AI Lab", 40);

        lab.monitor = new Monitor();       
        lab.type = MonitorType.LED;        

        lab.show();
    }
}