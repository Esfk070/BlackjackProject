package com.skilldistillery.cardgames.common;

import java.util.Objects;

public class Card {

	// FIELDS
	private Rank cardRank;
	private Suit suit;

	// CONSTRUCOTRS
	public Card(Rank cardRank, Suit suit) {
		super();
		this.cardRank = cardRank;
		this.suit = suit;
	}

	// GETTERS AND SETTERS
	public int getValue() {
		return this.cardRank.getValue();
	}

	// TO STRING
	@Override
	public String toString() {
		return cardRank + " of " + suit;
		// return "Card [suit=" + suit + ", rank=" + cardRank + "]";
	}

	// HASHCODE AND EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(cardRank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return cardRank == other.cardRank && suit == other.suit;
	}

}
