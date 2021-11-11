package com.cursomicroservices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cursomicroservices.domain.Player;
import com.cursomicroservices.domain.Team;

@Controller
public class HomeController {
	
	
	public ArrayList<Team> teams = new ArrayList<Team>();
	
	@PostConstruct
	public void init() {
		
		Set<Player> players= new HashSet();
		players.add(new Player("Charlie Brown","Pitcher"));
		players.add(new Player("Snoopy","Shorstop"));
		teams.add(new Team("California","US","Peanuts",players));
			
		
	}
	
	@RequestMapping("/team")
	public @ResponseBody Team equipo() {
		
		return teams.get(0);
		
	}
	
	@RequestMapping("/players")
	public @ResponseBody Set<Player> jugadores() {
		
		return teams.get(0).getPlayers();
		
	}
	
	@RequestMapping("/teams")
	public @ResponseBody ArrayList<Team> equipos(){
		
		return teams;
	}
	
	

}
