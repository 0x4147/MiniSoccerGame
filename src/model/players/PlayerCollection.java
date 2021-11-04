package model.players;

import java.util.ArrayList;
import java.util.Iterator;

import model.players.GamePlayer;

public class PlayerCollection implements Iterable<GamePlayer>{
	
	ArrayList<GamePlayer> playerList;
	
	public PlayerCollection() {
		playerList = new ArrayList<GamePlayer>();
	}
	
	public void add(GamePlayer player) {
		playerList.add(player);
	}
	
	public GamePlayer get(String playerName) {		
		for (GamePlayer player : playerList) {			
			if(player.playerName.equals("striker")) {
				return player;
			}			
		}
		return null;
	}

//	public void sort() {
//		for (GamePlayer player : playerList) {			
//			if(player.playerName.equals("striker")) {
//				return player;
//			}			
//		}
//	}
	
	@Override
	public Iterator<GamePlayer> iterator() {
		return new PlayerCollectionIterator(playerList);
	}
}
