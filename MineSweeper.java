import java.util.Scanner;

public class MineSweeper{
  public static void main(String[] args){
    Sacnner scan = new Scanner(System.in);
    System.out.println("Choose your difficulty; |Easy| |Medium| |Hard|");
    String diffuclty = scan.nextLine();
    makeArr();
    while (gameon == true) {
      displayGame();
      askInput();
      arrNew();
    }
    System.out.println("Thanks for playing!");
    System.out.printn("Would you like to play again?");
    