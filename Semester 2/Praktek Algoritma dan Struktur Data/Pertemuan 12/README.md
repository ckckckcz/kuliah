# <p align="center">Kuis 2</p>

<br><br>

<p align="center">
    <img src="./img/img6.png">
</p>

<br><br>

<p align="center">
    Nama : Riovaldo Alfiyan Fahmi Rahman <br>
    NIM : 2341720209 <br>
    Prodi : D4 Teknik Informatika <br>
    Kelas : TI 1B
</p>

<br><br>

---

## 1.1 Verifikasi Hasil Percobaan

- Code `Node.java`

```java
public class Node {
    Team team;
    Node next;
    Node prev;

    public Node(Team team) {
        this.team = team;
        this.next = null;
        this.prev = null;
    }
}
```

- Code `Team.java`

```java


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


```

- Code `England.java`

```java

public class England {
    Node head;
    Node tail;

    public England() {
        this.head = null;
        this.tail = null;
    }

    public void addTeam(Team team) {
        Node newNode = new Node(team);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node existingTeam = findTeam(team.name);
            if (existingTeam != null) {
                System.out.println("Team " + team.name + " sudah ada, silahkan masukkan nama team lain ");
                return;
            }

            Node current = head;
            while (current != null && current.team.points > team.points) {
                current = current.next;
            }
            if (current == head) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else if (current == null) {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            } else {
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void reorderTeams() {
        Node current = head;
        head = null;
        tail = null;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            current.prev = null;
            addTeam(current.team);
            current = next;
        }
    }

    public Node findTeam(String teamName) {
        Node current = head;
        while (current != null) {
            if (current.team.name.equalsIgnoreCase(teamName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printTable() {
        Node current = head;
        System.out.printf("%-20s %2s %2s %2s %2s %2s %2s %3s\n", "Team", "P", "W", "D", "L", "GF", "GA", "Pts");
        while (current != null) {
            System.out.println(current.team);
            current = current.next;
        }
    }
}

```

- Code `EnglandMain.java`

```java

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

```

- `Hasil Percobaan`

```

Pertandingan 1

Team                  P  W  D  L GF GA Pts
Liverpool             1  1  0  0  0  0   3
Tottenham Hotspur     1  1  0  0  1  3   3
Aston Villa           1  1  0  0  3  2   3
Newcastle United      1  1  0  0  0  0   3
Brentford             1  1  0  0  2  4   3
Fulham                1  1  0  0  4  1   3
Crystal Palace        1  1  0  0  0  4   3
Nottingham Forest     1  1  0  0  1  1   3
Bournemouth           1  1  0  0  0  3   3
Chelsea               1  0  1  0  1  3   1
Brighton              1  0  1  0  0  0   1
Leicester City        1  0  1  0  3  4   1
Wolverhampton         1  0  1  0  1  1   1
Burnley               1  0  1  0  3  2   1
Manchester United     1  0  0  1  1  2   0
Arsenal               1  0  0  1  0  3   0
Manchester City       1  0  0  1  0  4   0
West Ham United       1  0  0  1  1  4   0
Everton               1  0  0  1  4  3   0
Sheffield United      1  0  0  1  0  1   0
--------------------------------------------

Pertandingan 2

Team                  P  W  D  L GF GA Pts
Bournemouth           2  2  0  0  3  4   6
Nottingham Forest     2  2  0  0  1  5   6
Crystal Palace        2  2  0  0  3  7   6
Fulham                2  2  0  0  8  4   6
Aston Villa           2  2  0  0  7  5   6
Burnley               2  1  1  0  6  2   4
Chelsea               2  1  1  0  3  7   4
Sheffield United      2  1  0  1  0  5   3
Manchester City       2  1  0  1  4  6   3
Arsenal               2  1  0  1  1  3   3
Manchester United     2  1  0  1  2  4   3
Brentford             2  1  0  1  5  7   3
Newcastle United      2  1  0  1  4  2   3
Tottenham Hotspur     2  1  0  1  1  7   3
Liverpool             2  1  0  1  2  1   3
Wolverhampton         2  0  2  0  4  2   2
West Ham United       2  0  1  1  4  7   1
Leicester City        2  0  1  1  6  6   1
Brighton              2  0  1  1  2  3   1
Everton               2  0  0  2  5  7   0
--------------------------------------------

Pertandingan 3

Team                  P  W  D  L GF GA Pts
Aston Villa           3  3  0  0 10  6   9
Fulham                3  3  0  0 11  4   9
Crystal Palace        3  3  0  0  7  7   9
Nottingham Forest     3  3  0  0  5  6   9
Bournemouth           3  3  0  0  7  8   9
Liverpool             3  2  0  1  3  4   6
Tottenham Hotspur     3  2  0  1  2  9   6
Brentford             3  2  0  1  5  7   6
Manchester United     3  2  0  1  3  6   6
Sheffield United      3  2  0  1  2  5   6
Brighton              3  1  1  1  4  7   4
West Ham United       3  1  1  1  7  9   4
Newcastle United      3  1  1  1  4  6   4
Chelsea               3  1  1  1  7  8   4
Burnley               3  1  1  1  8  4   4
Everton               3  1  0  2  5  7   3
Arsenal               3  1  0  2  5  4   3
Manchester City       3  1  0  2  5  9   3
Leicester City        3  0  2  1 10  7   2
Wolverhampton         3  0  2  1  4  3   2
--------------------------------------------

Pertandingan 4

Team                  P  W  D  L GF GA Pts
Bournemouth           4  4  0  0 11  9  12
Aston Villa           4  3  1  0 12  8  10
Sheffield United      4  3  0  1  6  7   9
Brentford             4  3  0  1  6  7   9
Nottingham Forest     4  3  0  1  9  8   9
Crystal Palace        4  3  0  1 11 10   9
Fulham                4  3  0  1 11  8   9
Burnley               4  2  1  1  8  6   7
Brighton              4  2  1  1  5  9   7
Manchester United     4  2  0  2  6  8   6
Tottenham Hotspur     4  2  0  2  5  9   6
Liverpool             4  2  0  2  5  5   6
Leicester City        4  1  2  1 14  8   5
Everton               4  1  1  2  5  9   4
Chelsea               4  1  1  2 11  8   4
Newcastle United      4  1  1  2  7 10   4
West Ham United       4  1  1  2 10 11   4
Manchester City       4  1  0  3  6 11   3
Arsenal               4  1  0  3  9  8   3
Wolverhampton         4  0  2  2  8  3   2
--------------------------------------------

Pertandingan 5

Team                  P  W  D  L GF GA Pts
Bournemouth           5  5  0  0 12 10  15
Aston Villa           5  4  1  0 15 10  13
Fulham                5  4  0  1 15  8  12
Nottingham Forest     5  4  0  1 13  8  12
Brentford             5  4  0  1  7 11  12
Sheffield United      5  4  0  1  8 11  12
Crystal Palace        5  3  0  2 15 12   9
Leicester City        5  2  2  1 18  8   8
Brighton              5  2  2  1  8 10   8
West Ham United       5  2  1  2 12 13   7
Newcastle United      5  2  1  2 11 12   7
Everton               5  2  1  2  7 13   7
Tottenham Hotspur     5  2  1  2  9  9   7
Burnley               5  2  1  2 10  7   7
Arsenal               5  2  0  3 10  9   6
Liverpool             5  2  0  3  7  6   6
Manchester United     5  2  0  3  6  8   6
Manchester City       5  1  1  3  8 11   4
Chelsea               5  1  1  3 13  9   4
Wolverhampton         5  0  2  3 11  3   2
--------------------------------------------

Pertandingan 6

Team                  P  W  D  L GF GA Pts
Bournemouth           6  6  0  0 13 13  18
Brentford             6  5  0  1  8 12  15
Aston Villa           6  4  2  0 19 11  14
Fulham                6  4  1  1 16  8  13
Crystal Palace        6  4  0  2 17 12  12
Sheffield United      6  4  0  2 10 14  12
Nottingham Forest     6  4  0  2 13  8  12
Tottenham Hotspur     6  3  1  2  9 11  10
Everton               6  3  1  2  8 15  10
Liverpool             6  3  0  3 10 10   9
Brighton              6  2  3  1 12 13   9
Leicester City        6  2  3  1 20  8   9
Burnley               6  2  2  2 13  8   8
Newcastle United      6  2  2  2 15 13   8
West Ham United       6  2  2  2 14 13   8
Manchester City       6  2  1  3  9 15   7
Arsenal               6  2  1  3 13  9   7
Manchester United     6  2  0  4 10 12   6
Wolverhampton         6  1  2  3 12  5   5
Chelsea               6  1  1  4 14 11   4
--------------------------------------------

Pertandingan 7

Team                  P  W  D  L GF GA Pts
Bournemouth           7  7  0  0 13 15  21
Brentford             7  5  0  2 12 13  15
Fulham                7  4  2  1 17  8  14
Aston Villa           7  4  2  1 20 12  14
Everton               7  4  1  2 11 16  13
Sheffield United      7  4  1  2 11 17  13
Leicester City        7  3  3  1 20 11  12
Nottingham Forest     7  4  0  3 15 10  12
Crystal Palace        7  4  0  3 21 14  12
West Ham United       7  3  2  2 17 15  11
Burnley               7  3  2  2 16 12  11
Arsenal               7  3  1  3 15  9  10
Manchester City       7  3  1  3 10 18  10
Tottenham Hotspur     7  3  1  3  9 12  10
Manchester United     7  3  0  4 11 13   9
Newcastle United      7  2  3  2 17 17   9
Brighton              7  2  3  2 15 14   9
Liverpool             7  3  0  4 13 14   9
Chelsea               7  2  1  4 17 11   7
Wolverhampton         7  1  3  3 15  6   6
--------------------------------------------

Pertandingan 8

Team                  P  W  D  L GF GA Pts
Bournemouth           8  8  0  0 17 18  24
Aston Villa           8  5  2  1 20 16  17
Fulham                8  5  2  1 17  8  17
Everton               8  5  1  2 14 18  16
Crystal Palace        8  5  0  3 25 16  15
Brentford             8  5  0  3 14 16  15
Burnley               8  4  2  2 16 16  14
Tottenham Hotspur     8  4  1  3 11 14  13
Arsenal               8  4  1  3 15 12  13
Nottingham Forest     8  4  1  3 18 14  13
Sheffield United      8  4  1  3 12 19  13
Liverpool             8  4  0  4 15 16  12
Brighton              8  3  3  2 16 18  12
West Ham United       8  3  3  2 18 16  12
Leicester City        8  3  3  2 21 11  12
Manchester United     8  3  1  4 11 13  10
Manchester City       8  3  1  4 13 22  10
Newcastle United      8  2  3  3 20 18   9
Chelsea               8  2  2  4 21 14   8
Wolverhampton         8  1  3  4 15  8   6
--------------------------------------------

Pertandingan 9

Team                  P  W  D  L GF GA Pts
Bournemouth           9  8  1  0 18 21  25
Everton               9  6  1  2 16 18  19
Fulham                9  5  3  1 20  8  18
Aston Villa           9  5  3  1 21 18  18
Nottingham Forest     9  5  1  3 19 15  16
West Ham United       9  4  3  2 22 17  15
Brentford             9  5  0  4 15 16  15
Crystal Palace        9  5  0  4 27 20  15
Arsenal               9  4  2  3 15 13  14
Tottenham Hotspur     9  4  2  3 12 15  14
Burnley               9  4  2  3 19 19  14
Manchester United     9  4  1  4 13 17  13
Leicester City        9  3  4  2 23 15  13
Sheffield United      9  4  1  4 13 22  13
Newcastle United      9  3  3  3 20 22  12
Brighton              9  3  3  3 17 21  12
Liverpool             9  4  0  5 17 18  12
Manchester City       9  3  1  5 13 24  10
Chelsea               9  2  3  4 24 14   9
Wolverhampton         9  1  4  4 19  9   7
--------------------------------------------

Pertandingan 10

Team                  P  W  D  L GF GA Pts
Bournemouth          10  9  1  0 20 25  28
Fulham               10  6  3  1 24 11  21
Nottingham Forest    10  6  1  3 22 15  19
Aston Villa          10  5  4  1 21 21  19
Everton              10  6  1  3 19 21  19
Crystal Palace       10  6  0  4 31 22  18
Brentford            10  6  0  4 19 17  18
West Ham United      10  5  3  2 23 18  18
Tottenham Hotspur    10  5  2  3 13 17  17
Sheffield United     10  5  1  4 17 26  16
Manchester United    10  5  1  4 15 20  16
Brighton             10  4  3  3 20 21  15
Leicester City       10  3  5  2 25 17  14
Burnley              10  4  2  4 19 19  14
Arsenal              10  4  2  4 16 17  14
Manchester City      10  4  1  5 14 28  13
Liverpool            10  4  1  5 20 18  13
Newcastle United     10  3  4  3 24 24  13
Chelsea              10  2  4  4 25 15  10
Wolverhampton        10  1  5  4 23 12   8
--------------------------------------------

Pertandingan 11

Team                  P  W  D  L GF GA Pts
Bournemouth          11 10  1  0 22 26  31
Fulham               11  7  3  1 27 14  24
Everton              11  6  2  3 19 25  20
Aston Villa          11  5  5  1 22 24  20
West Ham United      11  5  4  2 27 21  19
Crystal Palace       11  6  1  4 35 22  19
Nottingham Forest    11  6  1  4 22 19  19
Tottenham Hotspur    11  5  3  3 15 20  18
Brentford            11  6  0  5 23 19  18
Burnley              11  5  2  4 21 20  17
Leicester City       11  4  5  2 28 17  17
Sheffield United     11  5  2  4 21 26  17
Liverpool            11  5  1  5 24 18  16
Brighton             11  4  4  3 21 23  16
Manchester United    11  5  1  5 17 24  16
Manchester City      11  4  2  5 17 30  14
Arsenal              11  4  2  5 17 20  14
Newcastle United     11  3  4  4 26 27  13
Chelsea              11  2  5  4 28 16  11
Wolverhampton        11  1  5  5 24 16   8
--------------------------------------------

Pertandingan 12

Team                  P  W  D  L GF GA Pts
Bournemouth          12 10  1  1 24 28  31
Fulham               12  8  3  1 31 16  27
Aston Villa          12  6  5  1 23 25  23
West Ham United      12  6  4  2 29 23  22
Brentford            12  7  0  5 24 22  21
Everton              12  6  3  3 20 29  21
Crystal Palace       12  6  2  4 38 24  20
Brighton             12  5  4  3 24 27  19
Liverpool            12  6  1  5 26 18  19
Nottingham Forest    12  6  1  5 25 19  19
Leicester City       12  4  6  2 29 18  18
Burnley              12  5  3  4 24 22  18
Tottenham Hotspur    12  5  3  4 15 23  18
Manchester United    12  5  2  5 19 28  17
Sheffield United     12  5  2  5 25 29  17
Newcastle United     12  4  4  4 28 28  16
Arsenal              12  4  2  6 17 21  14
Manchester City      12  4  2  6 19 34  14
Chelsea              12  2  6  4 28 19  12
Wolverhampton        12  2  5  5 28 19  11
--------------------------------------------

Pertandingan 13

Team                  P  W  D  L GF GA Pts
Bournemouth          13 10  2  1 26 31  32
Fulham               13  8  3  2 31 18  27
West Ham United      13  7  4  2 29 26  25
Everton              13  7  3  3 22 32  24
Brentford            13  8  0  5 25 25  24
Aston Villa          13  6  6  1 27 28  24
Nottingham Forest    13  7  1  5 29 19  22
Brighton             13  6  4  3 25 28  22
Burnley              13  6  3  4 25 26  21
Leicester City       13  5  6  2 29 21  21
Crystal Palace       13  6  3  4 41 25  21
Newcastle United     13  5  4  4 28 28  19
Tottenham Hotspur    13  5  4  4 15 24  19
Liverpool            13  6  1  6 27 21  19
Sheffield United     13  5  3  5 29 33  18
Manchester United    13  5  2  6 22 31  17
Arsenal              13  4  3  6 18 22  15
Manchester City      13  4  2  7 23 37  14
Chelsea              13  2  7  4 31 23  13
Wolverhampton        13  2  5  6 29 21  11
--------------------------------------------

Pertandingan 14

Team                  P  W  D  L GF GA Pts
Bournemouth          14 10  3  1 28 35  33
Fulham               14  9  3  2 33 18  30
Aston Villa          14  7  6  1 28 31  27
Brentford            14  9  0  5 27 25  27
Everton              14  8  3  3 25 36  27
West Ham United      14  7  5  2 32 27  26
Crystal Palace       14  7  3  4 41 29  24
Nottingham Forest    14  7  2  5 32 22  23
Liverpool            14  7  1  6 28 25  22
Tottenham Hotspur    14  6  4  4 16 25  22
Brighton             14  6  4  4 29 30  22
Leicester City       14  5  6  3 29 22  21
Burnley              14  6  3  5 27 29  21
Newcastle United     14  5  5  4 31 32  20
Sheffield United     14  5  4  5 29 33  19
Manchester City      14  5  2  7 26 40  17
Manchester United    14  5  2  7 24 32  17
Arsenal              14  4  3  7 22 24  15
Wolverhampton        14  3  5  6 29 24  14
Chelsea              14  2  7  5 34 24  13
--------------------------------------------

Pertandingan 15

Team                  P  W  D  L GF GA Pts
Bournemouth          15 11  3  1 31 36  36
Fulham               15 10  3  2 33 19  33
Everton              15  9  3  3 29 37  30
Aston Villa          15  8  6  1 29 33  30
Crystal Palace       15  8  3  4 44 29  27
West Ham United      15  7  6  2 36 30  27
Brentford            15  9  0  6 30 28  27
Liverpool            15  8  1  6 32 25  25
Burnley              15  7  3  5 30 30  24
Newcastle United     15  6  5  4 33 33  23
Brighton             15  6  5  4 31 30  23
Nottingham Forest    15  7  2  6 35 23  23
Leicester City       15  5  7  3 32 23  22
Tottenham Hotspur    15  6  4  5 18 28  22
Manchester United    15  6  2  7 27 35  20
Manchester City      15  6  2  7 26 41  20
Sheffield United     15  5  4  6 29 37  19
Wolverhampton        15  4  5  6 32 28  17
Arsenal              15  4  4  7 23 27  16
Chelsea              15  2  8  5 36 24  14
--------------------------------------------

Pertandingan 16

Team                  P  W  D  L GF GA Pts
Bournemouth          16 12  3  1 32 36  39
Fulham               16 11  3  2 36 19  36
Everton              16  9  4  3 31 40  31
West Ham United      16  8  6  2 39 32  30
Crystal Palace       16  9  3  4 45 33  30
Aston Villa          16  8  6  2 33 33  30
Brentford            16  9  1  6 32 32  28
Burnley              16  8  3  5 32 34  27
Brighton             16  7  5  4 31 30  26
Liverpool            16  8  2  6 36 26  26
Manchester City      16  7  2  7 27 43  23
Leicester City       16  5  8  3 35 23  23
Nottingham Forest    16  7  2  7 35 23  23
Newcastle United     16  6  5  5 34 35  23
Sheffield United     16  6  4  6 29 41  22
Tottenham Hotspur    16  6  4  6 18 32  22
Manchester United    16  6  3  7 30 35  21
Wolverhampton        16  5  5  6 34 31  20
Arsenal              16  4  5  7 26 30  17
Chelsea              16  2  9  5 39 28  15
--------------------------------------------

Pertandingan 17

Team                  P  W  D  L GF GA Pts
Fulham               17 12  3  2 37 19  39
Bournemouth          17 12  3  2 36 40  39
Everton              17 10  4  3 33 43  34
West Ham United      17  9  6  2 41 32  33
Crystal Palace       17  9  4  4 49 35  31
Aston Villa          17  8  6  3 37 36  30
Liverpool            17  9  2  6 36 28  29
Brighton             17  8  5  4 33 30  29
Brentford            17  9  1  7 32 35  28
Burnley              17  8  3  6 32 35  27
Leicester City       17  6  8  3 39 23  26
Manchester City      17  8  2  7 27 43  26
Tottenham Hotspur    17  7  4  6 18 35  25
Sheffield United     17  7  4  6 29 45  25
Newcastle United     17  6  6  5 37 37  24
Nottingham Forest    17  7  3  7 35 26  24
Manchester United    17  6  4  7 33 39  22
Wolverhampton        17  5  6  6 35 35  21
Arsenal              17  5  5  7 30 32  20
Chelsea              17  3  9  5 43 28  18
--------------------------------------------

Pertandingan 18

Team                  P  W  D  L GF GA Pts
Bournemouth          18 13  3  2 37 43  42
Fulham               18 13  3  2 41 19  42
Everton              18 11  4  3 33 45  37
West Ham United      18 10  6  2 41 32  36
Brighton             18  9  5  4 33 30  32
Crystal Palace       18  9  5  4 53 39  32
Brentford            18 10  1  7 32 37  31
Aston Villa          18  8  6  4 37 36  30
Liverpool            18  9  2  7 36 29  29
Sheffield United     18  8  4  6 31 47  28
Tottenham Hotspur    18  8  4  6 19 39  28
Burnley              18  8  4  6 33 36  28
Nottingham Forest    18  8  3  7 38 30  27
Manchester City      18  8  3  7 30 47  27
Leicester City       18  6  8  4 39 23  26
Wolverhampton        18  6  6  6 37 37  24
Newcastle United     18  6  6  6 41 37  24
Arsenal              18  6  5  7 34 36  23
Manchester United    18  6  5  7 35 43  23
Chelsea              18  4  9  5 46 31  21
--------------------------------------------

Pertandingan 19

Team                  P  W  D  L GF GA Pts
Bournemouth          19 14  3  2 39 46  45
Fulham               19 13  3  3 45 23  42
Everton              19 11  4  4 34 49  37
West Ham United      19 10  6  3 44 33  36
Crystal Palace       19 10  5  4 57 40  35
Brighton             19 10  5  4 34 32  35
Brentford            19 11  1  7 32 37  34
Liverpool            19 10  2  7 40 31  32
Burnley              19  9  4  6 33 39  31
Sheffield United     19  9  4  6 33 47  31
Aston Villa          19  8  7  4 41 37  31
Manchester City      19  9  3  7 31 48  30
Tottenham Hotspur    19  8  5  6 19 39  29
Nottingham Forest    19  8  4  7 38 31  28
Newcastle United     19  7  6  6 43 41  27
Leicester City       19  6  9  4 43 25  27
Manchester United    19  7  5  7 36 43  26
Arsenal              19  7  5  7 37 37  26
Chelsea              19  5  9  5 48 35  24
Wolverhampton        19  6  6  7 39 41  24
--------------------------------------------

Pertandingan 20

Team                  P  W  D  L GF GA Pts
Bournemouth          20 14  3  3 40 50  45
Fulham               20 13  3  4 46 27  42
Everton              20 12  4  4 36 52  40
West Ham United      20 11  6  3 47 35  39
Crystal Palace       20 11  5  4 57 42  38
Liverpool            20 11  2  7 40 31  35
Brighton             20 10  5  5 36 33  35
Burnley              20 10  4  6 37 42  34
Brentford            20 11  1  8 32 38  34
Tottenham Hotspur    20  9  5  6 23 41  32
Sheffield United     20  9  5  6 37 49  32
Manchester City      20  9  4  7 34 50  31
Aston Villa          20  8  7  5 45 41  31
Leicester City       20  7  9  4 44 29  30
Manchester United    20  8  5  7 40 44  29
Nottingham Forest    20  8  5  7 41 35  29
Wolverhampton        20  7  6  7 39 43  27
Chelsea              20  6  9  5 51 36  27
Arsenal              20  7  6  7 41 39  27
Newcastle United     20  7  6  7 45 45  27
--------------------------------------------

Pertandingan 21

Team                  P  W  D  L GF GA Pts
Bournemouth          21 15  3  3 42 50  48
Everton              21 13  4  4 37 52  43
Fulham               21 13  3  5 47 30  42
West Ham United      21 11  7  3 50 35  40
Crystal Palace       21 11  6  4 57 46  39
Brighton             21 10  6  5 39 36  36
Liverpool            21 11  3  7 44 35  36
Tottenham Hotspur    21 10  5  6 27 41  35
Burnley              21 10  5  6 41 45  35
Brentford            21 11  1  9 33 42  34
Sheffield United     21  9  6  6 39 53  33
Manchester City      21  9  5  7 35 53  32
Aston Villa          21  8  7  6 49 44  31
Chelsea              21  7  9  5 52 38  30
Nottingham Forest    21  8  6  7 41 38  30
Manchester United    21  8  6  7 43 46  30
Leicester City       21  7  9  5 44 30  30
Newcastle United     21  7  7  7 47 47  28
Arsenal              21  7  6  8 41 42  27
Wolverhampton        21  7  6  8 40 45  27
--------------------------------------------

Pertandingan 22

Team                  P  W  D  L GF GA Pts
Bournemouth          22 16  3  3 43 54  51
Fulham               22 13  4  5 51 31  43
Everton              22 13  4  5 38 53  43
Crystal Palace       22 12  6  4 58 46  42
West Ham United      22 11  7  4 51 36  40
Liverpool            22 12  3  7 44 35  39
Tottenham Hotspur    22 11  5  6 27 44  38
Brentford            22 12  1  9 37 45  37
Brighton             22 10  7  5 42 38  37
Sheffield United     22 10  6  6 42 53  36
Burnley              22 10  6  6 42 49  36
Aston Villa          22  9  7  6 49 46  34
Manchester United    22  9  6  7 44 48  33
Nottingham Forest    22  9  6  7 42 42  33
Manchester City      22  9  6  7 35 53  33
Leicester City       22  7 10  5 45 32  31
Chelsea              22  7 10  5 52 40  31
Arsenal              22  8  6  8 42 45  30
Wolverhampton        22  7  7  8 40 49  28
Newcastle United     22  7  7  8 48 49  28
--------------------------------------------

Pertandingan 23

Team                  P  W  D  L GF GA Pts
Bournemouth          23 16  3  4 44 54  51
Fulham               23 14  4  5 52 35  46
Crystal Palace       23 13  6  4 59 50  45
Everton              23 13  4  6 40 56  43
Liverpool            23 13  3  7 48 38  42
Tottenham Hotspur    23 12  5  6 28 44  41
Brighton             23 11  7  5 42 39  40
West Ham United      23 11  7  5 55 37  40
Burnley              23 11  6  6 45 52  39
Sheffield United     23 11  6  6 45 55  39
Aston Villa          23 10  7  6 52 49  37
Brentford            23 12  1 10 38 49  37
Nottingham Forest    23 10  6  7 42 45  36
Leicester City       23  8 10  5 46 36  34
Manchester United    23  9  7  7 47 52  34
Arsenal              23  9  6  8 46 48  33
Manchester City      23  9  6  8 39 57  33
Newcastle United     23  8  7  8 50 50  31
Wolverhampton        23  8  7  8 42 50  31
Chelsea              23  7 10  6 53 42  31
--------------------------------------------

Pertandingan 24

Team                  P  W  D  L GF GA Pts
Bournemouth          24 16  4  4 45 56  52
Crystal Palace       24 14  6  4 60 51  48
Fulham               24 14  4  6 52 39  46
Liverpool            24 14  3  7 49 41  45
Tottenham Hotspur    24 13  5  6 32 45  44
Everton              24 13  5  6 40 57  44
West Ham United      24 12  7  5 55 37  43
Burnley              24 12  6  6 48 53  42
Brentford            24 13  1 10 40 49  40
Brighton             24 11  7  6 44 42  40
Nottingham Forest    24 11  6  7 42 48  39
Sheffield United     24 11  6  7 45 55  39
Manchester United    24 10  7  7 50 55  37
Leicester City       24  9 10  5 48 38  37
Aston Villa          24 10  7  7 52 51  37
Manchester City      24 10  6  8 43 59  36
Arsenal              24 10  6  8 50 50  36
Chelsea              24  8 10  6 57 45  34
Wolverhampton        24  9  7  8 43 54  34
Newcastle United     24  8  8  8 52 51  32
--------------------------------------------

Pertandingan 25

Team                  P  W  D  L GF GA Pts
Bournemouth          25 17  4  4 45 57  55
Crystal Palace       25 15  6  4 62 55  51
Everton              25 14  5  6 44 60  47
Tottenham Hotspur    25 14  5  6 33 45  47
Liverpool            25 14  4  7 53 42  46
Fulham               25 14  4  7 52 40  46
West Ham United      25 12  8  5 56 40  44
Brighton             25 12  7  6 45 46  43
Brentford            25 14  1 10 43 49  43
Sheffield United     25 12  6  7 47 55  42
Nottingham Forest    25 12  6  7 45 51  42
Burnley              25 12  6  7 48 54  42
Leicester City       25 10 10  5 50 38  40
Arsenal              25 11  6  8 54 51  39
Chelsea              25  9 10  6 58 45  37
Manchester City      25 10  7  8 43 60  37
Aston Villa          25 10  7  8 52 55  37
Manchester United    25 10  7  8 53 55  37
Wolverhampton        25  9  7  9 46 55  34
Newcastle United     25  8  9  8 54 54  33
--------------------------------------------

Pertandingan 26

Team                  P  W  D  L GF GA Pts
Bournemouth          26 18  4  4 46 57  58
Crystal Palace       26 16  6  4 62 58  54
Tottenham Hotspur    26 15  5  6 35 45  50
Fulham               26 15  4  7 52 42  49
Liverpool            26 15  4  7 57 44  49
Everton              26 14  5  7 46 60  47
Brentford            26 15  1 10 44 51  46
Sheffield United     26 13  6  7 49 55  45
West Ham United      26 12  9  5 58 43  45
Leicester City       26 11 10  5 52 40  43
Brighton             26 12  7  7 46 49  43
Arsenal              26 12  6  8 55 51  42
Burnley              26 12  6  8 52 58  42
Nottingham Forest    26 12  6  8 45 51  42
Aston Villa          26 11  7  8 55 57  40
Manchester City      26 11  7  8 45 60  40
Chelsea              26 10 10  6 60 46  40
Manchester United    26 10  8  8 56 55  38
Wolverhampton        26 10  7  9 46 55  37
Newcastle United     26  9  9  8 54 55  36
--------------------------------------------

Pertandingan 27

Team                  P  W  D  L GF GA Pts
Bournemouth          27 19  4  4 49 61  61
Crystal Palace       27 16  6  5 62 60  54
Tottenham Hotspur    27 16  5  6 36 48  53
Liverpool            27 16  4  7 59 45  52
Brentford            27 16  1 10 47 51  49
Fulham               27 15  4  8 52 43  49
West Ham United      27 13  9  5 58 43  48
Everton              27 14  6  7 46 60  48
Brighton             27 13  7  7 46 53  46
Sheffield United     27 13  6  8 49 57  45
Leicester City       27 11 11  5 54 42  44
Chelsea              27 11 10  6 60 46  43
Nottingham Forest    27 12  7  8 47 51  43
Burnley              27 12  6  9 54 59  42
Arsenal              27 12  6  9 56 54  42
Manchester United    27 11  8  8 59 58  41
Manchester City      27 11  8  8 45 63  41
Wolverhampton        27 11  7  9 49 59  40
Aston Villa          27 11  7  9 56 58  40
Newcastle United     27  9 10  8 58 56  37
--------------------------------------------

Pertandingan 28

Team                  P  W  D  L GF GA Pts
Bournemouth          28 19  5  4 51 64  62
Tottenham Hotspur    28 17  5  6 37 52  56
Liverpool            28 17  4  7 60 47  55
Crystal Palace       28 16  6  6 63 61  54
Brentford            28 17  1 10 51 51  52
Fulham               28 15  5  8 54 45  50
Brighton             28 14  7  7 47 57  49
Everton              28 14  7  7 46 62  49
West Ham United      28 13  9  6 62 47  48
Sheffield United     28 13  7  8 49 61  46
Arsenal              28 13  6  9 57 56  45
Leicester City       28 11 12  5 54 46  45
Manchester City      28 12  8  8 47 64  44
Manchester United    28 12  8  8 60 58  44
Wolverhampton        28 12  7  9 53 60  43
Nottingham Forest    28 12  7  9 50 55  43
Chelsea              28 11 10  7 62 46  43
Burnley              28 12  6 10 58 59  42
Aston Villa          28 11  8  9 58 58  41
Newcastle United     28 10 10  8 58 59  40
--------------------------------------------

Pertandingan 29

Team                  P  W  D  L GF GA Pts
Bournemouth          29 19  5  5 55 66  62
Liverpool            29 18  4  7 62 50  58
Tottenham Hotspur    29 17  6  6 41 55  57
Crystal Palace       29 16  7  6 66 65  55
Brentford            29 17  2 10 54 53  53
Brighton             29 15  7  7 51 61  52
Fulham               29 15  5  9 55 47  50
West Ham United      29 13 10  6 66 47  49
Everton              29 14  7  8 50 64  49
Arsenal              29 14  6  9 61 56  48
Manchester City      29 13  8  8 50 65  47
Nottingham Forest    29 13  7  9 51 57  46
Sheffield United     29 13  7  9 50 61  46
Leicester City       29 11 12  6 56 46  45
Manchester United    29 12  8  9 61 60  44
Newcastle United     29 11 10  8 60 63  43
Burnley              29 12  7 10 61 60  43
Chelsea              29 11 10  8 64 50  43
Wolverhampton        29 12  7 10 55 63  43
Aston Villa          29 11  9  9 62 62  42
--------------------------------------------

Pertandingan 30

Team                  P  W  D  L GF GA Pts
Bournemouth          30 19  6  5 58 67  63
Liverpool            30 19  4  7 66 53  61
Tottenham Hotspur    30 18  6  6 42 55  60
Brentford            30 18  2 10 55 53  56
Brighton             30 16  7  7 55 61  55
Crystal Palace       30 16  7  7 68 69  55
Arsenal              30 15  6  9 64 59  51
Manchester City      30 14  8  8 53 67  50
Everton              30 14  8  8 50 67  50
Fulham               30 15  5 10 59 47  50
Sheffield United     30 14  7  9 52 63  49
Nottingham Forest    30 14  7  9 53 58  49
West Ham United      30 13 10  7 70 49  49
Newcastle United     30 12 10  8 63 65  46
Leicester City       30 11 12  7 57 48  45
Wolverhampton        30 12  8 10 57 63  44
Manchester United    30 12  8 10 63 64  44
Chelsea              30 11 10  9 68 50  43
Burnley              30 12  7 11 63 61  43
Aston Villa          30 11  9 10 66 62  42
--------------------------------------------

Pertandingan 31

Team                  P  W  D  L GF GA Pts
Bournemouth          31 20  6  5 61 69  66
Liverpool            31 20  4  7 68 54  64
Tottenham Hotspur    31 18  6  7 43 57  60
Brentford            31 18  3 10 55 53  57
Crystal Palace       31 16  8  7 71 69  56
Brighton             31 16  8  7 55 64  56
Everton              31 15  8  8 54 70  53
Manchester City      31 15  8  8 56 71  53
Nottingham Forest    31 15  7  9 54 62  52
Sheffield United     31 15  7  9 56 65  52
Fulham               31 15  6 10 63 48  51
Arsenal              31 15  6 10 65 60  51
Newcastle United     31 13 10  8 65 68  49
West Ham United      31 13 10  8 72 50  49
Manchester United    31 13  8 10 65 64  47
Wolverhampton        31 13  8 10 61 66  47
Burnley              31 13  7 11 67 64  46
Aston Villa          31 12  9 10 68 62  45
Leicester City       31 11 12  8 59 48  45
Chelsea              31 11 10 10 70 52  43
--------------------------------------------

Pertandingan 32

Team                  P  W  D  L GF GA Pts
Liverpool            32 21  4  7 71 54  67
Bournemouth          32 20  6  6 61 70  66
Tottenham Hotspur    32 19  6  7 43 61  63
Brentford            32 19  3 10 59 53  60
Brighton             32 16  9  7 58 67  57
Crystal Palace       32 16  9  7 73 71  57
Manchester City      32 16  8  8 56 71  56
Arsenal              32 16  6 10 66 60  54
Everton              32 15  9  8 58 70  54
Sheffield United     32 15  8  9 59 66  53
Nottingham Forest    32 15  8  9 57 62  53
West Ham United      32 14 10  8 76 52  52
Newcastle United     32 14 10  8 68 68  52
Fulham               32 15  6 11 65 49  51
Wolverhampton        32 14  8 10 63 67  50
Manchester United    32 14  8 10 68 64  50
Burnley              32 14  7 11 69 65  49
Aston Villa          32 13  9 10 68 66  48
Chelsea              32 12 10 10 70 54  46
Leicester City       32 11 13  8 63 52  46
--------------------------------------------

Pertandingan 33

Team                  P  W  D  L GF GA Pts
Bournemouth          33 20  7  6 62 70  67
Liverpool            33 21  4  8 73 55  67
Tottenham Hotspur    33 20  6  7 43 63  66
Brentford            33 19  3 11 63 54  60
Manchester City      33 17  8  8 57 73  59
Everton              33 16  9  8 58 74  57
Crystal Palace       33 16  9  8 76 71  57
Brighton             33 16  9  8 62 71  57
Sheffield United     33 16  8  9 61 69  56
Newcastle United     33 15 10  8 70 68  55
Fulham               33 16  6 11 68 51  54
Nottingham Forest    33 15  9  9 59 65  54
Arsenal              33 16  6 11 66 61  54
Manchester United    33 15  8 10 68 65  53
West Ham United      33 14 10  9 80 55  52
Burnley              33 14  8 11 69 67  50
Wolverhampton        33 14  8 11 67 69  50
Leicester City       33 12 13  8 67 55  49
Aston Villa          33 13 10 10 69 68  49
Chelsea              33 12 11 10 70 54  47
--------------------------------------------

Pertandingan 34

Team                  P  W  D  L GF GA Pts
Bournemouth          34 21  7  6 64 74  70
Tottenham Hotspur    34 21  6  7 45 67  69
Liverpool            34 21  5  8 76 55  68
Brentford            34 20  3 11 67 58  63
Manchester City      34 18  8  8 59 74  62
Crystal Palace       34 17  9  8 80 75  60
Everton              34 17  9  8 58 75  60
Newcastle United     34 16 10  8 72 68  58
Arsenal              34 17  6 11 66 65  57
Fulham               34 17  6 11 68 53  57
Sheffield United     34 16  9  9 64 73  57
Brighton             34 16  9  9 63 71  57
Manchester United    34 15  9 10 70 69  54
Nottingham Forest    34 15  9 10 63 66  54
West Ham United      34 14 11  9 84 57  53
Wolverhampton        34 14  9 11 71 73  51
Burnley              34 14  9 11 72 71  51
Aston Villa          34 13 11 10 69 69  50
Leicester City       34 12 13  9 70 55  49
Chelsea              34 12 12 10 70 54  48
--------------------------------------------

Pertandingan 35

Team                  P  W  D  L GF GA Pts
Tottenham Hotspur    35 22  6  7 45 70  72
Bournemouth          35 21  7  7 65 76  70
Liverpool            35 21  6  8 76 56  69
Brentford            35 21  3 11 67 59  66
Manchester City      35 18  9  8 59 77  63
Arsenal              35 18  6 11 69 66  60
Everton              35 17  9  9 58 75  60
Crystal Palace       35 17  9  9 80 77  60
Newcastle United     35 16 11  8 75 72  59
Fulham               35 17  7 11 71 56  58
Brighton             35 16  9 10 64 72  57
Sheffield United     35 16  9 10 64 73  57
West Ham United      35 15 11  9 88 59  56
Nottingham Forest    35 15 10 10 66 69  55
Manchester United    35 15  9 11 72 70  54
Burnley              35 14 10 11 73 74  52
Chelsea              35 13 12 10 72 56  51
Wolverhampton        35 14  9 12 73 77  51
Leicester City       35 12 14  9 73 56  50
Aston Villa          35 13 11 11 71 70  50
--------------------------------------------

Pertandingan 36

Team                  P  W  D  L GF GA Pts
Tottenham Hotspur    36 23  6  7 49 70  75
Bournemouth          36 21  8  7 68 77  71
Brentford            36 22  3 11 71 60  69
Liverpool            36 21  6  9 77 60  69
Crystal Palace       36 18  9  9 80 79  63
Manchester City      36 18  9  9 60 79  63
Arsenal              36 18  7 11 72 69  61
Brighton             36 17  9 10 66 73  60
Everton              36 17  9 10 58 77  60
Newcastle United     36 16 11  9 79 75  59
Nottingham Forest    36 16 10 10 69 73  58
Fulham               36 17  7 12 75 57  58
Manchester United    36 16  9 11 72 72  57
West Ham United      36 15 12  9 90 62  57
Sheffield United     36 16  9 11 67 74  57
Burnley              36 15 10 11 77 75  55
Chelsea              36 14 12 10 76 59  54
Aston Villa          36 14 11 11 71 72  53
Wolverhampton        36 14 10 12 74 80  52
Leicester City       36 12 15  9 76 60  51
--------------------------------------------

Pertandingan 37

Team                  P  W  D  L GF GA Pts
Tottenham Hotspur    37 23  6  8 51 70  75
Bournemouth          37 21  8  8 68 78  71
Liverpool            37 21  7  9 79 62  70
Brentford            37 22  3 12 73 63  69
Crystal Palace       37 19  9  9 80 83  66
Everton              37 18  9 10 62 78  63
Manchester City      37 18  9 10 61 83  63
Newcastle United     37 17 11  9 80 76  62
Brighton             37 17 10 10 70 75  61
Arsenal              37 18  7 12 75 73  61
Sheffield United     37 17  9 11 69 75  60
West Ham United      37 16 12  9 92 65  60
Fulham               37 17  8 12 75 59  59
Manchester United    37 16 10 11 73 72  58
Nottingham Forest    37 16 10 11 71 75  58
Chelsea              37 15 12 10 80 62  57
Wolverhampton        37 15 10 12 78 84  55
Burnley              37 15 10 12 81 77  55
Leicester City       37 13 15  9 77 64  54
Aston Villa          37 14 12 11 75 73  54
--------------------------------------------

Pertandingan 38

Team                  P  W  D  L GF GA Pts
Tottenham Hotspur    38 23  6  9 51 73  75
Bournemouth          38 21  9  8 69 81  72
Liverpool            38 21  7 10 81 66  70
Crystal Palace       38 20  9  9 84 83  69
Brentford            38 22  3 13 73 65  69
Manchester City      38 19  9 10 64 83  66
Everton              38 19  9 10 62 82  66
Arsenal              38 19  7 12 77 75  64
Fulham               38 18  8 12 75 62  62
Brighton             38 17 11 10 70 77  62
Newcastle United     38 17 11 10 80 76  62
Manchester United    38 17 10 11 73 73  61
West Ham United      38 16 13  9 94 67  61
Sheffield United     38 17 10 11 70 77  61
Wolverhampton        38 16 10 12 81 84  58
Chelsea              38 15 13 10 83 66  58
Nottingham Forest    38 16 10 12 71 76  58
Leicester City       38 14 15  9 81 68  57
Burnley              38 15 11 12 83 80  56
Aston Villa          38 14 12 12 78 73  54
--------------------------------------------
```
