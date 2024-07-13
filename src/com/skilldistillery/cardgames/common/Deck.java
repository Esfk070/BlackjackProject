package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// Properties
	List<Card> cardList = new ArrayList<>();
	
	// Constructor
	public Deck() {
		resetDeck();
		
	}
	
	// Methods
	public void resetDeck() {
		cardList = new ArrayList<>(52);
		for(Suit st : Suit.values())
		{
			for (Rank rk : Rank.values())
			{
				Card card = new Card(rk, st);
				cardList.add(card);				
			}
		}
	}
	
	public int checkDeckSize()
	{
		int numberOfCardsLeft = 0;
		
		numberOfCardsLeft = this.cardList.size();
		return numberOfCardsLeft;
	}
	public Card dealCard()
	{
		return cardList.remove(0);
	
	}
	public void shuffle()
	{
		Collections.shuffle(cardList);
		System.out.println("The dealer shuffles the deck...");
		
	}
	

	
	public boolean isEmpty() {
		if(this.cardList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	

}
