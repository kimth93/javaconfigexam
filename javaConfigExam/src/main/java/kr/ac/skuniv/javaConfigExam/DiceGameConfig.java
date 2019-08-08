package kr.ac.skuniv.javaConfigExam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiceGameConfig {
	@Bean
	public Dice dice() {
		return new Dice(6);
		
	}
	@Bean
	public List<Player> diceplayers(Dice dice) {
		
		List<Player> list = new ArrayList<>();
		
		Player kim = new Player();
		kim.setName("김태희");
		kim.setDice(dice);
		list.add(kim);
		
		Player lee = new Player();
		lee.setName("이순신");
		lee.setDice(dice);
		list.add(lee);
		
		Player hong = new Player();
		hong.setName("홍길동");
		hong.setDice(dice);
		list.add(hong);
		
		return list;

	} 
	
	@Bean
	public Game game(List<Player> diceplayers) {
		Game game = new Game();
		
		game.setList(diceplayers);
		
		return game;
		
		
	}
}
