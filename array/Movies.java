class Movies {

    String title;
    String director;
    String genre;
    boolean isHit;
    int duration;
    double budget;
    String language;
    String hero;
    double rating;
    boolean isReleased;

    Movies(String title, String director, String genre, boolean isHit,
           int duration, double budget, String language,
           String hero, double rating, boolean isReleased) {

        this.title = title;
        this.director = director;
        this.genre = genre;
        this.isHit = isHit;
        this.duration = duration;
        this.budget = budget;
        this.language = language;
        this.hero = hero;
        this.rating = rating;
        this.isReleased = isReleased;
    }

    void display() {
        System.out.println(title+" "+director+" "+genre+" "+isHit+" "+duration+" "+budget+" "+language+" "+hero+" "+rating+" "+isReleased);
    }
}
