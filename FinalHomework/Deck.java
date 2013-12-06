class Deck

{

private static final int CARDS_IN_DECK = 52;

private int cards[];

private int nextCard;


public Deck()

{

shuffle();

}

public boolean isEmpty()

{

return nextCard == CARDS_IN_DECK;

}

public int deal()

{

return cards[nextCard++];

}

public void shuffle()

{

cards = Permutation.randomize(CARDS_IN_DECK);

nextCard = 0;

}

}

