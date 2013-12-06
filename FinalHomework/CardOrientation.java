import java.awt.*;


enum CardOrientation

{

FACE_UP

{

void draw(Graphics graphics, Suits suit,

Rank rank)

{

drawBorder(graphics);

suit.drawSymbol(graphics);

graphics.setFont(rankFont);

graphics.drawString("" + rank.getSymbol(), 12, 43);

}

},

FACE_DOWN

{

void draw(Graphics graphics, Suits suit,

Rank rank)

{

graphics.setColor(projectJS.lightYellow);

graphics.fillRect(0, 0, Card.WIDTH, Card.HEIGHT);

graphics.setColor(projectJS.darkGreen);

for (int y = 10; y < Card.HEIGHT; y += 10)

graphics.drawLine(0, y, Card.WIDTH, y);

for (int x = 10; x < Card.WIDTH; x += 10)

graphics.drawLine(x, 0, x, Card.HEIGHT);

drawBorder(graphics);

graphics.setFont(backFont);

graphics.drawString("D", 20, 22);

graphics.drawString("J", 20, 44);

graphics.drawString("J", 20, 66);

}

};


private static final Font

rankFont = new Font("Serif", Font.BOLD, 24),

backFont = new Font("Serif", Font.ITALIC, 24);


abstract void draw(Graphics graphics, Suits suit,

Rank rank);

private static void drawBorder(Graphics graphics)

{

graphics.setColor(Color.BLACK);

graphics.drawRect(0, 0, Card.WIDTH - 1, Card.HEIGHT - 1);

graphics.drawRect(1, 1, Card.WIDTH - 3, Card.HEIGHT - 3);

}

}