
class GloveRunner {
    public static void main(String... args){

        GloveStore glovestore = new GloveStore();

        Gloves glove1 = new Gloves("Puma","Sports","Leather",true,8,1200,"Black","Cricket",0.5,true);
        Gloves glove2 = new Gloves("Nike","Sports","Synthetic",true,9,1500,"Blue","Football",0.6,true);
        Gloves glove3 = new Gloves("Adidas","Casual","Cotton",false,7,800,"White","Daily",0.3,true);
        Gloves glove4 = new Gloves("Reebok","Gym","Rubber",true,8,1000,"Black","Workout",0.4,true);
        Gloves glove5 = new Gloves("Woodland","Winter","Wool",false,9,900,"Brown","Winter",0.7,true);
        Gloves glove6 = new Gloves("Wildcraft","Outdoor","Leather",true,10,1800,"Green","Trekking",0.8,true);
        Gloves glove7 = new Gloves("Decathlon","Sports","Synthetic",true,8,1100,"Black","Cycling",0.5,true);
        Gloves glove8 = new Gloves("HRX","Gym","Rubber",true,9,950,"Red","Workout",0.4,true);
        Gloves glove9 = new Gloves("AllenSolly","Casual","Cotton",false,7,700,"Gray","Daily",0.3,true);
        Gloves glove10 = new Gloves("Zara","Fashion","Leather",false,8,2000,"Black","Style",0.6,true);
        Gloves glove11 = new Gloves("Puma","Sports","Synthetic",true,9,1300,"Blue","Cricket",0.5,true);
        Gloves glove12 = new Gloves("Nike","Gym","Rubber",true,8,1400,"Black","Workout",0.4,true);
        Gloves glove13 = new Gloves("Adidas","Sports","Leather",true,10,1600,"White","Football",0.6,true);
        Gloves glove14 = new Gloves("Reebok","Casual","Cotton",false,7,750,"Gray","Daily",0.3,true);
        Gloves glove15 = new Gloves("Woodland","Winter","Wool",false,9,950,"Brown","Winter",0.7,true);
        Gloves glove16 = new Gloves("Wildcraft","Outdoor","Leather",true,10,1850,"Green","Trekking",0.8,true);
        Gloves glove17 = new Gloves("Decathlon","Sports","Synthetic",true,8,1150,"Black","Cycling",0.5,true);
        Gloves glove18 = new Gloves("HRX","Gym","Rubber",true,9,980,"Red","Workout",0.4,true);
        Gloves glove19 = new Gloves("AllenSolly","Casual","Cotton",false,7,720,"Gray","Daily",0.3,true);
        Gloves glove20 = new Gloves("Zara","Fashion","Leather",false,8,2100,"Black","Style",0.6,true);

        glovestore.save(glove1);
        glovestore.save(glove2);
        glovestore.save(glove3);
        glovestore.save(glove4);
        glovestore.save(glove5);
        glovestore.save(glove6);
        glovestore.save(glove7);
        glovestore.save(glove8);
        glovestore.save(glove9);
        glovestore.save(glove10);
        glovestore.save(glove11);
        glovestore.save(glove12);
        glovestore.save(glove13);
        glovestore.save(glove14);
        glovestore.save(glove15);
        glovestore.save(glove16);
        glovestore.save(glove17);
        glovestore.save(glove18);
        glovestore.save(glove19);
        glovestore.save(glove20);

        glovestore.display();
    }
}