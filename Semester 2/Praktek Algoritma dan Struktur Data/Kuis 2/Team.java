
public class Team {
    String name;
    int played;
    int won;
    int drawn;
    int lost;
    int goalsFor;
    int goalsAgainst;
    int points;

    public Team(String name, int played, int won, int drawn, int lost, int goalsFor, int goalsAgainst, int points) {
        this.name = name;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("%-20s %2d %2d %2d %2d %2d %2d %3d", name, played, won, drawn, lost, goalsFor, goalsAgainst, points);
    }
}
