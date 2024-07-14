package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	
	//DO NOT ADD getCardsInHand() method
	protected List<Card> cardsInHand;
	
	public AbstractHand() {
		this.cardsInHand = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cardsInHand.add(card);
		
	}
	
	public void clear() {
		this.cardsInHand = new ArrayList<Card>();
		
	}
	
	@Override
	public String toString() {
		System.out.println("abstracthandtostring called out");
		String str = "Cards in Hand: ";
		for (Card cd: cardsInHand)
		{
			str = str + cd;
		}
		System.out.println("AbstractHandTOstrign is called");
		return str;
	}

	public abstract int getHandValue();
	
	//DONE addCard(Card card) and clear() need to be added
	

}
