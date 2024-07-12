package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	
	//DO NOT ADD getCardsInHand() method
	protected List<Card> cardsInHand;
	
	public AbstractHand() {
		this.cardsInHand = new ArrayList<>();
	}
	
	public abstract int getHandValue();
	
	//TODO addCard(Card card) and clear() need to be added
	

}
