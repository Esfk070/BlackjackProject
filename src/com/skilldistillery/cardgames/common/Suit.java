package com.skilldistillery.cardgames.common;

public enum Suit {
	
	HEARTS("Hearts"), 
	SPADES("Spades"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");
	
	private String name;
	
	private Suit (String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}	
}
//Create a public enum called Rank with the constants (in order) 
//TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE.

//Add a private value field to Rank.

//Add a one-arg constructor to Rank and set the value field to 2-10 for numbers, 10 for JACK, QUEEN, 
//and KING, and 11 for ACE.
//Add a getValue() method to return the value.