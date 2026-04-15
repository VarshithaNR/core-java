
class LaserRunner {
    public static void main(String... args){

        LaserStore laserstore = new LaserStore();

        Lasers laser1 = new Lasers("Bosch","Pointer",5.5,true,650,1200,"Red","Presentation",0.5,true);
        Lasers laser2 = new Lasers("Philips","Industrial",10.0,false,800,5000,"Blue","Cutting",1.5,false);
        Lasers laser3 = new Lasers("Sony","Medical",7.5,false,700,8000,"Green","Surgery",1.2,false);
        Lasers laser4 = new Lasers("Panasonic","Pointer",4.0,true,650,1000,"Red","Presentation",0.4,true);
        Lasers laser5 = new Lasers("LG","Industrial",12.0,false,900,9000,"Blue","Welding",2.0,false);
        Lasers laser6 = new Lasers("Samsung","Medical",6.5,false,720,7500,"Green","Therapy",1.1,false);
        Lasers laser7 = new Lasers("Mi","Pointer",3.5,true,650,800,"Red","Teaching",0.3,true);
        Lasers laser8 = new Lasers("OnePlus","Industrial",11.0,false,850,8500,"Blue","Cutting",1.8,false);
        Lasers laser9 = new Lasers("Realme","Medical",8.0,false,710,7800,"Green","Surgery",1.3,false);
        Lasers laser10 = new Lasers("TCL","Pointer",4.5,true,650,950,"Red","Presentation",0.4,true);
        Lasers laser11 = new Lasers("Bosch","Industrial",13.0,false,920,9500,"Blue","Welding",2.2,false);
        Lasers laser12 = new Lasers("Philips","Medical",7.8,false,705,8200,"Green","Therapy",1.2,false);
        Lasers laser13 = new Lasers("Sony","Pointer",5.0,true,650,1100,"Red","Teaching",0.5,true);
        Lasers laser14 = new Lasers("Panasonic","Industrial",14.0,false,940,10000,"Blue","Cutting",2.3,false);
        Lasers laser15 = new Lasers("LG","Medical",6.8,false,730,7600,"Green","Surgery",1.1,false);
        Lasers laser16 = new Lasers("Samsung","Pointer",3.8,true,650,850,"Red","Presentation",0.3,true);
        Lasers laser17 = new Lasers("Mi","Industrial",12.5,false,910,9200,"Blue","Welding",2.1,false);
        Lasers laser18 = new Lasers("OnePlus","Medical",8.5,false,715,8000,"Green","Therapy",1.4,false);
        Lasers laser19 = new Lasers("Realme","Pointer",4.2,true,650,900,"Red","Teaching",0.4,true);
        Lasers laser20 = new Lasers("TCL","Industrial",13.5,false,930,9700,"Blue","Cutting",2.2,false);

        laserstore.save(laser1);
        laserstore.save(laser2);
        laserstore.save(laser3);
        laserstore.save(laser4);
        laserstore.save(laser5);
        laserstore.save(laser6);
        laserstore.save(laser7);
        laserstore.save(laser8);
        laserstore.save(laser9);
        laserstore.save(laser10);
        laserstore.save(laser11);
        laserstore.save(laser12);
        laserstore.save(laser13);
        laserstore.save(laser14);
        laserstore.save(laser15);
        laserstore.save(laser16);
        laserstore.save(laser17);
        laserstore.save(laser18);
        laserstore.save(laser19);
        laserstore.save(laser20);

        laserstore.display();
    }
}