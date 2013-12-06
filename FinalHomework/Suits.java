import java.awt.*;


enum Suits

{

   CLUB
   {

      void drawSymbol(Graphics graphics)
      {

         int x1[] = {38, 33, 43};
         int y1[] = {38, 45, 45};
         graphics.setColor(Color.BLACK);
         graphics.fillOval(33, 25, 9, 9);
         graphics.fillOval(30, 31, 9, 9);
         graphics.fillOval(36, 31, 9, 9);
         graphics.fillPolygon(x1, y1, 3);

      }

   },

   DIAMOND
   {
      void drawSymbol(Graphics graphics)
      {

         int x1[] = {38, 31, 38, 45};
         int y1[] = {23, 33, 43, 33};
         graphics.setColor(Color.RED);
         graphics.fillPolygon(x1, y1, 4);
   
      }

   },

   HEART
   {
      void drawSymbol(Graphics graphics)
      {

         int x1[] = {31, 38, 45};
         int y1[] = {33, 43, 33};
         graphics.setColor(Color.RED);
         graphics.fillOval(30, 25, 9, 9);
         graphics.fillOval(36, 25, 9, 9);
         graphics.fillPolygon(x1, y1, 3);

      }

   },

   SPADE
   {
      void drawSymbol(Graphics graphics)
      {

         int x1[] = {38, 31, 45};
         int y1[] = {23, 33, 33};
         int x2[] = {38, 31, 43};
         int y2[] = {38, 45, 45};
         graphics.setColor(Color.BLACK);
         graphics.fillOval(30, 31, 9, 9);
         graphics.fillOval(36, 31, 9, 9);
         graphics.fillPolygon(x1, y1, 3);
         graphics.fillPolygon(x2, y2, 3);

      }

   };


   public static Suits aSuit(int ordinal)
   {

      return Suits.values()[ordinal];

   }

   abstract void drawSymbol(Graphics graphics);

}