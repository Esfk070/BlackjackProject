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
		hand.addCard(card);
	}
	
	public int getHandValue() {
		return hand.getHandValue();
	}
	
	public boolean getIsBlackJack()
	{
		return hand.isBlackjack();
	}
	
	public boolean getIsBust()
	{
		return hand.isBust();
	}


	@Override
	public String toString() {
		
		
		return hand.toString();
	}





//	@Override
//	public String toString() {
//		System.out.println("Player to string called?");
//		return "Player [hand=" + hand + "]";
//		
//	}
	
	
	
	
	
}
