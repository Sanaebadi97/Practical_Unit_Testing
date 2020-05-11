package info.sanaebadi.practicalunittest

import info.sanaebadi.ch4.FootballTeam
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FootballTeamTest {

    @Test
    fun constructorShouldSetGamesWon() {
        val team = FootballTeam(0)
        assertEquals(
            3,
            team.gamesWon,
            "3 games passed to contractor , but ${team.gamesWon} , were returend , 3, ${team.gamesWon}"
        )


    }
}