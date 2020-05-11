package info.sanaebadi.practicalunittest

import info.sanaebadi.ch4.FootballTeam
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

class FootballTeamTest {

    companion object {
        const val THERE_GAMES_WON = 3
    }

    private fun nbOfGamesWon(): Array<Int> {
        return `$`(0, 1, 2)
    }

    @Test
    @ParameterizedTest
    @MethodSource("nbOfGamesWon")
    fun constructorShouldSetGamesWon() {
        val team = FootballTeam(nbOfGamesWon())
        assertEquals(
            nbOfGamesWon(),
            team.gamesWon,
            "3 games passed to contractor , but ${team.gamesWon} , were returned $THERE_GAMES_WON , ${team.gamesWon}"
        )


    }
}