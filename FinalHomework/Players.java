import java.awt.*;

import javax.swing.*;




abstract class Players extends JPanel

implements Comparable<Players>

{

public static final Font cardFont =

new Font("Helvetica", Font.BOLD, 16);

private static final int GAP = 10;

private JPanel innerPanel = new JPanel();

private Label label;

private Card card;

private String name;


public Players(String name, Deck deck)

{

this.name = name;

card = new Card(deck.deal());

setLayout(new BorderLayout(GAP, GAP));

setBackground(Color.green);

label = new Label(name, Label.CENTER);

label.setBackground(Color.white);

label.setFont(cardFont);

add(label, BorderLayout.NORTH);

innerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

innerPanel.setBackground(Color.green);

innerPanel.add(card);

add(innerPanel, BorderLayout.SOUTH);

}

public int compareTo(Players otherPlayer)

{

return card.compareTo(otherPlayer.card);

}

public void deal(Deck deck)

{

if (deck.isEmpty())

deck.shuffle();

card.setCard(deck.deal());

repaint();

}

abstract public int pay(int winnings, int bet);

public String toString()

{

return name;

}

public void turnFaceUp()

{

card.turnFaceUp();

}

}

