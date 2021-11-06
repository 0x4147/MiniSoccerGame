package model.players;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.PlayerFactory;

class PlayerCollectionTest {

	@Test
	/**
	 * Test whether the players are being added into the collection
	 */
	void collectionAddTest() {
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
	@Test
	void gerPlayerTest() {
		PlayerCollection gamePlayers;
		PlayerFactory playerFactory = new PlayerFactory();
		gamePlayers = new PlayerCollection();
		gamePlayers.add(playerFactory.getPlayer("striker"));
		gamePlayers.add(playerFactory.getPlayer("goalkeeper"));
		GamePlayer pickedPlayer = gamePlayers.get("Striker");
		assertEquals("Striker", pickedPlayer.playerName);
	}
}
