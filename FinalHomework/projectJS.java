import java.awt.*;


public class projectJS

{

public static final Color darkGreen = new Color(0, 128, 0),

lightYellow = new Color(255, 255, 12);

public static WinningsPanel winningsPanel =new WinningsPanel();

public static BoardPanel boardPanel =

new BoardPanel();;


public static void main(String[] args)

{

GameFrame frame = new GameFrame("Card Game of War",

boardPanel, winningsPanel);


frame.display();

}

}