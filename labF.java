import java.io.*;
import java.util.*;

public class labF {
  public static void main(String args[]) {
    Scanner kbReader = new Scanner(System.in);

    // Challenge 2
    System.out.print("Type in your sport: ");
    String answer2= kbReader.nextLine();
    System.out.print("What's your favotie food: ");
    String answer4= kbReader.nextLine();
    System.out.print("Tyoe in a catch phrase: ");
    String answer6= kbReader.nextLine();    
    System.out.print("Pick a number between 500 an 1000: ");
    int answer5= kbReader.nextInt();    
    System.out.print("Pick a number between 1 and 100: ");
    int answer1 = kbReader.nextInt();
    System.out.print("Pick at decimal between 0 and 1: ");
    double answer3 = kbReader.nextDouble();
    int random = (int) (Math.random() * answer5) - answer1;
    System.out.println("You are " +answer2+ "man and you wear the number "+answer1+". One day when walking downtown you trip on this "+ answer4+" and you break your leg. "+"You lose "+ answer3+" percent of your power"+" This attracts "+random+" criminals who see this as a golden opportunity."+ " But they underestimate your skill. "+answer6+"!!! This scares off everyone and you live happliy ever after.");

    // Challenge 1
    System.out.print("Type a negative number: ");
    int a1 = kbReader.nextInt();
    System.out.print("Type a positie number that is greater than " + Math.abs(a1) + " : ");
    int a2 = kbReader.nextInt();
    a1 = -1 * a1;
    int a3 = a1 + a2;
    int ran = (int) (Math.random() * a3) - a1;
    int ran2 = (int) (Math.random()*100) - a1;
    System.out.println("You got a " + ran + " and a " + ran2);
  }
}