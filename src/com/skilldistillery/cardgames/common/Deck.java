package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cardList = new ArrayList<>();
	
	public Deck() {
		resetDeck();
		
	}
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
		
	}
	
//	public void howManyCardDoYouWant(int numOfCardsRequested)
//	{
//		if (numOfCardsRequested > 0 || numOfCardsRequested < 53)
//		{
//			for (int i = 0;i < numOfCardsRequested;i++)
//			{
//				System.out.println(cardList.get(0));
//				cardList.remove(0);
//				
//			}
//		}
//		else {
//			
//			System.out.println("ERROR");
//		}
//	
//	}
	
	public boolean isEmpty() {
		if(this.cardList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	

}
