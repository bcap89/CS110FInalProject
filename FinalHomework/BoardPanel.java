import java.awt.*;

import java.awt.event.*;

import javax.swing.*;



class BoardPanel extends JPanel implements ActionListener

{

private static final int GAP = 20;

private Deck deck = new Deck();

private JPanel controls = new JPanel();

private Players dealer = new Dealer(deck),

opponent = new Opponent(deck);

private JButton deal = new JButton("Deal"),

play = new JButton("Play");


public BoardPanel()

{

setBackground(projectJS.darkGreen);

setLayout(new BorderLayout(GAP, GAP));

controls.setLayout(new FlowLayout(FlowLayout.CENTER, GAP, GAP));

controls.setBackground(projectJS.darkGreen);

controls.add(deal);

controls.add(play);

add(dealer, BorderLayout.WEST);

add(controls, BorderLayout.CENTER);

add(opponent, BorderLayout.EAST);

deal.addActionListener(this);

play.addActionListener(this);

deal.setEnabled(false);

}

public void actionPerformed(ActionEvent event)

{

Object object = event.getSource();


if (object == deal)

{

dealer.deal(deck);

opponent.deal(deck);

deal.setEnabled(false);

play.setEnabled(true);

winningsPanel.clearMessage();

repaint();

}

else if (object == play)

{

dealer.turnFaceUp();

opponent.turnFaceUp();

if (dealer.compareTo(opponent) >= 0)

winningsPanel.updateWinnings(dealer);

else

winningsPanel.updateWinnings(opponent);

deal.setEnabled(true);

play.setEnabled(false);

}

}

public void shuffle()

{

deck.shuffle();

dealer.deal(deck);

opponent.deal(deck);

deal.setEnabled(false);

play.setEnabled(true);

}

}