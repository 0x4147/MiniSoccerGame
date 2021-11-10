package model;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

import controller.GameListener;
import controller.MenubarListener;
import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.PlayerCollection;
import view.GameMenuBar;
import view.GamePanel;

class SoccerGameTest {

	@Test
	void testSoccerGame() {
		SoccerGame game = new SoccerGame();
		game.automateGoalkeeper();
		PlayerCollection gamePlayers = game.getGamePlayers();
		
		game.setTimeRemaining(2);
		int n = game.getTimeRemaining();


		game.setGoal(3);
		int goal = game.getGoal();
		
		game.setPaused(true);
		boolean ispaused = game.isPaused();
		
		game.setOver(true);
		boolean isover = game.isOver();

		for (GamePlayer player : gamePlayers) {
			player.moveLeft();
			player.moveUp();
			player.moveDown();
			player.moveRight();
			player.shootBall();
			player = game.getActivePlayer();
		}
		boolean isscored = game.isScored();



	}
		
	@Test
	void testSoccerGame2() {
		SoccerGame game = new SoccerGame();
		game.automateGoalkeeper();
		PlayerCollection gamePlayers = game.getGamePlayers();
		int n = game.getTimeRemaining();
		game.setTimeRemaining(2);
		game.getGoal();
		game.setGoal(3);
		game.setPaused(false);
		boolean ispaused = game.isPaused();
		boolean isover = game.isOver();

		for (GamePlayer player : gamePlayers) {
			player.moveLeft();
			player.moveUp();
			player.moveDown();
			player.moveRight();
			player.shootBall();
			player = game.getActivePlayer();
		}
		boolean isscored = game.isScored();
		game.setOver(true);


	}
}
