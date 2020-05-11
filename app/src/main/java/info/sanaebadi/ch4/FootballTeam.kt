package info.sanaebadi.ch4

data class FootballTeam(val gamesWon: Array<Int>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FootballTeam

        if (!gamesWon.contentEquals(other.gamesWon)) return false

        return true
    }

    override fun hashCode(): Int {
        return gamesWon.contentHashCode()
    }

}