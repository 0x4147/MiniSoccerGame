package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.players.GamePlayer;

class PlayerStatisticsTest {

	@Test
	/**
	 * Tests setter and getter of the PlayerStatstic class
	 */
	void testSetGetPlayerStats() {
		PlayerFactory playerFactory = new PlayerFactory();
		GamePlayer player1 = playerFactory.getPlayer("striker");
		player1.setPlayerStatistics(3);
		System.out.println(player1.toString());
		assertEquals(3, player1.getPlayerStatistics());
	}
}
