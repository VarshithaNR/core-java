
class SpaceShipRunner {
    public static void main(String... args){

        SpaceShipStore spaceshipstore = new SpaceShipStore();

        SpaceShips spaceShip1 = new SpaceShips("Apollo","NASA",25000,true,3,5000000,"Liquid","Moon",3000,true);
        SpaceShips spaceShip2 = new SpaceShips("Falcon","SpaceX",27000,true,7,6000000,"Hybrid","Mars",3500,true);
        SpaceShips spaceShip3 = new SpaceShips("Soyuz","Roscosmos",24000,false,3,4000000,"Liquid","ISS",2800,true);
        SpaceShips spaceShip4 = new SpaceShips("Shenzhou","CNSA",23000,false,3,4200000,"Liquid","ISS",2900,true);
        SpaceShips spaceShip5 = new SpaceShips("Starship","SpaceX",30000,true,10,8000000,"Methane","Mars",5000,true);
        SpaceShips spaceShip6 = new SpaceShips("NewShepard","BlueOrigin",20000,true,6,3000000,"Hydrogen","Suborbital",2500,true);
        SpaceShips spaceShip7 = new SpaceShips("Vostok","USSR",22000,false,1,2000000,"Liquid","Orbit",2000,true);
        SpaceShips spaceShip8 = new SpaceShips("Gemini","NASA",24000,false,2,3500000,"Liquid","Orbit",2700,true);
        SpaceShips spaceShip9 = new SpaceShips("Orion","NASA",26000,true,4,5500000,"Liquid","Moon",3200,true);
        SpaceShips spaceShip10 = new SpaceShips("Dragon","SpaceX",25500,true,7,5800000,"Hybrid","ISS",3300,true);
        SpaceShips spaceShip11 = new SpaceShips("Buran","USSR",25000,true,5,6000000,"Liquid","Orbit",3400,false);
        SpaceShips spaceShip12 = new SpaceShips("Columbia","NASA",24500,true,7,6200000,"Solid","Orbit",3600,true);
        SpaceShips spaceShip13 = new SpaceShips("Challenger","NASA",24800,true,7,6100000,"Solid","Orbit",3550,true);
        SpaceShips spaceShip14 = new SpaceShips("Discovery","NASA",24900,true,7,6300000,"Solid","Orbit",3650,true);
        SpaceShips spaceShip15 = new SpaceShips("Atlantis","NASA",24700,true,7,6400000,"Solid","Orbit",3700,true);
        SpaceShips spaceShip16 = new SpaceShips("Endeavour","NASA",24600,true,7,6500000,"Solid","Orbit",3750,true);
        SpaceShips spaceShip17 = new SpaceShips("Tianzhou","CNSA",23000,false,0,3000000,"Liquid","ISS",2800,false);
        SpaceShips spaceShip18 = new SpaceShips("Progress","Roscosmos",22500,false,0,2800000,"Liquid","ISS",2700,false);
        SpaceShips spaceShip19 = new SpaceShips("DreamChaser","Sierra",26000,true,6,7000000,"Hybrid","ISS",3100,true);
        SpaceShips spaceShip20 = new SpaceShips("Starliner","Boeing",25500,true,5,7200000,"Liquid","ISS",3200,true);

        spaceshipstore.save(spaceShip1);
        spaceshipstore.save(spaceShip2);
        spaceshipstore.save(spaceShip3);
        spaceshipstore.save(spaceShip4);
        spaceshipstore.save(spaceShip5);
        spaceshipstore.save(spaceShip6);
        spaceshipstore.save(spaceShip7);
        spaceshipstore.save(spaceShip8);
        spaceshipstore.save(spaceShip9);
        spaceshipstore.save(spaceShip10);
        spaceshipstore.save(spaceShip11);
        spaceshipstore.save(spaceShip12);
        spaceshipstore.save(spaceShip13);
        spaceshipstore.save(spaceShip14);
        spaceshipstore.save(spaceShip15);
        spaceshipstore.save(spaceShip16);
        spaceshipstore.save(spaceShip17);
        spaceshipstore.save(spaceShip18);
        spaceshipstore.save(spaceShip19);
        spaceshipstore.save(spaceShip20);

        spaceshipstore.display();
    }
}