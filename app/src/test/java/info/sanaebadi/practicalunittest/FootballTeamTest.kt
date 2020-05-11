package info.sanaebadi.practicalunittest

import info.sanaebadi.ch4.FootballTeam
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FootballTeamTest {

    companion object {
        const val THERE_GAMES_WON = 3
        const val ANY_NUMBER = 123


//        fun nbOfGamesWon(): Array<Int> {
//            return arrayOf(0, 2, 2)
//        }
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

    @Test
    fun shouldBePossibleToCompareTeams() {
        val team = FootballTeam(ANY_NUMBER)
      //  Assertions.assertTrue(team is Comparable<*>, "FootballTeam should implement comparable ")
    }
}