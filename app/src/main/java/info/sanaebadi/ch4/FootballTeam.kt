package info.sanaebadi.ch4
data class FootballTeam(val gamesWon: Int) : Comparable<FootballTeam> {

    override fun compareTo(footballTeam: FootballTeam): Int {
        return 0
    }

}