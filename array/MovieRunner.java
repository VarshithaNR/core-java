
class MovieRunner {
    public static void main(String... args){

        MovieStore moviestore = new MovieStore();

        Movies movie1 = new Movies("KGF","PrashanthNeel","Action",true,150,10000000,"Kannada","Yash",9.5,true);
        Movies movie2 = new Movies("RRR","Rajamouli","Action",true,180,20000000,"Telugu","NTR",9.8,true);
        Movies movie3 = new Movies("Pushpa","Sukumar","Action",true,160,12000000,"Telugu","AlluArjun",9.0,true);
        Movies movie4 = new Movies("Bahubali","Rajamouli","Epic",true,170,25000000,"Telugu","Prabhas",9.7,true);
        Movies movie5 = new Movies("Leo","Lokesh","Action",true,155,15000000,"Tamil","Vijay",8.8,true);
        Movies movie6 = new Movies("Jailer","Nelson","Action",true,145,13000000,"Tamil","Rajini",8.5,true);
        Movies movie7 = new Movies("Master","Lokesh","Action",true,150,14000000,"Tamil","Vijay",8.6,true);
        Movies movie8 = new Movies("Vikram","Lokesh","Action",true,160,16000000,"Tamil","Kamal",9.2,true);
        Movies movie9 = new Movies("Kantara","Rishab","Drama",true,140,8000000,"Kannada","Rishab",9.4,true);
        Movies movie10 = new Movies("Salaar","PrashanthNeel","Action",true,170,18000000,"Telugu","Prabhas",9.3,true);
        Movies movie11 = new Movies("Avengers","Russo","Superhero",true,180,30000000,"English","Ironman",9.6,true);
        Movies movie12 = new Movies("Batman","Nolan","Action",true,150,20000000,"English","Bale",9.5,true);
        Movies movie13 = new Movies("Spiderman","Watts","Superhero",true,140,18000000,"English","Tom",9.1,true);
        Movies movie14 = new Movies("Inception","Nolan","SciFi",true,150,22000000,"English","Leo",9.7,true);
        Movies movie15 = new Movies("Interstellar","Nolan","SciFi",true,170,25000000,"English","Cooper",9.8,true);
        Movies movie16 = new Movies("Dangal","Aamir","Drama",true,160,10000000,"Hindi","Aamir",9.3,true);
        Movies movie17 = new Movies("Pathaan","Siddharth","Action",true,150,14000000,"Hindi","SRK",8.9,true);
        Movies movie18 = new Movies("Jawan","Atlee","Action",true,155,15000000,"Hindi","SRK",9.0,true);
        Movies movie19 = new Movies("3Idiots","Hirani","Comedy",true,170,9000000,"Hindi","Aamir",9.6,true);
        Movies movie20 = new Movies("PK","Hirani","Comedy",true,150,9500000,"Hindi","Aamir",9.4,true);

        moviestore.save(movie1);
        moviestore.save(movie2);
        moviestore.save(movie3);
        moviestore.save(movie4);
        moviestore.save(movie5);
        moviestore.save(movie6);
        moviestore.save(movie7);
        moviestore.save(movie8);
        moviestore.save(movie9);
        moviestore.save(movie10);
        moviestore.save(movie11);
        moviestore.save(movie12);
        moviestore.save(movie13);
        moviestore.save(movie14);
        moviestore.save(movie15);
        moviestore.save(movie16);
        moviestore.save(movie17);
        moviestore.save(movie18);
        moviestore.save(movie19);
        moviestore.save(movie20);

        moviestore.display();
    }
}