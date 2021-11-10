package model.players;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import model.players.GamePlayer;

public class PlayerCollection implements Iterable<GamePlayer>{
	
	private ArrayList<GamePlayer> playerList;
	
	public PlayerCollection() {
		playerList = new ArrayList<GamePlayer>();
	}
	
	public void add(GamePlayer player) {
		playerList.add(player);
	}
	
	public GamePlayer get(String name) {		
		for (GamePlayer player : playerList) {			
			if(player.playerName.equals(name)) {
				return player;
			}
		}
		return null;
	}

	public void sort() {
//		Collections.sort(playerList);
	}
	
	@Override
	public Iterator<GamePlayer> iterator() {
		return new PlayerCollectionIterator(playerList);
	}
}

