package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.AbstractHand;
import com.skilldistillery.cardgames.common.Card;

public class BlackJackHand extends AbstractHand{

	//HAS NO FIELDS
	
//	
//	public BlackJackHand()
//	{
//		
//	}
	
	@Override
	public int getHandValue() {
		int score = 0;
		for (Card cd : cardsInHand)
		{
			score = score + cd.getValue();
		}

		return score;
	}
	
	public BlackJackHand() {
		super();
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

//	@Override
//	public String toString() {
//		return "BlackJackHand [cardsInHand=" + cardsInHand + ", getHandValue()=" + getHandValue() + ", isBlackjack()="
//				+ isBlackjack() + ", isBust()=" + isBust() + ", toString()=" + super.toString() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + "]";
//	}

	@Override
	public String toString() {
		String str = "Hand contains: ";
		for (Card cd : cardsInHand)
		{
			
			str = str + cd.toString() + "    ";
		}
		return str;
	}
	
	
	
	//TODO add other methods 

}
