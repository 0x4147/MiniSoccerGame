package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.players.GamePlayer;
import model.players.PlayerCollection;

class PlayerFactoryTest {

	@Test
	/**
	 * Test whether a player is created by the player factory
	 */
	void isAPlayerCreated() {
		GamePlayer player1;
		GamePlayer player2;
		PlayerFactory playerFactory = new PlayerFactory();
		player1 = playerFactory.getPlayer("striker");
		player2 = playerFactory.getPlayer("goalkeeper");
		assertTrue((player1.getPlayerName().compareTo("Striker") == 0) && (player2.getPlayerName().compareTo("Goalkeeper") == 0));
	}
}
