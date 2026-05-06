
class BroccoliRunner {
    public static void main(String... args){

        BroccoliStore broccolistore = new BroccoliStore();

        Broccolis broccoli1 = new Broccolis("Green",1.2,"Fresh",true,10,120,"India","Mild",5.5,true);
        Broccolis broccoli2 = new Broccolis("Dark Green",1.5,"Organic",true,12,150,"USA","Strong",6.0,true);
        Broccolis broccoli3 = new Broccolis("Light Green",1.0,"Fresh",true,8,100,"Brazil","Mild",5.0,false);
        Broccolis broccoli4 = new Broccolis("Green",1.8,"Frozen",false,15,180,"Canada","Neutral",6.5,false);
        Broccolis broccoli5 = new Broccolis("Dark Green",1.3,"Organic",true,9,130,"India","Strong",5.8,true);
        Broccolis broccoli6 = new Broccolis("Green",1.6,"Fresh",true,11,140,"Mexico","Mild",6.2,false);
        Broccolis broccoli7 = new Broccolis("Light Green",0.9,"Fresh",true,7,90,"India","Mild",4.8,false);
        Broccolis broccoli8 = new Broccolis("Green",1.4,"Frozen",false,13,135,"Spain","Neutral",5.9,false);
        Broccolis broccoli9 = new Broccolis("Dark Green",1.7,"Organic",true,14,160,"Australia","Strong",6.3,true);
        Broccolis broccoli10 = new Broccolis("Green",1.9,"Fresh",true,16,190,"USA","Mild",6.7,true);
        Broccolis broccoli11 = new Broccolis("Light Green",1.1,"Fresh",true,8,110,"India","Mild",5.2,false);
        Broccolis broccoli12 = new Broccolis("Green",1.5,"Frozen",false,12,145,"Brazil","Neutral",6.0,false);
        Broccolis broccoli13 = new Broccolis("Dark Green",1.6,"Organic",true,13,155,"Mexico","Strong",6.1,true);
        Broccolis broccoli14 = new Broccolis("Green",2.0,"Fresh",true,18,200,"Canada","Mild",6.8,true);
        Broccolis broccoli15 = new Broccolis("Light Green",0.8,"Fresh",true,6,85,"India","Mild",4.5,false);
        Broccolis broccoli16 = new Broccolis("Green",1.3,"Frozen",false,10,125,"Australia","Neutral",5.7,false);
        Broccolis broccoli17 = new Broccolis("Dark Green",1.8,"Organic",true,15,170,"USA","Strong",6.4,true);
        Broccolis broccoli18 = new Broccolis("Green",2.1,"Fresh",true,19,210,"Spain","Mild",7.0,true);
        Broccolis broccoli19 = new Broccolis("Light Green",1.0,"Fresh",true,7,95,"India","Mild",5.0,false);
        Broccolis broccoli20 = new Broccolis("Green",1.7,"Frozen",false,14,165,"Brazil","Neutral",6.3,false);

        broccolistore.save(broccoli1);
        broccolistore.save(broccoli2);
        broccolistore.save(broccoli3);
        broccolistore.save(broccoli4);
        broccolistore.save(broccoli5);
        broccolistore.save(broccoli6);
        broccolistore.save(broccoli7);
        broccolistore.save(broccoli8);
        broccolistore.save(broccoli9);
        broccolistore.save(broccoli10);
        broccolistore.save(broccoli11);
        broccolistore.save(broccoli12);
        broccolistore.save(broccoli13);
        broccolistore.save(broccoli14);
        broccolistore.save(broccoli15);
        broccolistore.save(broccoli16);
        broccolistore.save(broccoli17);
        broccolistore.save(broccoli18);
        broccolistore.save(broccoli19);
        broccolistore.save(broccoli20);

        broccolistore.display();
    }
}