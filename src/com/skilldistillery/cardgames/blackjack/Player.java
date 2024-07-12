package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;

public class Player {
	//Player HAS-A Hand
	//DO NOT ADD A getHand();
	private BlackJackHand hand;
	
	public Player() {
		this.hand = new BlackJackHand();
	}
	
	
	public void addCardToHand(Card card) {
		//hand.addCard(card)
	}
	
	public int getHandValue() {
		return hand.getHandValue();
	}
	
	
	
}
