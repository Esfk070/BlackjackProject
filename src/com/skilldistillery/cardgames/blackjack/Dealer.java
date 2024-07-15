package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player {

	// Already has a hand, because Dealer extends Player
	// DO NOT ADD A getDeck();
	private Deck deck = new Deck();

	public Dealer() {
		super();
		deck = new Deck();
	}

	// TODO add dealer specific behaviors
	public Card dealCard() {
		System.out.println("The dealer deals a card...");
		return deck.dealCard();
	}

	public void shuffle() {
		deck.shuffle();
	}

}
