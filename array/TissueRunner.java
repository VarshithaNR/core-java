
class TissueRunner {
    public static void main(String... args){

        TissueStore tissuestore = new TissueStore();

        Tissues tissue1 = new Tissues("Puffs","Box",100,true,120,"White","Aloe",3,0.5,false);
        Tissues tissue2 = new Tissues("Kleenex","Pocket",50,true,80,"White","None",2,0.3,false);
        Tissues tissue3 = new Tissues("Origami","Roll",200,true,150,"White","Rose",3,0.8,false);
        Tissues tissue4 = new Tissues("Bella","Box",120,true,110,"White","Lavender",3,0.6,false);
        Tissues tissue5 = new Tissues("Softy","Pocket",60,true,70,"White","None",2,0.2,false);
        Tissues tissue6 = new Tissues("Premier","Roll",180,true,140,"White","Aloe",3,0.7,false);
        Tissues tissue7 = new Tissues("Velvet","Box",130,true,115,"White","Rose",3,0.6,false);
        Tissues tissue8 = new Tissues("Fresh","Pocket",55,true,75,"White","Mint",2,0.3,false);
        Tissues tissue9 = new Tissues("CleanX","Roll",210,true,160,"White","None",3,0.9,false);
        Tissues tissue10 = new Tissues("SoftTouch","Box",140,true,125,"White","Lavender",3,0.7,false);
        Tissues tissue11 = new Tissues("Puffs","Pocket",65,true,85,"White","Aloe",2,0.3,false);
        Tissues tissue12 = new Tissues("Kleenex","Roll",190,true,145,"White","None",3,0.8,false);
        Tissues tissue13 = new Tissues("Origami","Box",150,true,130,"White","Rose",3,0.7,false);
        Tissues tissue14 = new Tissues("Bella","Pocket",70,true,90,"White","Lavender",2,0.4,false);
        Tissues tissue15 = new Tissues("Softy","Roll",170,true,135,"White","None",3,0.8,false);
        Tissues tissue16 = new Tissues("Premier","Box",160,true,140,"White","Aloe",3,0.7,false);
        Tissues tissue17 = new Tissues("Velvet","Pocket",75,true,95,"White","Rose",2,0.4,false);
        Tissues tissue18 = new Tissues("Fresh","Roll",220,true,170,"White","Mint",3,1.0,false);
        Tissues tissue19 = new Tissues("CleanX","Box",155,true,135,"White","None",3,0.7,false);
        Tissues tissue20 = new Tissues("SoftTouch","Pocket",80,true,100,"White","Lavender",2,0.5,false);

        tissuestore.save(tissue1);
        tissuestore.save(tissue2);
        tissuestore.save(tissue3);
        tissuestore.save(tissue4);
        tissuestore.save(tissue5);
        tissuestore.save(tissue6);
        tissuestore.save(tissue7);
        tissuestore.save(tissue8);
        tissuestore.save(tissue9);
        tissuestore.save(tissue10);
        tissuestore.save(tissue11);
        tissuestore.save(tissue12);
        tissuestore.save(tissue13);
        tissuestore.save(tissue14);
        tissuestore.save(tissue15);
        tissuestore.save(tissue16);
        tissuestore.save(tissue17);
        tissuestore.save(tissue18);
        tissuestore.save(tissue19);
        tissuestore.save(tissue20);

        tissuestore.display();
    }
}