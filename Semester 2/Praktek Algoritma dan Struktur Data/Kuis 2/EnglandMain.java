
import java.util.Random;
public class EnglandMain {
    private static final String[] TEAM_NAMES = {
            "Manchester United", "Liverpool", "Chelsea", "Arsenal", "Manchester City",
            "Tottenham Hotspur", "West Ham United", "Aston Villa", "Brighton", "Newcastle United",
            "Brentford", "Fulham", "Crystal Palace", "Everton", "Leicester City",
            "Wolverhampton", "Nottingham Forest", "Sheffield United", "Burnley", "Bournemouth"
    };
    private static final int TOTAL_MATCHES = 38;

    public static void main(String[] args) {
        England leagueTable = new England();
        Random random = new Random();

        // Menambahkan club dengan hasil default / awal 
        for (String teamName : TEAM_NAMES) {
            Team team = new Team(teamName, 0, 0, 0, 0, 0, 0, 0);
            leagueTable.addTeam(team);
        }

        // Proses program pertandingan dimulai
        for (int match = 1; match <= TOTAL_MATCHES; match++) {
            for (String teamName : TEAM_NAMES) {
                Team team = leagueTable.findTeam(teamName).team;

                int won = random.nextInt(2);
                int drawn = (won == 0) ? random.nextInt(2) : 0;
                int lost = (won == 0 && drawn == 0) ? 1 : 0;

                // Proses menaikan point statistik masing-masing club
                team.played += 1;
                team.won += won;
                team.drawn += drawn;
                team.lost += lost;
                team.goalsFor += random.nextInt(5);
                team.goalsAgainst += random.nextInt(5);

                // Menghitung poin yang didapat dari masing-masing team
                team.points = team.won * 3 + team.drawn;
            }

            // Proses seleksi / sorting berdasarkan poin yang diperbarui
            leagueTable.reorderTeams();

            System.out.println("");
            System.out.println("Pertandingan " + match);
            System.out.println("");
            leagueTable.printTable();
            System.out.println("--------------------------------------------");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}







// -R
