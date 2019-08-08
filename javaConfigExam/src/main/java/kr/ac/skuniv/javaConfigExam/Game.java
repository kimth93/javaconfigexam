package kr.ac.skuniv.javaConfigExam;

import java.util.List;

public class Game {
	
	private List<Player> list;
	
	public Game() {
		System.out.println("Game 생성");
		
	}
	
	public void setList(List<Player> list) {
		this.list = list;
		
	}
	
	
	public void play() {
		System.out.println("game.play호출");
		for(Player player : list) {
			player.play();
			
		}
		
	}

}
