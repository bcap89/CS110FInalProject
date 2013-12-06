class Dealer extends Players

{

public Dealer(Deck deck)

{

super ("Dealer", deck);

}

public int pay(int winnings, int bet)

{

return winnings - bet;

}

}