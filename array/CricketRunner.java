
class CricketRunner {
    public static void main(String... args){

        CricketStore cricketstore = new CricketStore();

        Crickets cricket1 = new Crickets("Virat","RCB",250,12000,true,52.5,"India",4,140.5,true);
        Crickets cricket2 = new Crickets("Rohit","MI",240,11000,true,48.2,"India",8,135.0,true);
        Crickets cricket3 = new Crickets("Dhoni","CSK",300,10000,true,50.0,"India",2,130.0,false);
        Crickets cricket4 = new Crickets("Smith","RR",200,9000,true,45.0,"Australia",5,125.0,true);
        Crickets cricket5 = new Crickets("Root","ENG",180,8500,true,49.5,"England",3,120.0,true);
        Crickets cricket6 = new Crickets("Kane","SRH",170,8000,true,47.0,"NZ",2,118.0,true);
        Crickets cricket7 = new Crickets("Warner","DC",210,9500,true,46.5,"Australia",1,140.0,true);
        Crickets cricket8 = new Crickets("Buttler","RR",160,7800,true,42.0,"England",0,150.0,true);
        Crickets cricket9 = new Crickets("Maxwell","RCB",190,8200,true,40.0,"Australia",6,160.0,true);
        Crickets cricket10 = new Crickets("Stokes","CSK",150,7000,true,38.5,"England",90,135.0,true);
        Crickets cricket11 = new Crickets("Pandya","GT",140,6500,true,36.0,"India",60,145.0,true);
        Crickets cricket12 = new Crickets("Rahul","LSG",130,6200,true,44.0,"India",2,130.0,true);
        Crickets cricket13 = new Crickets("Gill","GT",120,6000,true,46.0,"India",0,138.0,true);
        Crickets cricket14 = new Crickets("ABD","RCB",170,8500,true,50.5,"SA",0,155.0,false);
        Crickets cricket15 = new Crickets("Gayle","PBKS",200,10000,true,42.5,"WI",0,160.0,false);
        Crickets cricket16 = new Crickets("Pollard","MI",180,7200,true,30.0,"WI",70,150.0,false);
        Crickets cricket17 = new Crickets("Boult","MI",100,500,true,10.0,"NZ",150,120.0,true);
        Crickets cricket18 = new Crickets("Bumrah","MI",120,300,false,8.0,"India",200,110.0,true);
        Crickets cricket19 = new Crickets("Shami","GT",110,400,false,9.0,"India",180,115.0,true);
        Crickets cricket20 = new Crickets("Siraj","RCB",90,200,false,7.5,"India",160,118.0,true);

        cricketstore.save(cricket1);
        cricketstore.save(cricket2);
        cricketstore.save(cricket3);
        cricketstore.save(cricket4);
        cricketstore.save(cricket5);
        cricketstore.save(cricket6);
        cricketstore.save(cricket7);
        cricketstore.save(cricket8);
        cricketstore.save(cricket9);
        cricketstore.save(cricket10);
        cricketstore.save(cricket11);
        cricketstore.save(cricket12);
        cricketstore.save(cricket13);
        cricketstore.save(cricket14);
        cricketstore.save(cricket15);
        cricketstore.save(cricket16);
        cricketstore.save(cricket17);
        cricketstore.save(cricket18);
        cricketstore.save(cricket19);
        cricketstore.save(cricket20);

        cricketstore.display();
    }
}