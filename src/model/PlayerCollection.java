package model;

import java.util.ArrayList;

import model.players.GamePlayer;

public class PlayerCollection {
	
	ArrayList<GamePlayer> playerList;
	
	public PlayerCollection() {
		playerList = new ArrayList<GamePlayer>();
	}
	
	void add(GamePlayer player) {
		playerList.add(player);
	}
	
	GamePlayer get(int player) {
		return playerList.get(player);
	}
	
}
