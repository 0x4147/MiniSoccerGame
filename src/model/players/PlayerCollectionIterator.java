package model.players;

import java.util.ArrayList;
import java.util.Iterator;

public class PlayerCollectionIterator implements Iterator<GamePlayer>{

	private ArrayList<GamePlayer> playerListINTERNAL;
	int index = 0;
	
	public PlayerCollectionIterator(ArrayList<GamePlayer> playerList) {
		this.playerListINTERNAL = new ArrayList<GamePlayer>();
		for(GamePlayer player : playerList) {
			this.playerListINTERNAL.add(player);
		}
		
	}	
	
	@Override
	public boolean hasNext() {
		return playerListINTERNAL.size() != index;
	}

	@Override
	public GamePlayer next() {
		GamePlayer next = playerListINTERNAL.get(index);
		index += 1;
		return next;
	}

}
