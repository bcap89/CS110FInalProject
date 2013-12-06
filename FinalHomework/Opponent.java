class Opponent extends Players

{

public Opponent(Deck deck)

{

super ("Opponent", deck);

}

public int pay(int winnings, int bet)

{

return winnings + bet;

}

}

