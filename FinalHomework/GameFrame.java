import java.awt.*;

import java.awt.event.*;

import javax.swing.*;



class GameFrame implements ActionListener

{

private static final int GAP = 20, WIDTH = 450, HEIGHT = 380;

private JFrame frame;

private JMenuItem newGameItem = new JMenuItem("New Game"),

shuffleItem = new JMenuItem("Shuffle"),

exitItem = new JMenuItem("Exit");

private BoardPanel boardPanel;

private WinningsPanel winningsPanel;


public GameFrame(String name, BoardPanel boardPanel,

WinningsPanel winningsPanel)

{

JMenu gameMenu = new JMenu("Game");

JMenuBar menuBar = new JMenuBar();;


this.boardPanel = boardPanel;

this.winningsPanel = winningsPanel;

frame = new JFrame(name);

frame.setSize(HEIGHT, WIDTH);

frame.getContentPane().setLayout(

new FlowLayout(FlowLayout.CENTER, GAP, GAP));

frame.getContentPane().setBackground(Color.green);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

gameMenu.add(newGameItem);

gameMenu.add(shuffleItem);

gameMenu.add(exitItem);

menuBar.add(gameMenu);

newGameItem.addActionListener(this);

shuffleItem.addActionListener(this);

exitItem.addActionListener(this);

frame.setJMenuBar(menuBar);

frame.setSize(WIDTH, HEIGHT);

frame.add(boardPanel, BorderLayout.NORTH);

frame.add(winningsPanel, BorderLayout.SOUTH);

}

public void actionPerformed(ActionEvent event)

{

Object object = event.getSource();


if (object == newGameItem)

{

boardPanel.shuffle();

winningsPanel.init();

frame.repaint();

}

else if (object == shuffleItem)

{

boardPanel.shuffle();

frame.repaint();

}

else if (object == exitItem)

frame.setVisible(false);

}

public void display()

{

frame.setVisible(true);

}

}