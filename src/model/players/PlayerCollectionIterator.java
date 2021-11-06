package model.players;

import java.util.ArrayList;
import java.util.Iterator;

public class PlayerCollectionIterator implements Iterator<GamePlayer>{

	ArrayList<GamePlayer> playerListINTERNAL = new ArrayList<GamePlayer>();
	int index = 0;
	
	public PlayerCollectionIterator(ArrayList<GamePlayer> playerList) {
		playerListINTERNAL = playerList;	
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
