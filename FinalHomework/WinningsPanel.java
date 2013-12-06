import java.awt.*;

import java.awt.event.*;

import javax.swing.*;



class WinningsPanel extends JPanel implements ItemListener

{

private static final int GAP = 20, TEXT_WIDTH = 20;

private static final Font winningsFont =

new Font("Sans Serif", Font.BOLD, 14);

private JTextField winnings = new JTextField(TEXT_WIDTH),

message = new JTextField(TEXT_WIDTH);

private JPanel betPanel = new JPanel();

private JRadioButton bet50 = new JRadioButton("$50", false),

bet100 = new JRadioButton("$100", true),

bet150 = new JRadioButton("$150", false);

private ButtonGroup betGroup = new ButtonGroup();

private int bet = 100, winningsAmount = 1000;


public WinningsPanel()

{

JLabel betLabel = new JLabel("Bet");


setBackground(Color.green);

setLayout(new BorderLayout(GAP, GAP));

winnings.setFont(winningsFont);

winnings.setHorizontalAlignment(JTextField.CENTER) ;

winnings.setText("Winnings = $ " + winningsAmount);

message.setFont(winningsFont);

message.setHorizontalAlignment(JTextField.CENTER);

betGroup.add(bet50);

betGroup.add(bet100);

betGroup.add(bet150);

betLabel.setFont(winningsFont);

bet50.setFont(winningsFont);

bet100.setFont(winningsFont);

bet150.setFont(winningsFont);

bet50.addItemListener(this);

bet100.addItemListener(this);

bet150.addItemListener(this);

betPanel.add(betLabel);

betPanel.add(bet50);

betPanel.add(bet100);

betPanel.add(bet150);

add(betPanel, BorderLayout.NORTH);

add(winnings, BorderLayout.CENTER);

add(message, BorderLayout.SOUTH);

}

public void clearMessage()

{

message.setText("");

}

public void init()

{

bet = 100;

bet100.setSelected(true);

winningsAmount = 1000;

winnings.setText("Winnings = $ " + winningsAmount);

message.setText("");

}

public void itemStateChanged(ItemEvent event)

{

Object object = event.getSource();


if (object == bet50)

bet = 50;

else if (object == bet100)

bet = 100;

else if (object == bet150)

bet = 150;

}

public void updateWinnings(Players winner)

{

winningsAmount = winner.pay(winningsAmount, bet);

winnings.setText("Winnings = $ " + winningsAmount);

message.setText(winner.toString() + " wins");

}

}

