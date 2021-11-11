package com.cursomicroservices.domain;

import java.util.Set;

public class Team {
	
	String name;
	String location;
	String mascotte;
	Set<Player> players;
	public Team(String name, String location, String mascotte, Set<Player> players) {
		super();
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
}
