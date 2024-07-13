package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.AbstractHand;
import com.skilldistillery.cardgames.common.Card;

public class BlackJackHand extends AbstractHand{

	//HAS NO FIELDS
	
	
	public BlackJackHand()
	{
		
	}
	
	@Override
	public int getHandValue() {
		int score = 0;
		for (Card cd : cardsInHand)
		{
			score = score + cd.getValue();
		}

		return score;
	}
	
	public boolean isBlackjack()
	{
		boolean gameOver = false;
		if (this.getHandValue() == 21)
		{
			System.out.println("BlackJack!!");
			 gameOver = true;
		}
		else {
			gameOver = false;
		}
		
		return gameOver;
		
	}
	
	public boolean isBust()
	{
		
		boolean gameOver = false;
		if (this.getHandValue() > 21)
		{
			System.out.println("BUST! Player looses");
			 gameOver = true;
		}
		else {
			gameOver = false;
		}
		
		return gameOver;
	}
	
	
	
	//TODO add other methods 

}
