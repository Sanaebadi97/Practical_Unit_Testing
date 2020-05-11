package info.sanaebadi.practicalunittest

import info.sanaebadi.ch4.FootballTeam
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FootballTeamTest {

    companion object {
        const val THERE_GAMES_WON = 3
    }

    fun nbOfGamesWon(): Array<Any> {
        return `$`(0, 1, 2)
    }

    @Test
    fun constructorShouldSetGamesWon() {
        val team = FootballTeam(THERE_GAMES_WON)
        assertEquals(
            THERE_GAMES_WON,
            team.gamesWon,
            "3 games passed to contractor , but ${team.gamesWon} , were returned $THERE_GAMES_WON , ${team.gamesWon}"
        )


    }
}