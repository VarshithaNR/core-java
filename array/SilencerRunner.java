
class SilencerRunner {
    public static void main(String... args){

        SilencerStore silencerstore = new SilencerStore();

        Silencers silencer1 = new Silencers("Bosch","Steel",2.5,true,5,1200,"Black","Bike",30.5,true);
        Silencers silencer2 = new Silencers("Honda","Alloy",3.0,true,6,1500,"Silver","Car",32.0,true);
        Silencers silencer3 = new Silencers("Yamaha","Steel",2.2,true,4,1000,"Black","Bike",28.5,true);
        Silencers silencer4 = new Silencers("Suzuki","Iron",3.5,false,7,1800,"Gray","Car",35.0,true);
        Silencers silencer5 = new Silencers("TVS","Steel",2.8,true,5,1100,"Black","Bike",29.0,false);
        Silencers silencer6 = new Silencers("KTM","Alloy",3.2,true,6,1700,"Orange","Bike",34.0,true);
        Silencers silencer7 = new Silencers("Bajaj","Steel",2.0,false,4,900,"Black","Bike",25.0,false);
        Silencers silencer8 = new Silencers("Hero","Iron",2.7,true,5,1400,"Black","Bike",31.0,true);
        Silencers silencer9 = new Silencers("RoyalEnfield","Steel",3.5,true,7,2000,"Black","Bike",33.0,true);
        Silencers silencer10 = new Silencers("Mahindra","Alloy",3.8,false,8,2200,"Silver","Car",36.0,true);
        Silencers silencer11 = new Silencers("Ford","Steel",2.4,true,5,950,"Gray","Car",27.5,false);
        Silencers silencer12 = new Silencers("Hyundai","Iron",2.9,true,6,1300,"Black","Car",30.0,true);
        Silencers silencer13 = new Silencers("Toyota","Steel",3.1,true,6,1550,"Black","Car",32.5,true);
        Silencers silencer14 = new Silencers("Nissan","Alloy",3.6,false,7,2100,"Silver","Car",37.0,true);
        Silencers silencer15 = new Silencers("Chevrolet","Iron",2.1,false,4,850,"Gray","Car",24.0,false);
        Silencers silencer16 = new Silencers("Jeep","Steel",2.6,true,5,1250,"Black","Car",29.5,true);
        Silencers silencer17 = new Silencers("Audi","Alloy",3.7,true,7,2500,"Silver","Car",34.0,true);
        Silencers silencer18 = new Silencers("BMW","Steel",3.9,false,8,2700,"Black","Car",38.0,true);
        Silencers silencer19 = new Silencers("Mercedes","Alloy",2.3,true,5,920,"Gray","Car",26.5,false);
        Silencers silencer20 = new Silencers("Volkswagen","Steel",2.8,true,6,1350,"Black","Car",31.5,true);

        silencerstore.save(silencer1);
        silencerstore.save(silencer2);
        silencerstore.save(silencer3);
        silencerstore.save(silencer4);
        silencerstore.save(silencer5);
        silencerstore.save(silencer6);
        silencerstore.save(silencer7);
        silencerstore.save(silencer8);
        silencerstore.save(silencer9);
        silencerstore.save(silencer10);
        silencerstore.save(silencer11);
        silencerstore.save(silencer12);
        silencerstore.save(silencer13);
        silencerstore.save(silencer14);
        silencerstore.save(silencer15);
        silencerstore.save(silencer16);
        silencerstore.save(silencer17);
        silencerstore.save(silencer18);
        silencerstore.save(silencer19);
        silencerstore.save(silencer20);

        silencerstore.display();
    }
}