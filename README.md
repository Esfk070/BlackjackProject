# BlackjackProject

## Overview

* Running App instructions
    * Press play button in eclipse	
    * Inital hands are read out in console
    * Enter into console 1 for hit or 2 for stay
    * If hit is pressed new user score is read out and game is ended if player busts
    * when player presses 2 for stay Dealer plays turn
    * dealer and users scores are read out and winner is declared
	* Program ends
* Rank and Suit enum
    * Used to create Suits and card numbers for each card
 * Card
    * Concrete class used to instantiate cards. contains Rank and Suit fields, getValue method,  toString method, and hashCode and equals methods
   
 * Deck
    * Instantiates a deck and fills it with a full compliment of cards with resetDeck method (which is instantiated in the constructor)
    * contains checkDeckSize() which returns the number of cards remaining in deck
    * dealCard method which returns the first card in cardList
    * shuffle method which reorders the cards in cardList
    * isEmpty method which returns if cardList is empty or not
   
 * AbstractHand and BlackjackHand
    * AbstractHand has a Card List representing the hand.  
    * AbstractHand has a addCard method that adds a card to the hand
    * AbstractHand has a clear method and a toString method
    * BlackJackHand has methods pertaining to rules of black jack (isBust and isBlackjack)
    * BlackJackHand has the toString that is used at the end of the program to call the cards in the hands

 * BlackJackApp
    * initiates the run method in its main method
    * gameOn is the boolean that keeps the while loop running until the game is declared over
    * Cards are drawn from the dealer and added to the player and dealers hand.
    * The program checks if the player has 21 and if they do the player is declared the winner and the program is ended
    * Another while loop is initiated to run the player and dealers turn.  The loop checks to see if the player busts or if the player decides to hold.  Additionally if the player gets 21 than the loop will break
     * The dealer play method is ran at the end of the player program.  It might be better for readability to put this program separately after the players turn method is complete.  This might improve readability
     * I elected to have the Dealer and Player turns methods within the BlackJackApp as the playerHitOrStay() method interacts with the scanner.  
  
## Technologies Used

* Java
* Object-Oriented Programming
   * Inheritance
   * Polymorphism
* Enumerated Types
* Eclipse
* Sublime

## Lessons Learned
* Developed my understanding of toString method.  Most difficulty from this project for me was printing the hand lists without access to a getHand method
* Use of Enumerated types in instances where constant objects are needed
* Deepened understanding of inheritance and difference between "has a" and "is a" relationships
