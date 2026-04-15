class WaterMelonRunner {
    public static void main(String... args){

        WaterMelonStore watermelonstore = new WaterMelonStore();

        WaterMelons watermelon1 = new WaterMelons("Green",5.5,"Round",true,0,120,"Sweet","India",30.5,true);
        WaterMelons watermelon2 = new WaterMelons("Dark Green",6.2,"Oval",false,120,150,"Very Sweet","India",32.0,true);
        WaterMelons watermelon3 = new WaterMelons("Light Green",4.8,"Round",true,0,100,"Sweet","Brazil",28.5,true);
        WaterMelons watermelon4 = new WaterMelons("Green Striped",7.0,"Oval",false,200,180,"Juicy","USA",35.0,true);
        WaterMelons watermelon5 = new WaterMelons("Yellow Green",5.0,"Round",true,0,110,"Mild Sweet","India",29.0,false);
        WaterMelons watermelon6 = new WaterMelons("Dark Green",6.8,"Oval",false,150,170,"Sweet","Mexico",34.0,true);
        WaterMelons watermelon7 = new WaterMelons("Light Green",3.9,"Round",true,0,90,"Less Sweet","India",25.0,false);
        WaterMelons watermelon8 = new WaterMelons("Green",5.7,"Oval",false,180,140,"Juicy","Spain",31.0,true);
        WaterMelons watermelon9 = new WaterMelons("Striped Green",6.5,"Round",true,0,160,"Very Sweet","Australia",33.0,true);
        WaterMelons watermelon10 = new WaterMelons("Dark Green",7.2,"Oval",false,220,200,"Sweet","USA",36.0,true);
        WaterMelons watermelon11 = new WaterMelons("Light Green",4.5,"Round",true,0,95,"Sweet","India",27.5,false);
        WaterMelons watermelon12 = new WaterMelons("Green",5.9,"Oval",false,140,130,"Juicy","Brazil",30.0,true);
        WaterMelons watermelon13 = new WaterMelons("Striped Green",6.1,"Round",true,0,155,"Very Sweet","Mexico",32.5,true);
        WaterMelons watermelon14 = new WaterMelons("Dark Green",7.5,"Oval",false,250,210,"Sweet","Spain",37.0,true);
        WaterMelons watermelon15 = new WaterMelons("Light Green",3.5,"Round",true,0,85,"Less Sweet","India",24.0,false);
        WaterMelons watermelon16 = new WaterMelons("Green",5.2,"Oval",false,160,125,"Juicy","Australia",29.5,true);
        WaterMelons watermelon17 = new WaterMelons("Striped Green",6.7,"Round",true,0,165,"Very Sweet","USA",34.0,true);
        WaterMelons watermelon18 = new WaterMelons("Dark Green",7.8,"Oval",false,300,220,"Sweet","Mexico",38.0,true);
        WaterMelons watermelon19 = new WaterMelons("Light Green",4.2,"Round",true,0,92,"Sweet","India",26.5,false);
        WaterMelons watermelon20 = new WaterMelons("Green",5.8,"Oval",false,170,135,"Juicy","Brazil",31.5,true);

        watermelonstore.save(watermelon1);
        watermelonstore.save(watermelon2);
        watermelonstore.save(watermelon3);
        watermelonstore.save(watermelon4);
        watermelonstore.save(watermelon5);
        watermelonstore.save(watermelon6);
        watermelonstore.save(watermelon7);
        watermelonstore.save(watermelon8);
        watermelonstore.save(watermelon9);
        watermelonstore.save(watermelon10);
        watermelonstore.save(watermelon11);
        watermelonstore.save(watermelon12);
        watermelonstore.save(watermelon13);
        watermelonstore.save(watermelon14);
        watermelonstore.save(watermelon15);
        watermelonstore.save(watermelon16);
        watermelonstore.save(watermelon17);
        watermelonstore.save(watermelon18);
        watermelonstore.save(watermelon19);
        watermelonstore.save(watermelon20);

        watermelonstore.display();
    }
}