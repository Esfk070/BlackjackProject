package com.skilldistillery.cardgames.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgames.blackjack.Dealer;
import com.skilldistillery.cardgames.blackjack.Player;
import com.skilldistillery.cardgames.common.Card;

public class BlackJackApp {
	//NO List<Cards>
	//NO Deck
	
	private Player player = new Player();
	private Dealer dealer = new Dealer();
	Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		BlackJackApp blkJA = new BlackJackApp();
		
		blkJA.run();
	}



	private void run() {
		
		
		
		boolean gameOn = true;
		boolean playersTurn = true;
		
		while (gameOn)
		{
			dealer.shuffle();
			System.out.println("____________________________________________________");
			
			Card card1 = dealer.dealCard();
			player.addCardToHand(card1);
			
			Card card2 = dealer.dealCard();
			dealer.addCardToHand(card2);
			
			Card card3 = dealer.dealCard();
			player.addCardToHand(card3);
			
			Card card4 = dealer.dealCard();
			dealer.addCardToHand(card4);
			
			System.out.println("____________________________________________________");
			
			System.out.println("Players Hand: " + card1 + ", "+ card3);
			System.out.println("Player hand value: " + player.getHandValue());
			System.out.println("Dealers Hand: " + card2 + ", Face down card");
			
			System.out.println("____________________________________________________");

			if (player.getIsBlackJack())
			{
				gameOn = false;
				break;
			}
			
		
			while(!player.getIsBust() && playersTurn == true)
			{
				playersTurn = playerHitorStay(playersTurn);
				
				
			}
			
			
			
			gameOn = false;
			
		}

		
	System.out.println("End of Program");	
	}



	private boolean playerHitorStay(boolean playersTurn) {
		System.out.println("What would you like to do?");
		System.out.println("press 1 for hit");
		System.out.println("press 2 for stay");
		int choice = scanner.nextInt();
		
		if(choice == 2) {
			playersTurn = false;
			System.out.println("Player holds...");
			dealerTurn();
			return playersTurn;
		}
		
		else if (player.getHandValue()==21)
		{
			playersTurn = false;
			dealerTurn();
			return playersTurn;
			
			
		}
		else if (choice == 1 && player.getHandValue() < 21)
		{
			Card card = dealer.dealCard();
			player.addCardToHand(card);
			
			System.out.println("Players Draws a " + card);
			System.out.println("Player hand value: " + player.getHandValue());
			return playersTurn = false;
			
		
		}
	
		return false;
		
		
	}



	private void dealerTurn() {
		// TODO Auto-generated method stub
		System.out.println("dealerTurn");
		while (dealer.getHandValue() < 17)
		{
			System.out.println("Deader hand value "+ dealer.getHandValue());
			Card card = dealer.dealCard();

			dealer.addCardToHand(card);
			
			System.out.println("Dealer draws a  "+ card);
			System.out.println("Deader hand value "+ dealer.getHandValue());
		}
		
	}
	
	
	

}
