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
	void testGetPlayer() {
		GamePlayer player;
		PlayerFactory playerFactory = new PlayerFactory();
		player = playerFactory.getPlayer("striker");
		assertTrue(player.getPlayerName().compareTo("Striker") == 0);
	}
	
	@Test
	/**
	 * Test whether the players are being added into the collection
	 */
	void testPlayerCollection() {
		int nOfPlayers = 0;
		int playersExpected = 2;
		final PlayerCollection gamePlayers;
		PlayerFactory playerFactory = new PlayerFactory();
		gamePlayers = new PlayerCollection();
		gamePlayers.add(playerFactory.getPlayer("striker"));
		gamePlayers.add(playerFactory.getPlayer("goalkeeper"));
		for(GamePlayer players : gamePlayers) {
			nOfPlayers++;
		}
		assertEquals(playersExpected , nOfPlayers);
	}
}
