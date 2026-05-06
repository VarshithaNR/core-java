class Crickets {

    String playerName;
    String team;
    int matches;
    int runs;
    boolean isBatsman;
    double average;
    String country;
    int wickets;
    double strikeRate;
    boolean isActive;

    Crickets(String playerName, String team, int matches, int runs,
             boolean isBatsman, double average, String country,
             int wickets, double strikeRate, boolean isActive) {

        this.playerName = playerName;
        this.team = team;
        this.matches = matches;
        this.runs = runs;
        this.isBatsman = isBatsman;
        this.average = average;
        this.country = country;
        this.wickets = wickets;
        this.strikeRate = strikeRate;
        this.isActive = isActive;
    }

    void display() {
        System.out.println(playerName+" "+team+" "+matches+" "+runs+" "+isBatsman+" "+average+" "+country+" "+wickets+" "+strikeRate+" "+isActive);
    }
}
