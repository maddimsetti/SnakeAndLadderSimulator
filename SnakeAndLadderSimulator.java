package snakeandladder;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome the Player to Starts The Snake And Ladder Game at position 0");

		int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("The Value Of Dice is " +diceNumber);

	}

}
