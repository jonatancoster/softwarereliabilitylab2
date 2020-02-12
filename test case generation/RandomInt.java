import java.util.Random;

public class RandomInt {
  public static void main(String args[]) {
    int r = 1000;
    Random random = new Random();

    System.out.println("A" + "\t" + "B" + "\t" + "C" + "\t" + "D" + "\t" + "E" + "\t" + "F" + "\t" + "G" + "\t" + "H" + "\t" + "I" + "\t" + "J" + "\t" + "K" + "\t" + "L" + "\t" + "M" + "\t" + "N" + "\t" + "O" + "\t" + "P" + "\t" + "Q" + "\t" + "R" + "\t" + "S");

    for(int i = 0; i < 500; i++) {
      
      for(int n = 0; n < 19; n++) {
        System.out.print(random.nextInt(r) + "\t");
      }
      System.out.print(random.nextInt(r) + "\n");
    }
  }

}