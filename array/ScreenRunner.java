
class ScreenRunner {
    public static void main(String... args){

        ScreenStore screenstore = new ScreenStore();

        Screens screen1 = new Screens("Samsung",55,"LED",true,1080,50000,"Black","OLED",12.5,true);
        Screens screen2 = new Screens("LG",65,"LED",true,2160,70000,"Black","OLED",15.0,true);
        Screens screen3 = new Screens("Sony",50,"LCD",false,1080,45000,"Black","LCD",11.0,false);
        Screens screen4 = new Screens("Panasonic",43,"LED",false,720,30000,"Black","LED",9.5,false);
        Screens screen5 = new Screens("TCL",75,"QLED",true,2160,90000,"Black","QLED",18.0,true);
        Screens screen6 = new Screens("Mi",55,"LED",true,1080,40000,"Black","LED",13.0,true);
        Screens screen7 = new Screens("OnePlus",65,"QLED",true,2160,80000,"Black","QLED",16.0,true);
        Screens screen8 = new Screens("Vu",50,"LED",false,1080,35000,"Black","LED",10.5,false);
        Screens screen9 = new Screens("Philips",43,"LCD",false,720,28000,"Black","LCD",9.0,false);
        Screens screen10 = new Screens("Realme",55,"LED",true,1080,42000,"Black","LED",12.8,true);
        Screens screen11 = new Screens("Samsung",65,"QLED",true,2160,95000,"Black","QLED",17.5,true);
        Screens screen12 = new Screens("LG",50,"LED",false,1080,48000,"Black","LED",11.5,false);
        Screens screen13 = new Screens("Sony",75,"OLED",true,2160,120000,"Black","OLED",19.0,true);
        Screens screen14 = new Screens("Panasonic",55,"LED",true,1080,52000,"Black","LED",13.5,true);
        Screens screen15 = new Screens("TCL",43,"LED",false,720,27000,"Black","LED",8.5,false);
        Screens screen16 = new Screens("Mi",65,"QLED",true,2160,85000,"Black","QLED",16.5,true);
        Screens screen17 = new Screens("OnePlus",55,"LED",true,1080,60000,"Black","LED",14.0,true);
        Screens screen18 = new Screens("Vu",75,"QLED",true,2160,95000,"Black","QLED",18.5,true);
        Screens screen19 = new Screens("Philips",50,"LCD",false,1080,36000,"Black","LCD",10.8,false);
        Screens screen20 = new Screens("Realme",43,"LED",false,720,29000,"Black","LED",9.2,false);

        screenstore.save(screen1);
        screenstore.save(screen2);
        screenstore.save(screen3);
        screenstore.save(screen4);
        screenstore.save(screen5);
        screenstore.save(screen6);
        screenstore.save(screen7);
        screenstore.save(screen8);
        screenstore.save(screen9);
        screenstore.save(screen10);
        screenstore.save(screen11);
        screenstore.save(screen12);
        screenstore.save(screen13);
        screenstore.save(screen14);
        screenstore.save(screen15);
        screenstore.save(screen16);
        screenstore.save(screen17);
        screenstore.save(screen18);
        screenstore.save(screen19);
        screenstore.save(screen20);

        screenstore.display();
    }
}