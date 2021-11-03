package model;

import java.awt.Color;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

public class PlayerFactory {

	public GamePlayer getPlayer(String playerType){
		if(playerType.equals("striker")) {
			
			return new Striker("Striker", new Color(0,0,102));
			
		}
		else if(playerType.equals("goalkeeper")) {
			
			return new Goalkeeper("Goalkeeper", new Color(255,255,0));
			
		}
		else {
			return null;
		}
	}
}
