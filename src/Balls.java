
public class Balls {

   enum Color {green, red};

   public static void main (String[] param) {
      // for debugging
   }

   public static void reorder (Color[] balls) {
      int punasepallilugeja = 0;

      // Kui palju punaseid palle seal on?
      for (int i = 0; i < balls.length; i++) {
         if (balls[i] == Color.red) {
            punasepallilugeja++;
         }
      }


      // Kui kõik pallid on rohelised või punased, siis tagasta need?
      if (punasepallilugeja == balls.length) {
         return;
      } else if (punasepallilugeja == 0) {
         return;
      }

      // Asendab pallid õigete värvide ja õige järjekorraga!
      for (int i = 0; i < punasepallilugeja; i++) {
         balls[i] = Color.red;
      }
      for (int i = punasepallilugeja; i < balls.length; i++) {
         balls[i] = Color.green;
      }
   }
}
