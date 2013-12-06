import java.awt.*;

import javax.swing.*;


class Card extends JPanel implements Comparable<Card>

{

public static final int WIDTH = 60, HEIGHT = 80;

private Rank rank;

private Suits suit;

private CardOrientation orientation;


public Card(int cardOrdinal)

{

setCard(cardOrdinal);

}

public int compareTo(Card otherCard)

{

return rank.compareTo(otherCard.rank);

}

public Dimension getMinimumSize()

{

return getPreferredSize();

}

public Dimension getPreferredSize()

{

return new Dimension(WIDTH, HEIGHT);

}

public void paintComponent(Graphics graphics)

{

super.paintComponent(graphics);

orientation.draw(graphics, suit, rank);

}

public void setCard(int cardOrdinal)

{

int suitOrdinal = cardOrdinal / Rank.values().length;

int rankOrdinal = cardOrdinal % Rank.values().length;


this.rank = Rank.aRank(rankOrdinal);

this.suit = Suits.aSuit(suitOrdinal);;

orientation = CardOrientation.FACE_DOWN;

}

public void turnFaceUp()

{

orientation = CardOrientation.FACE_UP;

repaint();

}

}